import java.util.*;

//used as KB, resolvents, new
public class ClausesSet implements Iterable<Clause>
{
	HashSet<Clause> clausesSet;
	
	public 					ClausesSet()						{this.clausesSet = new HashSet<Clause>();}
	public 					ClausesSet(ClausesSet cs)			{this.clausesSet = new HashSet<Clause>(); clausesSet.addAll(cs.clausesSet);}
	public 					ClausesSet(Clause c)				{this.clausesSet = new HashSet<Clause>(); clausesSet.add(c);}
	public boolean 			add(Clause c)						{return clausesSet.add(c);}
	public boolean 			remove(Clause c)					{return clausesSet.remove(c);}
	public boolean 			contains(Clause c)					{return clausesSet.contains(c);}
	public boolean 			addAll(ClausesSet c)				{return clausesSet.addAll(c.clausesSet);}
	public boolean 			removeAll(ClausesSet c)				{return clausesSet.removeAll(c.clausesSet);}
	public boolean 			containsAll(ClausesSet c)			{return clausesSet.containsAll(c.clausesSet);}
	public boolean 			equals(ClausesSet c)				{return clausesSet.equals(c.clausesSet);}
	public boolean 			isEmpty()							{return clausesSet.isEmpty();}
	public void				clear()								{		clausesSet.clear();}
	public String  			toString()							{return clausesSet.toString();}
	public int				size()								{return clausesSet.size();}
	public int				hashCode()							{return clausesSet.hashCode();}
	public Iterator<Clause>	iterator()							{return clausesSet.iterator();}
	public Object[]			toArray()							{return clausesSet.toArray();}
	
	public ClausesSet newAndAdd(Clause c)
	{
		ClausesSet newCS = new ClausesSet(this);
		newCS.add(c);
		return newCS;
	}
	
	public boolean containsEmptyClause()
	{
		for(Clause i: clausesSet)
		{
			if(i.isEmpty())
				return true;
		}
		return false;
	}
	
	public boolean containsUnitClause()
	{
		for(Clause i: clausesSet)
		{
			if(i.isUnitClause())
				return true;
		}
		return false;
	}
	
	public void print(String name)
	{
		LinkedList<Clause> temp = new LinkedList<Clause>(clausesSet);
		Collections.sort(temp);
		System.out.println(name);
		for(Clause i: temp)
			System.out.println(i.clause.toString());
	}
	
	public void print()
	{
		LinkedList<Clause> temp = new LinkedList<Clause>(clausesSet);
		Collections.sort(temp);
		for(Clause i: temp)
			System.out.println(i.clause.toString());
	}
}
