
public class InitSymbolsList 
{
	private int worldSize;
	Symbols symbols;
	
	InitSymbolsList(Symbols s, TransferPercept tp, boolean includeBS)
	{
		this.symbols = s;
		this.worldSize = tp.getGridPercepts().getWorldSize();
		this.initSymbolsList(includeBS);
	}
	
	private void initSymbolsList(boolean includeBS)
	{
		for (int i = 0; i < this.worldSize; i++)
			for (int j = 0; j < this.worldSize; j++)
			{
				this.symbols.addLast(new Symbol(i,j, "B"));
				this.symbols.addLast(new Symbol(i,j, "G"));
				
				if(includeBS)
					this.symbols.addLast(new Symbol(i,j, "S"));
			}
		
		for (int i = 0; i < this.worldSize; i++)
			for (int j = 0; j < this.worldSize; j++)
				this.symbols.addLast(new Symbol(i,j, "P"));

		if(includeBS)
		{
			for (int i = 0; i < this.worldSize; i++)
				for (int j = 0; j < this.worldSize; j++)
					this.symbols.addLast(new Symbol(i,j, "W"));
		}
		
		for (int i = 0; i < this.worldSize; i++)
			for (int j = 0; j < this.worldSize; j++)
				this.symbols.addLast(new Symbol(i,j, "D"));
		
		for (int i = 0; i < this.worldSize; i++)
			for (int j = 0; j < this.worldSize; j++)
				this.symbols.addLast(new Symbol(i,j, "O"));
		
		for (int i = 0; i < this.worldSize; i++)
			for (int j = 0; j < this.worldSize; j++)
				this.symbols.addLast(new Symbol(i,j, "X"));
		
		//Collections.sort(symbols);		
	}

}
