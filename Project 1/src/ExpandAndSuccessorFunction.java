import java.io.*;
import java.util.*;


public class ExpandAndSuccessorFunction 
{
	// this integer array will store the agent actions
	private static int[] actionTable;
	
	boolean debug;
	BufferedReader reader;
	char[][][] wWorld;
	int size;
	
	public ExpandAndSuccessorFunction(Problem prob)
	{
		actionTable = new int[5];
		//actionTable ;		  
		actionTable[0] = Action.GO_FORWARD;
		actionTable[1] = Action.TURN_RIGHT;
		actionTable[2] = Action.TURN_LEFT;
		actionTable[3] = Action.GRAB;
		actionTable[4] = Action.SHOOT;
		
		wWorld = prob.state.getWumpusWorld();
		size = prob.state.getWorldSize();
		
		//debug = true;
		debug = false;
		reader = new BufferedReader( new InputStreamReader( System.in ) );
	}
	
	
	//function EXPAND(node, problem) returns a set of nodes
	public LinkedList<Node> expand(Node node)
	{
		//successors <- empty set
		LinkedList<Node> successors = new LinkedList<Node>();
				
		if(debug)
		{
			System.out.println("Par-> " + node);//show parent
			System.out.println("\tGPr-> " + node.parent);//show gparent, compare to successors
			System.out.println();
		}
			
		for (int i : actionTable)
		{

			Node newNode = successorFunction(node, i);
			if(newNode != null)
			{
				successors.addLast(newNode);
				
				if(debug)//show successors
					System.out.println("\tSuc-> " + newNode);
			}
		}
		
		if(debug)//pause after each step
		{
			try
			{
				reader.readLine();
			}catch (Exception e){}
		}
		
		return successors;	
	}
	
	//if <action, result> in SUCCESSOR-FN[problem](STATE[node]) is valid return node else null
	Node successorFunction(Node parent, int action)
	{
		//s <- a new NODE. Assignments are handled largely internally in Node constructor
		if(action == actionTable[0])//Action.GO_FORWARD
		{
			Node newNode = new Node(parent, Action.GO_FORWARD);
			return moveForwardAction(newNode, parent);
		}
		else if(action == actionTable[1])//Action.TURN_RIGHT)
		{
			Node newNode = new Node(parent, Action.TURN_RIGHT);
			return turnRightAction(parent, newNode);
		}
		else if(action == actionTable[2])//Action.TURN_LEFT
		{
			Node newNode = new Node(parent, Action.TURN_LEFT);
			return turnLeftAction(parent, newNode);
			
		}
		else if(action == actionTable[3])//Action.GRAB
		{
			Node newNode = new Node(parent, Action.GRAB);
			if(wWorld[parent.location.y][parent.location.x][2] == 'G')
			{
				newNode.hasGold = true;
				return newNode;
			}
			else
				return null;
		}
		else//if(action == actionTable[4])//Action.SHOOT
		{
			Node newNode = new Node(parent, Action.SHOOT);
			return shootAction(newNode, parent);
		}	
	}
	
	Node moveForwardAction(Node newNode, Node parent)
	{		
		if(parent.direction == 'N')
		{
			if(parent.location.y + 1 == size)
				return null;
			else
			{
				newNode.location.y += 1;
				
				if( wWorld[newNode.location.y][newNode.location.x][0] == 'P')//pit
					return null;
				if( wWorld[newNode.location.y][newNode.location.x][1] == 'W')//wumpus
				{
					if (!newNode.killedWumpii.contains(newNode.location))
						return null;
				}					
			}
			return newNode; //valid change of state
		}
		
		else if(parent.direction == 'S')
		{
			if(parent.location.y == 0)//would bang against wall
				return null;
			else
			{
				newNode.location.y -= 1;
				
				if( wWorld[newNode.location.y][newNode.location.x][0] == 'P')//pit
					return null;
				if( wWorld[newNode.location.y][newNode.location.x][1] == 'W')//wumpus
				{
					if (!newNode.killedWumpii.contains(newNode.location))
						return null;
				}						
			}
			return newNode; //valid change of state	
		}
		
		else if(parent.direction == 'E')
		{
			if(parent.location.x + 1 == size)//would bang against wall
				return null;
			else
			{
				newNode.location.x += 1;
				
				if( wWorld[newNode.location.y][newNode.location.x][0] == 'P')//pit
					return null;
				if( wWorld[newNode.location.y][newNode.location.x][1] == 'W')//wumpus
				{
					if (!newNode.killedWumpii.contains(newNode.location))
						return null;
				}						
			}
			return newNode; //valid change of state	
		}
		
		else //if(parent.direction == 'W')
		{
			if(parent.location.x == 0)//would bang against wall
				return null;
			else
			{
				newNode.location.x -=  1;
				
				if( wWorld[newNode.location.y][newNode.location.x][0] == 'P')//pit
					return null;
				if( wWorld[newNode.location.y][newNode.location.x][1] == 'W')//wumpus
				{
					if (!newNode.killedWumpii.contains(newNode.location))
						return null;
				}						
			}
			return newNode; //valid change of state		
		}	
	}//end Node moveForwardCheck(Node newNode, Node parent, Problem prob)
	
	Node turnRightAction(Node parent, Node newNode)
	{
		if(parent.direction == 'N')
			newNode.direction = 'E';
		else if(parent.direction == 'E')
			newNode.direction = 'S';
		else if(parent.direction == 'S')
			newNode.direction = 'W';
		else if(parent.direction == 'W')
			newNode.direction = 'N';
		
		return newNode;
	}
	
	Node turnLeftAction(Node parent, Node newNode)
	{
		if(parent.direction == 'N')
			newNode.direction = 'W';
		else if(parent.direction == 'E')
			newNode.direction = 'N';
		else if(parent.direction == 'S')
			newNode.direction = 'E';
		else if(parent.direction == 'W')
			newNode.direction = 'S';
		
		return newNode;
	}
	
	Node shootAction(Node newNode, Node parent)
	{
		XYPair currentLocation = parent.location;
		char currentDirection = parent.direction;
		boolean isNewKill = false;
		
		if(currentDirection == 'N')
		{
			for(int goingNorth = currentLocation.y; goingNorth < size; goingNorth++)
			{
				if(wWorld[goingNorth][currentLocation.x][1] == 'W')
				{
					XYPair temp = new XYPair(currentLocation.x, goingNorth);
					if(!parent.killedWumpii.contains(temp))
					{
						newNode.killedWumpii.add(temp);
						//Collections.sort(newNode.killedWumpii);
						isNewKill = true;
						break;
					}
				}
			}
		}
		else if(currentDirection == 'S')
		{
			for(int goingSouth = currentLocation.y; goingSouth >=0; goingSouth--)
			{
				if(wWorld[goingSouth][currentLocation.x][1] == 'W')
				{
					XYPair temp = new XYPair(currentLocation.x, goingSouth);
					if(!parent.killedWumpii.contains(temp))
					{
						newNode.killedWumpii.add(temp);
						//Collections.sort(newNode.killedWumpii);
						isNewKill = true;
						break;
					}
				}
			}
		}
		else if(currentDirection == 'E')
		{
			for(int goingEast = currentLocation.x; goingEast < size; goingEast++)
			{
				if(wWorld[currentLocation.y][goingEast][1] == 'W')
				{
					XYPair temp = new XYPair(goingEast, currentLocation.y);
					if(!parent.killedWumpii.contains(temp))
					{
						newNode.killedWumpii.add(temp);
						//Collections.sort(newNode.killedWumpii);
						isNewKill = true;
						break;
					}
				}
			}
		}
		else //if(currentDirection == 'W')
		{
			for(int goingWest= currentLocation.x; goingWest >=0; goingWest--)
			{
				if(wWorld[currentLocation.y][goingWest][1] == 'W')
				{
					XYPair temp = new XYPair(goingWest, currentLocation.y);
					if(!parent.killedWumpii.contains(temp))
					{
						newNode.killedWumpii.add(temp);
						//Collections.sort(newNode.killedWumpii);
						isNewKill = true;
						break;
					}
				}
			}
		}
		
		if(isNewKill)
			return newNode;
		else
			return null;
	}	
}
