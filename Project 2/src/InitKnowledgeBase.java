
public class InitKnowledgeBase 
{
	private int worldSize;
	private char perceptMap[][][];
	
	ClausesSet KB;
	
	boolean includeBS;
	boolean isRes;
	
	boolean runBadRule;
	
	public InitKnowledgeBase(ClausesSet KB, TransferPercept tp, boolean includeBS, boolean isRes)
	{
		this.includeBS = includeBS;
		this.isRes = isRes;
		this.runBadRule = false;
		
		this.KB = KB;
		this.worldSize = tp.getGridPercepts().getWorldSize();
		this.perceptMap = tp.getGridPercepts().getWumpusWorldObservation();
		this.init();
	}
	private void init()
	{
		insertBSGUnitClauses();
		insertBreezeBiimpliesPit();
		insertGlitterBiimpliesGold();
		insertReachesGoldBaseCase();
		insertReachesGoldRecursiveCase();
		
		if(includeBS)
		{
			insertStenchBiimpliesWumpus();
			insertSafeBiimpliesNoWumpusOrPit();
		}
		else
			insertSafeBiimpliesNoPit();
			
	}
	
	private void insertBSGUnitClauses()
	{
		Literal literal;
		for (int i = 0; i < this.worldSize; i++) 
			for (int j = 0; j < this.worldSize; j++) 
			{
				if(perceptMap[i][j][0] == 'B') literal = new Literal(i,j, "B", true);
				else literal = new Literal(i,j, "B", false);
				Clause breezeUnitClause = new Clause(literal);
				KB.add(breezeUnitClause);
				
				if(includeBS)
				{
					if(perceptMap[i][j][1] == 'S') literal = new Literal(i,j, "S", true);
					else literal = new Literal(i,j, "S", false);
					Clause stenchUnitClause = new Clause(literal);
					KB.add(stenchUnitClause);
				}
				
				if(perceptMap[i][j][2] == 'G') literal = new Literal(i,j, "G", true);
				else literal = new Literal(i,j, "G", false);
				Clause glitterUnitClause = new Clause(literal);
				KB.add(glitterUnitClause);	
			}	
	}
	
	private void insertBreezeBiimpliesPit()
	{
		for (int i = 0; i < this.worldSize; i++) 
			for (int j = 0; j < this.worldSize; j++) 
			{
				Literal Pip1f = new Literal(i+1,j, "P", false);
				Literal Pjp1f = new Literal(i,j+1, "P", false);
				Literal Pim1f = new Literal(i-1,j, "P", false);
				Literal Pjm1f = new Literal(i,j-1, "P", false);
				Literal Bt    = new Literal(i,j, "B", true);
				
				Literal Pip1t = new Literal(i+1,j, "P", true);
				Literal Pjp1t = new Literal(i,j+1, "P", true);
				Literal Pim1t = new Literal(i-1,j, "P", true);
				Literal Pjm1t = new Literal(i,j-1, "P", true);
				Literal Bf    = new Literal(i,j, "B", false);
				
				Clause b_is1   = new Clause(Bt);
				Clause b_is2   = new Clause(Bt);
				Clause b_is3   = new Clause(Bt);
				Clause b_is4   = new Clause(Bt);
				Clause b_isNot = new Clause(Bf);
				
				if(!(i == 0))
				{
					b_is1.add(Pim1f);
					KB.add(b_is1);
					b_isNot.add(Pim1t);
				}			
					
				if(!(j == 0))
				{	
					b_is2.add(Pjm1f);
					KB.add(b_is2);
					b_isNot.add(Pjm1t);
				}
					
				if (!(i == this.worldSize - 1))
				{
					b_is3.add(Pip1f);
					KB.add(b_is3);
					b_isNot.add(Pip1t);
				}
					
				if (!(j == this.worldSize - 1))
				{
					b_is4.add(Pjp1f);
					KB.add(b_is4);
					b_isNot.add(Pjp1t);
				}
				KB.add(b_isNot);			
			}
	}
	
	private void insertStenchBiimpliesWumpus()
	{
		for (int i = 0; i < this.worldSize; i++) 
			for (int j = 0; j < this.worldSize; j++) 
			{
				Literal Wip1f = new Literal(i+1,j, "W", false);
				Literal Wjp1f = new Literal(i,j+1, "W", false);
				Literal Wim1f = new Literal(i-1,j, "W", false);
				Literal Wjm1f = new Literal(i,j-1, "W", false);
				Literal St    = new Literal(i,j, "S", true);
				
				Literal Wip1t = new Literal(i+1,j, "W", true);
				Literal Wjp1t = new Literal(i,j+1, "W", true);
				Literal Wim1t = new Literal(i-1,j, "W", true);
				Literal Wjm1t = new Literal(i,j-1, "W", true);
				Literal Sf    = new Literal(i,j, "S", false);
				
				Clause s_is1   = new Clause(St);
				Clause s_is2   = new Clause(St);
				Clause s_is3   = new Clause(St);
				Clause s_is4   = new Clause(St);
				Clause s_isNot = new Clause(Sf);
				
				if(!(i == 0))
				{
					s_is1.add(Wim1f);
					KB.add(s_is1);
					s_isNot.add(Wim1t);
				}			
					
				if(!(j == 0))
				{	
					s_is2.add(Wjm1f);
					KB.add(s_is2);
					s_isNot.add(Wjm1t);
				}
					
				if (!(i == this.worldSize - 1))
				{
					s_is3.add(Wip1f);
					KB.add(s_is3);
					s_isNot.add(Wip1t);
				}
					
				if (!(j == this.worldSize - 1))
				{
					s_is4.add(Wjp1f);
					KB.add(s_is4);
					s_isNot.add(Wjp1t);
				}
				KB.add(s_isNot);			
			}
	}
	
	private void insertGlitterBiimpliesGold()
	{
		for (int i = 0; i < this.worldSize; i++) 
			for (int j = 0; j < this.worldSize; j++) 
			{
				Literal Df = new Literal(i,j, "D", false);
				Literal Dt = new Literal(i,j, "D", true);
				Literal Gf = new Literal(i,j, "G", false);
				Literal Gt = new Literal(i,j, "G", true);
				
				Clause G_is   	= new Clause(Gt);
				Clause G_isNot  = new Clause(Gf);
				
				G_is.add(Df);
				G_isNot.add(Dt);
				
				KB.add(G_is);
				KB.add(G_isNot);			
			}
	}
	
	private void insertSafeBiimpliesNoWumpusOrPit()
	{
		for (int i = 0; i < this.worldSize; i++) 
			for (int j = 0; j < this.worldSize; j++) 
			{
				Literal Of = new Literal(i,j, "O", false);
				Literal Ot = new Literal(i,j, "O", true);
				Literal Pf = new Literal(i,j, "P", false);
				Literal Pt = new Literal(i,j, "P", true);
				Literal Wf = new Literal(i,j, "W", false);
				Literal Wt = new Literal(i,j, "W", true);
				
				Clause O_is   	= new Clause(Ot);
				Clause OP_isNot = new Clause(Of);
				Clause OW_isNot = new Clause(Of);

				O_is.add(Pt);
				O_is.add(Wt);
				OP_isNot.add(Pf);
				OW_isNot.add(Wf);
				
				KB.add(O_is);
				KB.add(OP_isNot);
				KB.add(OW_isNot);			
			}
	}
	
	private void insertSafeBiimpliesNoPit()
	{
		for (int i = 0; i < this.worldSize; i++) 
			for (int j = 0; j < this.worldSize; j++) 
			{
				Literal Of = new Literal(i,j, "O", false);
				Literal Ot = new Literal(i,j, "O", true);
				Literal Pf = new Literal(i,j, "P", false);
				Literal Pt = new Literal(i,j, "P", true);
	
				Clause O_is   	= new Clause(Ot);
				Clause OP_isNot = new Clause(Of);

				O_is.add(Pt);
				OP_isNot.add(Pf);
				
				KB.add(O_is);
				KB.add(OP_isNot);		
			}
	}
	
	private void insertReachesGoldBaseCase()
	{
		for (int i = 0; i < this.worldSize; i++) 
			for (int j = 0; j < this.worldSize; j++) 
			{
				Literal Xf = new Literal(i,j, "X", false);
				Literal Xt = new Literal(i,j, "X", true);
				Literal Df = new Literal(i,j, "D", false);
				Literal Dt = new Literal(i,j, "D", true);
				Literal Of = new Literal(i,j, "O", false);
				Literal Ot = new Literal(i,j, "O", true);
								
				if(isRes)
				{
					Clause X_is   = new Clause(Xt);
					Clause D_is   = new Clause(Dt);
					Clause O_is   = new Clause(Ot);

					X_is.add(Df);
					X_is.add(Of);
					D_is.add(Xf);
					O_is.add(Xf);
					
					KB.add(X_is);
					KB.add(D_is);
					KB.add(O_is);
				}
				else
				{
					Clause X_is   = new Clause(Xt);
					X_is.add(Df);
					X_is.add(Of);
					KB.add(X_is);
					
					Clause O_is   = new Clause(Ot);
					O_is.add(Xf);
					O_is.add(Df);
					KB.add(O_is);
				}
			}
	}

	private void insertReachesGoldRecursiveCase()
	{
		for (int i = 0; i < this.worldSize; i++) 
			for (int j = 0; j < this.worldSize; j++) 
			{
				Literal Xip1t = new Literal(i+1,j, "X", true);
				Literal Xjp1t = new Literal(i,j+1, "X", true);
				Literal Xim1t = new Literal(i-1,j, "X", true);
				Literal Xjm1t = new Literal(i,j-1, "X", true);
				Literal Xip1f = new Literal(i+1,j, "X", false);
				Literal Xjp1f = new Literal(i,j+1, "X", false);
				Literal Xim1f = new Literal(i-1,j, "X", false);
				Literal Xjm1f = new Literal(i,j-1, "X", false);
				Literal Xt    = new Literal(i,j,   "X", true);
				Literal Xf    = new Literal(i,j,   "X", false);
				Literal Ot = new Literal(i,j, "O", true);
				Literal Of = new Literal(i,j, "O", false);
				
				Clause X_is1   = new Clause(Xt);
				Clause X_is2   = new Clause(Xt);
				Clause X_is3   = new Clause(Xt);
				Clause X_is4   = new Clause(Xt);
				Clause O_is   = new Clause(Ot);
				Clause X_isNot = new Clause(Xf);
				
				Clause nX_nX1 = new Clause(Xt);
				Clause nX_nX2 = new Clause(Xt);
				Clause nX_nX3 = new Clause(Xt);
				Clause nX_nX4 = new Clause(Xt);
				
				X_is1.add(Of);
				X_is2.add(Of);
				X_is3.add(Of); 
				X_is4.add(Of);
				O_is.add(Xf);
				X_isNot.add(Xf);
				
				if(!(i == 0))
				{
					X_is1.add(Xim1f);
					KB.add(X_is1);
					
					if(runBadRule)
					{
						nX_nX1.add(Xim1f);
						KB.add(nX_nX1);
					}
					
					X_isNot.add(Xim1t);
				}			
					
				if(!(j == 0))
				{	
					X_is2.add(Xjm1f);
					KB.add(X_is2);
					
					if(runBadRule)
					{
						nX_nX2.add(Xjm1f);
						KB.add(nX_nX2);
					}
					
					X_isNot.add(Xjm1t);
				}
					
				if (!(i == this.worldSize - 1))
				{
					X_is3.add(Xip1f);
					KB.add(X_is3);
					
					if(runBadRule)
					{
						nX_nX3.add(Xip1f);
						KB.add(nX_nX3);
					}
					
					X_isNot.add(Xip1t);
				}
					
				if (!(j == this.worldSize - 1))
				{
					X_is4.add(Xjp1f);
					KB.add(X_is4);
					
					if(runBadRule)
					{
						nX_nX4.add(Xjp1f);
						KB.add(nX_nX4);
					}
					
					X_isNot.add(Xjp1t);
				}
				
				KB.add(X_isNot);
				KB.add(O_is);
			}	
	}
}//end class
