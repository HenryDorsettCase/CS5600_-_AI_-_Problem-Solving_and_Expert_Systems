import java.util.*;

public class Node //implements Comparable<Node>
{
	private final static int NO_H = 0;
	public final static int STRAIGHTLINE_H = 1;
	public final static int MANHATTAN_H = 2;
	public final static int HOMEGROWN_H = 3;
	private static Integer heuristic;
	
	private static XYPair locationOfGold;
	private static GridState state;
	private static char[][][] world;
	
	Node parent;
	//Child pointers????
	
	XYPair location;
	char direction;
	int action;
	boolean hasGold;
	LinkedList<XYPair> killedWumpii;
	
	int depth;
	int stepCost;
	Integer g_pathCost;	//thus far
	Double h_value;	//estimate distance to goal via a heuristic
	Double f_value;	//f(n) = g(n) + h(n)

	//For initial state of BFS, DFS, IDDFS, UCS
	public Node(GridState state)
	{
		Node.state = state;
		this.parent = null;
		
		this.location = new XYPair(0,0);
		this.direction = 'E';
		
		this.action = Action.START_TRIAL;
		this.stepCost = 0;
		this.g_pathCost = 0;
		
		this.depth = 0;
				
		this.hasGold = false;
		
		
		this.killedWumpii = new LinkedList<XYPair>();
		
		Node.heuristic = NO_H; 		//not needed for algs that use this constructor
		Node.locationOfGold = null;	//not needed for algs that use this constructor
	}
	
	//For initial state of Best, AStar
	public Node(GridState state, XYPair goldLocation, int typeH)
	{
		Node.state = state;
		Node.world = state.getWumpusWorld();
		
		this.parent = null;
		
		this.location = new XYPair(0,0);
		this.direction = 'E';
		
		this.action = Action.START_TRIAL;
		this.stepCost = 0;
		this.g_pathCost = 0;
		
		this.depth = 0;
		
		this.hasGold = false;
		
		this.killedWumpii = new LinkedList<XYPair>();
		
		Node.locationOfGold = goldLocation;
		Node.heuristic = typeH;
		
		switch(Node.heuristic)
		{
			case STRAIGHTLINE_H:	computeFHValues_StraightLine();	break;
			case MANHATTAN_H: 		computeFHValues_Manhattan();	break;
			case HOMEGROWN_H: 		computeFHValues_Homegrown();	break;
			default: break;
		}
	}
	
	//For all successors for all searches
	public Node(Node parent, int action) //For successor states
	{
		//Node.state = parent.state;
		this.parent = parent;
		
		this.location = new XYPair(parent.location.x, parent.location.y);
		this.direction = parent.direction;
		
		this.action = action;
		
		if(action == Action.SHOOT)
			this.stepCost = 10;
		else
			this.stepCost = 1;
		
		this.g_pathCost = parent.g_pathCost + this.stepCost;
		this.depth = parent.depth + 1;
		
		this.hasGold = parent.hasGold;
		
		this.killedWumpii = new LinkedList<XYPair>(parent.killedWumpii);
		
		switch(Node.heuristic)
		{
			case STRAIGHTLINE_H: 	computeFHValues_StraightLine(); break;
			case MANHATTAN_H: 		computeFHValues_Manhattan(); 	break;
			case HOMEGROWN_H: 		computeFHValues_Homegrown();	break;
			default: break;
		}
	}
	
	private void computeFHValues_StraightLine()
	{
		double x_dif = this.location.x - Node.locationOfGold.x;
		double y_dif = this.location.y - Node.locationOfGold.y;
		
		double squareOfStraightLineH = Math.pow(x_dif, 2.0) + Math.pow(y_dif, 2.0);
		
		this.h_value = Math.sqrt(squareOfStraightLineH);
				
		this.f_value = this.g_pathCost + this.h_value;
	}
	
	private void computeFHValues_Manhattan()
	{
		double x_dif = Math.abs(this.location.x - Node.locationOfGold.x);
		double y_dif = Math.abs(this.location.y - Node.locationOfGold.y);
		
		this.h_value = x_dif + y_dif;
		this.f_value = this.g_pathCost + this.h_value;
	}
	
	//if current action is a change of direction,the next action is possibly move forward
	private void computeFHValues_Homegrown()
	{
		computeFHValues_Manhattan();
		
		if(this.action == Action.TURN_LEFT || this.action == Action.TURN_RIGHT)
			if(this.isTurningAwayFromWumpusOrPitInDirectPathToGold())
			{
				this.h_value +=1;
				this.f_value +=1;
				//System.out.println("MOVE");
			}
		
		if(this.action == Action.SHOOT)
		{
			this.h_value +=5;
			this.f_value +=5;
			//System.out.println("SHOOT");
		}
	}
		
	public boolean isRootNode() {return parent == null;}
	public LinkedList<Node> getPathFromRoot() 
	{
		Node current = this;
		LinkedList<Node> queue = new LinkedList<Node>();
		while (!(current.isRootNode())) 
		{
			queue.addFirst(current);
			current = current.parent;
		}
		queue.addFirst(current); // take care of root node
		return queue;
	}
	
	@Override 
	public String toString()
	{
		String temp = "loc:" + location + " |dir:" + direction + " |act:" + action + " |pathcost:" + g_pathCost + " |depth:" + depth + " |kW(";
		
		temp+= killedWumpii.size() + "):";
		for(int i = 0; i < killedWumpii.size(); i++)
		{
			String kW = killedWumpii.get(i).toString();
			temp+= kW + ",";
		}
		return temp;
	}
	
	@Override 
	public boolean equals(Object o) 
	{	
		if (o == null) return false;  //case of parent.parent being the root/initial state
		if ( this == o ) return true; //check for self-comparison
	    if ( !(o instanceof Node) ) return false;
	    
	    Node in = (Node)o;
	    if(	this.location.equals(in.location) 	&& this.direction == in.direction && 
	    	this.action == in.action 			&& this.hasGold == in.hasGold	)
	    {
	    	if(this.killedWumpii.size() == in.killedWumpii.size())
	    	{
	    		if(this.killedWumpii.containsAll(in.killedWumpii))
	    			return true;
	    	}
	    }
	 
	    return false;
	}
	
	//Used in closed list hash set.
	@Override 
	public int hashCode() 
	{	
		int hash = 7;
		hash = 31 * hash + location.hashCode();
		hash = 31 * hash + direction;
		hash = 31 * hash + action;
		if(hasGold)
			hash = 31 * hash + 1;
		else
			hash = 31 * hash;
		
		//No check of hash code for killedWumpii list.
		//It is not necessary per Bryce email: 
		//"you can assume that the wumpus will die "only if" it is shot from the adjacent square."
		//Thus, one will never shoot from the same grid location more than once for each direction.
		//Therefore, state saves in closed list then save only the state info where the
		//arrow has been shot from this location on the grid in this direction.
		//Otherwise, the killedWumpii list would have to be sorted previous to testing for same state.
		//hash = 31 * hash + killedWumpii.hashCode();		
		return hash;
	}
	
	private boolean isTurningAwayFromWumpusOrPitInDirectPathToGold()
	{
		if(this.direction == 'N')
		{
			if(this.location.y+1 < state.getWorldSize() - 2)
				if(world[this.location.y+1][this.location.x][1] == 'W' || world[this.location.y+1][this.location.x][0] == 'P')
					if(this.location.y == Node.locationOfGold.y)
						return true;

		}
			
		else if(this.direction == 'S')
		{
			if(this.location.y-1 > 1)
				if(world[this.location.y-1][this.location.x][1] == 'W' || world[this.location.y-1][this.location.x][0] == 'P')
					if(this.location.y == Node.locationOfGold.y)
						return true;
		}
				
		else if(this.direction == 'E')
		{
			if(this.location.x+1 < state.getWorldSize() - 2)
				if(world[this.location.y][this.location.x+1][1] == 'W' || world[this.location.y][this.location.x+1][0] == 'P')
					if(this.location.x == Node.locationOfGold.x)
						return true;

		}
		
		else //if(this.direction == 'W')
		{
			if(this.location.x-1 > 1)
				if(world[this.location.y][this.location.x-1][1] == 'W' || world[this.location.y][this.location.x-1][0] == 'P')
					if(this.location.x == Node.locationOfGold.x)
						return true;

		}
		
		return false;
	}
}//end class



