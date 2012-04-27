class Symbol implements Comparable<Symbol>
{
	String symbol;
	int row;
	int col;
	
	public Symbol( int r, int c, String s){this.symbol = s; this.row = r; this.col = c;}
	
	public Symbol( Literal rhs){this.symbol = rhs.symbol; this.row = rhs.row; this.col = rhs.col;}
	public boolean equals(Object aThat)
	{
		if (this == aThat) return true;
		if (!(aThat instanceof Symbol)) return false;
		Symbol that = (Symbol)aThat;
		
		if(this.symbol.equals(that.symbol) && this.row == that.row && this.col == that.col)
			return true;
		return false;
	}
	
	@Override
	public String toString()
	{
		String temp = "";
					
		temp += (this.symbol + "[" + this.row + "]" + "[" + this.col + "]");
	
		return temp;
	}
	
	public int compareTo(Symbol that)
	{
		final int BEFORE = -1;
	    final int EQUAL = 0;
	    final int AFTER = 1;
	    
	    int comparison = this.symbol.compareTo(that.symbol); 
		if(comparison != EQUAL) return comparison;
		else
		{
			if(this.row < that.row) return BEFORE;
			else if(this.row > that.row) return AFTER;
			else
			{
				if(this.col < that.col) return BEFORE;
				else if(this.col > that.col) return AFTER;
			}
		}
	    
	    if(!this.equals(that))
	    	System.out.println("compareTo inconsistent with equals.");
	    
	    return EQUAL;
	}
}
