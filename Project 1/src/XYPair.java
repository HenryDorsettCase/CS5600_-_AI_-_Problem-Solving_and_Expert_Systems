
public class XYPair implements Comparable<XYPair>
{
	int x;
	int y;
	
	XYPair(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	@Override 
	public boolean equals(Object o) 
	{	
		if ( this == o ) return true; //check for self-comparison
	    if ( !(o instanceof XYPair) ) return false;
	    
	    XYPair in = (XYPair)o;
	    if(in.x == this.x && in.y == this.y) return true;
	    else return false;
	}
	
	@Override 
	public int hashCode()
	{
		int hash = 7;
		hash = 31 * hash + x;
		hash = 31 * hash + y;
		return hash;
	}
	
	@Override 
	public String toString()
	{
		return x + ":" + y;
	}
	
	public int compareTo( XYPair rhs)
	{
		final int BEFORE = -1;
		final int EQUAL = 0;
		final int AFTER = 1;
		
		if(this.x < rhs.x)
			return BEFORE;
		if (rhs.x < this.x)
			return AFTER;
		if (this.y < rhs.y)
			return BEFORE;
		if (rhs.y < this.y)
			return AFTER;
		return EQUAL;
	}
	
	
	
}
