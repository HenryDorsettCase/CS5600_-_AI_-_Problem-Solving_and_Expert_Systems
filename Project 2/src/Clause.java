import java.util.*;

public class Clause implements Comparable<Clause>, Iterable<Literal>
{
	HashSet<Literal> clause;
	public 					Clause()							{this.clause = new HashSet<Literal>();}
	public 					Clause(Literal l)					{this.clause = new HashSet<Literal>(); this.add(l);}
	public					Clause (Clause c)					{this.clause = new HashSet<Literal>(); this.addAll(c);}
	public boolean 			add(Literal l)						{return clause.add(l);}
	public boolean 			remove(Literal l)					{return clause.remove(l);}
	public boolean 			contains(Literal l)					{return clause.contains(l);}
	public boolean 			addAll(Clause c)					{return clause.addAll(c.clause);}
	public boolean 			removeAll(Clause c)					{return clause.removeAll(c.clause);}
	public boolean 			containsAll(Clause c)				{return clause.containsAll(c.clause);}
	public boolean 			isEmpty()							{return clause.isEmpty();}
	public String  			toString()							{return clause.toString();}
	public int 				size()								{return clause.size();}
	public Iterator<Literal>iterator()							{return clause.iterator();}

	public boolean isUnitClause()
	{
		if(this.size() == 1) return true;
		return false;
	}
	
	public Literal getUnitClauseLiteral()
	{
		if(this.isUnitClause())
			for(Literal i : clause)
			{
				return i;
			}
		return null;
	}
	
	public Literal getUnitClauseLiteralComplement()
	{
		if(this.isUnitClause())
			for(Literal i : clause)
				return i.getComplement();
		return null;
	}
	
	public boolean containsSymbol(Symbol s)
	{
		for (Literal i: clause)
		{
			if(i.equalsSymbol(s))
				return true;
		}
		return false;
	}
	
	@Override
	public boolean equals(Object obj)
	{
	       if (this == obj)
	           return true;
	       if (obj == null)
	           return false;
	       if (this.getClass() != obj.getClass())
	           return false;
	       
	       final Clause rhs = (Clause) obj;
	       
	       if(this.size() != rhs.size()) return false;
	       
	       for(Literal i: rhs.clause)
	    	   if(!this.clause.contains(i))
	    		   return false;
	       
	       for(Literal i: this.clause)
	    	   if(!rhs.clause.contains(i))
	    		   return false;

	       return true;
	}
	
	@Override
	public int hashCode() 
	{ 
	    int hash = 1;
	    
	    for(Literal l : clause)
	    	hash = hash * 31 * l.hashCode();

	    return hash;
	}
	
	public int compareTo(Clause rhs)
	{
		final int BEFORE = -1;
	    final int EQUAL = 0;
	    final int AFTER = 1;
	    
	    if(this.size() == 1 && rhs.size() == 1)
	    {
	    	for(Literal i : this.clause)
	    		for(Literal j: rhs.clause)
	    		{
	    			if(i.row < j.row)
	    				return BEFORE;
	    			if(i.row > j.row)
	    				return AFTER;
	    			
	    			if(i.col < j.col)
	    				return BEFORE;
	    			if(i.col > j.col)
	    				return AFTER;
	    			
	    			int comparison = i.symbol.compareTo(j.symbol);
	    			if(comparison != EQUAL) return comparison;
	    			
	    			if(i.isPos != j.isPos)
	    			{
	    				if(i.isPos == true)
	    					return BEFORE;
	    				if(i.isPos == false)
	    					return AFTER;
	    			}
	    		}
	    	return EQUAL;
	    }
	    
	    if(this.size() < rhs.size())return BEFORE;
	    if(this.size() > rhs.size())return AFTER;

		for(Literal i: this.clause)
			if(!rhs.contains(i))
				return AFTER;
		
		for(Literal i: rhs.clause)
			if(!this.contains(i))
				return BEFORE;
		
		return EQUAL;
	}
}
