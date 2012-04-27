import java.io.*;
import java.util.*;

public class PL_Resolution 
{	
	ClausesSet KB;
	InitKnowledgeBase initKB;
	
	BufferedReader reader;
	
	PL_Resolution(){}
	
	public boolean Resolution_Satisfiable(ClausesSet kb)
	{
		this.KB = kb;
		
		Literal alpha = new Literal(0, 0, "X", true);
		boolean result = Resolution(alpha);
		System.out.print("KB |= alpha: ");
		return result;
	}
	
	private boolean Resolution(Literal alpha)
	{
		ClausesSet clauses = new ClausesSet(KB);
		Clause notAlpha = new Clause(alpha.getComplement());
		clauses.add(notAlpha);
		//clauses.print("IN PL_RESOLUTION, added ~alpha");	
		//try{reader.readLine();}catch (Exception e){}
		
		System.out.println();
		clauses = applySubsumption(clauses);//preliminary round
		System.out.println("Clauses size:" + clauses.size() + "\n");
		
		ClausesSet resolvents;
		while(true)
		{	
			System.out.println("BEGIN Resolution round.");
			ClausesSet newClauses = new ClausesSet();
			for(Clause i: clauses)
			{	
				//System.out.println("NEW i: " + i);
				for(Clause j : clauses)
				{
					resolvents = PL_Resolve(i, j);
	
					//if(!resolvents.isEmpty())
					//{
						//System.out.println("Resolving i: " + i +  " and j: " +j);
						//System.out.println("resolvents:" + resolvents.clausesSet.toString());
						//try{reader.readLine();}catch (Exception e){}
					//}
					
					if(resolvents.containsEmptyClause())
					{
						resolvents.print("FOUND EMPTY SET\n");	
						return true;
					}	
					newClauses.addAll(resolvents); 
				}
			}
			
			System.out.println("END Resolution round.");
			
			//System.out.println("clauses contains all new clauses: " + clauses.containsAll(newClauses));
			//System.out.println("!clauses.equals(newClauses): " + !clauses.equals(newClauses));
			//clauses.print("CLAUSES BEFORE ADDING NEW CLAUSES");
			//newClauses.print("NEW CLAUSES");
			
			//new is a strictSubset of clauses
			if(clauses.containsAll(newClauses) && !clauses.equals(newClauses)) 
				return false;
			
			//clauses U new
			clauses.addAll(newClauses);
			System.out.println("Clauses size:" + clauses.size());
			
			if(lastRoundSize == clauses.size())
				return false;
			lastRoundSize = clauses.size();
			
			//apply subsumption to keep the KB from exploding in size
			clauses = applySubsumption(clauses);
			System.out.println("Clauses size:" + clauses.size() + "\n");
			//clauses.print("CLAUSES");
			//try{reader.readLine();}catch (Exception e){}
		}
	}
	int lastRoundSize = 0;

	private ClausesSet PL_Resolve(Clause i, Clause j)
	{
		ClausesSet resolvents = new ClausesSet();		
		for(Literal l : i)
		{
			Clause i_copy = new Clause(i);
			Clause j_copy = new Clause(j);
			
			Literal complement = l.getComplement();
			if(j.contains(complement))
			{
				i_copy.remove(l);
				j_copy.remove(complement);
				
				Clause toResolvents = new Clause();
				toResolvents.addAll(i_copy);
				toResolvents.addAll(j_copy);
				
				boolean isTautology = false;
				for(Literal tautologyFinder : toResolvents)
				{
					Literal tFind = tautologyFinder.getComplement();
					if(toResolvents.contains(tFind))
					{
						isTautology = true;
						return resolvents;
					}
				}
				if(!isTautology)
				{
					resolvents.add(toResolvents);
					return resolvents;
				}
			}
		}		
		return resolvents;
	}
	
	private ClausesSet applySubsumption(ClausesSet clauses)
	{
		System.out.println("BEGIN Subsumption round.");
		
		ClausesSet subsumption = new ClausesSet(clauses);
		for (Clause i : clauses)
		{
			//System.out.print("*");
			for(Clause j : clauses)
				if(!i.equals(j) && j.containsAll(i) && !i.containsAll(j))
				{
					//System.out.println("\ni: " + i +  " subsumes j: " +j);
					subsumption.remove(j);
				}
		}
		//System.out.println();
		System.out.println("END subsumption round.");
		return subsumption;
	}
}
