import java.util.Iterator;
import java.util.LinkedList;

class Model implements Iterable<Literal>
{
	LinkedList<Literal> model;
	public 			Model() 				{this.model = new LinkedList<Literal>();}
	public 			Model(Model rhs)		{this.model = new LinkedList<Literal>(); 
											 this.model.addAll(rhs.model);}
	public void 	add(Literal rhs)		{this.model.addLast(rhs);}
	public void 	addAll(Model rhs)		{this.model.addAll(rhs.model);}
	public boolean 	contains(Literal rhs)	{return this.model.contains(rhs);}
	public int 		size()					{return this.model.size();}
	public String 	toString()				{return this.model.toString();}
	
	public Iterator<Literal>iterator()		{return model.iterator();}
	
	public boolean containsSymbol(Literal rhs)
	{
		for(Literal i : model)
			if ((i.symbol.equals(rhs.symbol)) && i.row == rhs.row && i.col == rhs.col)
				return true;
		return false;
	}
	
	Model extend(Symbol P, boolean value)
	{
		Model newModel = new Model(this);
		newModel.add(new Literal(P.row, P.col, P.symbol, value));
		return newModel;
	}
	
	Model extend(Literal P)
	{
		//System.out.println("     6:" + P.toString());
		Model newModel = new Model(this);
		newModel.add(P);
		return newModel;
	}
}
