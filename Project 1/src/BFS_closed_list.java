import java.io.*;
import java.util.*;

public class BFS_closed_list 
{
	Problem problem;
	long counter;
	long totalTimeMs;
	
	public BFS_closed_list(Problem p)
	{
		this.problem = p;	
		counter = 0;
	}
	
	//function TREE-SEARCH(problem, fringe) returns a solution, or failure
	public Node BFSearch_closed_list()
	{
		LinkedList<Node> fringe = new LinkedList<Node>();//use a LIFO queue
		HashSet<Node> closedList = new HashSet<Node>();
		ExpandAndSuccessorFunction xp = new ExpandAndSuccessorFunction(problem);
			
		long startTimeMs = System.currentTimeMillis();//START TIMER
		
		Node initialNode = new Node(problem.state);//fringe <- INSERT(MAKE-NODE(INITIAL-STATE[problem]), fringe)
		fringe.addLast(initialNode);
		
		while(!fringe.isEmpty())
		{
			Node node = fringe.removeFirst();
			//System.out.println("POPPED: " + node);
			
			if (problem.goal.isGoal(node))//if GOAL-TEST[problem] applied to STATE[node] succeeds 
			{			
				System.out.println("Goal found.");
				System.out.println("counter FINAL: " + this.counter);//FINAL EXPANDED NODE COUNT
						
				long finishTimeMs = System.currentTimeMillis(); //END TIMER
				this.totalTimeMs = finishTimeMs - startTimeMs;
				System.out.println("Total time(ms): " + this.totalTimeMs);
				
				try 
				{	
					WorldApplication.fout.write(this.counter + ":");
					WorldApplication.fout.write(this.totalTimeMs + ":");
				}
				catch(Exception e){}
				
				return node;
			}
					
			//CLOSED LIST
			if(!closedList.contains(node))
			{
				closedList.add(node);	
				this.counter++;//counting expanded nodes
				//System.out.println(counter);

				LinkedList<Node> successors = xp.expand(node);//fringe <- INSERT-ALL(EXPAND(node, problem), fringe)
				for (Node n: successors)
				{
					fringe.addLast(n);
				}
			}
			//else
				//System.out.println("IN CLOSED: " + node);

			//System.out.println();
		}
		
		//if EMPTY?(fringe) then return failure
		System.out.println("No Goal found."); //If no solution
		System.out.println("counter FINAL: " + this.counter); //FINAL EXPANDED NODE COUNT
		
		long finishTimeMs = System.currentTimeMillis(); //END TIMER
		this.totalTimeMs = finishTimeMs - startTimeMs;
		System.out.println("Total time(ms): " + this.totalTimeMs);
		
		try 
		{	
			WorldApplication.fout.write(this.counter + ":");
			WorldApplication.fout.write(this.totalTimeMs + ":");
		}
		catch(Exception e){}
		
		return null;	
	}
	
}//end class
