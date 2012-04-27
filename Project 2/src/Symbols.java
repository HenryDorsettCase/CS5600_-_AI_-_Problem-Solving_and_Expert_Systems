import java.util.*;

public class Symbols 
{
	LinkedList<Symbol> symbols;
	
	Symbols(){symbols = new LinkedList<Symbol>();}
	Symbols(Symbols s){symbols = new LinkedList<Symbol>(s.symbols);}
	public boolean addAll (Symbols s) {return symbols.addAll(s.symbols);}
	public void addLast (Symbol s) {symbols.addLast(s);}
	public boolean remove(Symbol s) {return symbols.remove(s);}
	public Symbol removeFirst() {return symbols.removeFirst();}
	public int size() {return symbols.size();}
	
	Symbol first(){return symbols.getFirst();}
	
	Symbols rest()
	{
		Symbols rest = new Symbols(this);
		rest.removeFirst();
		return rest;
	}
	
	Symbols minus(Symbol s)
	{
		Symbols symbols_minus_one = new Symbols(this);
		symbols_minus_one.remove(s);
		return symbols_minus_one;
	}
	@Override
	public String toString()
	{
		return symbols.toString();
	}
}
