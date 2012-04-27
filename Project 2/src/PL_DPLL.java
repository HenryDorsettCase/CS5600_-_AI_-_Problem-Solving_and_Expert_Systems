import java.util.*;

public class PL_DPLL 
{
	ClausesSet m_KB;
	Model m_Model;
	
	public PL_DPLL(){}
	
	public boolean DPLL_Satisfiable(ClausesSet kb, Symbols symbols)
	{
		this.m_KB = kb;
		ClausesSet clauses = new ClausesSet(kb);
		
		Literal alpha = new Literal(0, 0, "X", true);
		Clause notAlpha = new Clause(alpha.getComplement());
		clauses.add(notAlpha);
		
		boolean result = DPLL(clauses, symbols, new Model(), null);
		
		Collections.sort(this.m_Model.model);
		System.out.println("Model at end: " + this.m_Model.size() + ":" + this.m_Model.toString());
		System.out.print("KB |= alpha: ");
		
		return !(result);
	}
	
	//symbolsList, modelList, oldClauses are new separate objects every time they are passed (deep clone).
	int count = 0;
	private boolean DPLL(ClausesSet clauses, Symbols symbols, Model model, Literal lastVar)
	{	
		//System.out.println("clauses: " + clauses.size());
		//System.out.println("model: " + model.size());
		//System.out.println("symbols: " + symbols.size() +"\n");
		
		//Perform unit propagation here.
		if(lastVar != null)
			clauses = simplify(clauses, lastVar);
		
		if (clauses.isEmpty()) 
		{
			this.m_Model = model;
			System.out.println("Clauses is empty");
			return true;
		}
		
		if(clauses.size() == 1)
		{  
			for (Clause i : clauses)
				if (i.isEmpty())
				{
					this.m_Model = model;
					System.out.println("Empty clause: " + i);
					return false;
				}
		}
				
		if(everyClauseIsTrueInModel(this.m_KB, model))
		{
			System.out.println("everyClauseIsTrueInModel");
			this.m_Model = model;
			return true;
		}
		
		if(someClauseIsFalseInModel(this.m_KB, model)) 
		{
			System.out.println("someClauseIsFalseInModel");
			this.m_Model = model;
			return false;
		}
				
		Literal P = findUnitClauseNotInModel(clauses, model);
		if(P != null)
			return DPLL(clauses, symbols.minus(P.getSymbol()), model.extend(P), P);

		
		Symbol P_unassigned = symbols.first();
		if(P_unassigned == null)
			System.out.println("P_unassigned: null");
	
		//Collections.sort(model.model);
		//System.out.println("State of model: " + model.toString());
		System.out.println("Guessing a symbol: " + P_unassigned.toString());
		//clauses.print("Guessing a symbol: " + P_unassigned.toString() + ". State of clauses:");
			
		Literal P_true = new Literal(P_unassigned,  true);
		Literal P_false = new Literal(P_unassigned,  false);
		
		return 	DPLL(clauses.newAndAdd(new Clause(P_true)), symbols.rest(), model.extend(P_true), P_true) || 
				DPLL(clauses.newAndAdd(new Clause(P_false)), symbols.rest(), model.extend(P_false), P_false);	
	}
	
	public ClausesSet simplify(ClausesSet clauses, Literal lastVar)
	{
		ClausesSet newClauses = new ClausesSet();
		
		for(Clause i : clauses)
		{
			Clause newClause = propagate(i, lastVar);
			
			if (newClause != null )
			{
				if (newClause.isEmpty())
				{
					System.out.println("EMPTY CLAUSE i: " + i + ", lastVar:" + lastVar);
					return new ClausesSet(newClause);//EMPTY CLAUSE
				}
				newClauses.add(newClause);
			}
		}
		return newClauses;
	}
	
	public Clause propagate(Clause clause, Literal lastVar)
	{
		//System.out.println("1.b clause:" + clause.toString() + ", lastVar:" + lastVar);
		Clause newClause = new Clause();
		for(Literal i : clause)
		{
			if(i.equals(lastVar))
				return null;
			else if(i.equalsSymbol(lastVar) && i.isPos != lastVar.isPos)
				continue;
			else //i != lastVar by symbol or more
				newClause.add(i);
		}
		return newClause;
	}
	
	public Literal findUnitClauseNotInModel(ClausesSet clauses, Model model)
	{
		for (Clause i: clauses)
		{
			if(i.isUnitClause() && !model.contains(i.getUnitClauseLiteral()))
				return i.getUnitClauseLiteral();
		}
		return null;
	}
	
	private boolean everyClauseIsTrueInModel(ClausesSet clauses, Model model)
	{
		//System.out.println("everyClauseIsTrueInModel: ");
		for(Clause i : clauses)
		{
			boolean isClauseTrueInModel = false;
			for (Literal j: i)
			{
				if(model.contains(j))
				{
					isClauseTrueInModel = true;
					break;
				}
			}
			if(!isClauseTrueInModel)
			{
				//System.out.println("everyClauseIsTrueInModel false CLAUSE i:" + i);
				return false;
			}
		}
		return true;
	}
	
	private boolean someClauseIsFalseInModel(ClausesSet clauses, Model model)
	{
		//System.out.println("someClauseIsFalseInModel: ");
		for(Clause i : clauses)
		{		
			int countOfLiteralsInClauseThatAreFalse = 0;
			for (Literal j: i)
			{				
				if(model.contains(j))	
					break;
				if(model.contains(j.getComplement()))
					countOfLiteralsInClauseThatAreFalse++;
			}
			if(countOfLiteralsInClauseThatAreFalse == i.size())
			{
				//System.out.println("someClauseIsFalseInModel true CLAUSE i:" + i);
				return true;
			}
		}
		return false;
	}
}

