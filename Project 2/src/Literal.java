import java.util.Iterator;


public class Literal implements Comparable<Literal>
{
	int row;
	int col;
	String symbol;
	boolean isPos;
	
	Literal(int r, int c, String s, boolean p)
	{
		this.row = r;
		this.col = c;
		this.symbol = s;
		this.isPos = p;
	}
	
	Literal(Literal rhs)
	{
		this.row = rhs.row;
		this.col = rhs.col;
		this.symbol = rhs.symbol;
		this.isPos = rhs.isPos;
	}
	
	Literal(Symbol s, boolean value)
	{
		this.row = s.row;
		this.col = s.col;
		this.symbol = s.symbol;
		this.isPos = value;
	}
	
	public Literal getComplement()
	{
		return new Literal(this.row, this.col, this.symbol, !(this.isPos));
	}
	
	public Symbol getSymbol()
	{
		return new Symbol(this.row, this.col, this.symbol);
	}
	
	@Override
	public String toString()
	{
		String temp = "";
		
		if(this.isPos) temp += " ";
		else temp += "~";
		
		temp += (this.symbol + "[" + this.row + "]" + "[" + this.col + "]");
	
		return temp;
	}
	
	@Override
	public boolean equals(Object aThat)
	{
		 if ( this == aThat ) 				return true;
		 if ( !(aThat instanceof Literal) ) return false;
		 Literal that = (Literal)aThat;
		 
		 if (this.row == that.row && this.col == that.col &&
			 this.symbol.equals(that.symbol) && this.isPos == that.isPos)
			 return true;
		 else
			 return false;
	}
	
	public boolean equalsSymbol(Literal rhs)
	{ 
		 if (this.row == rhs.row && this.col == rhs.col && this.symbol.equals(rhs.symbol))
			 return true;
		 else
			 return false;
	}
	
	public boolean equalsSymbol(Symbol rhs)
	{ 
		 if (this.row == rhs.row && this.col == rhs.col && this.symbol.equals(rhs.symbol))
			 return true;
		 else
			 return false;
	}
	
	@Override
	public int hashCode() 
	{ 
	    int hash = 1;
	    
	    if(this.isPos) 	hash = hash * 31 + 1;
	    else 			hash = hash * 31 + 0;
	    
	    hash = hash * 31 + this.row;
	    hash = hash * 31 + this.col;
	    hash = hash * 31 + this.symbol.hashCode();

	    return hash;
	}
	
	public int compareTo(Literal that)
	{		
		final int BEFORE = -1;
	    final int EQUAL = 0;
	    final int AFTER = 1;
	    
	    if(this.row < that.row) return BEFORE;
    	else if(this.row > that.row) return AFTER;
	    else
	    {
	    	if(this.col < that.col) return BEFORE;
		    else if(this.col > that.col) return AFTER;
	    	else
	    	{
	    		int comparison = this.symbol.compareTo(that.symbol); 
	    		if(comparison != EQUAL) return comparison;
	    		else
	    		{
	    			if(this.isPos && !that.isPos) return BEFORE;
	    			if(!this.isPos && that.isPos) return AFTER;
	    		}
	    	}
	    }
	    
	    if(!this.equals(that))
	    	System.out.println("compareTo inconsistent with equals.");
	    
	    return EQUAL;
	}	
}
