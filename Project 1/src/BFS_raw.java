import java.util.*;
import java.io.*;

public class BFS_raw 
{
	Problem problem;
	long totalTimeMs;
	long counter;
	
	public BFS_raw(Problem p)
	{
		this.problem = p;
		counter = 1;
	}
	
	//function TREE-SEARCH(problem, fringe) returns a solution, or failure
	public Node BFSearch_raw()
	{
		LinkedList<Node> fringe = new LinkedList<Node>();
		ExpandAndSuccessorFunction xp = new ExpandAndSuccessorFunction(problem);
		
		long startTimeMs = System.currentTimeMillis();//START TIMER
		
		Node initialNode = new Node(problem.state);//fringe <- INSERT(MAKE-NODE(INITIAL-STATE[problem]), fringe)
		fringe.addFirst(initialNode);
		
		while(!fringe.isEmpty())
		{	
			Node node = fringe.removeFirst();//a FIFO queue
			this.counter++;//counting expanded nodes
			//System.out.println(counter);

			if (problem.goal.isGoal(node))//if GOAL-TEST[problem] applied to STATE[node] succeeds
			{	
				
				System.out.println("counter FINAL: " + counter);//FINAL EXPANDED NODE COUNT
					
				long finishTimeMs = System.currentTimeMillis();//END TIMER
				this.totalTimeMs = finishTimeMs - startTimeMs;
				System.out.println("Total time(ms): " + totalTimeMs);
				
				try 
				{	
					WorldApplication.fout.write(this.counter + ":");
					WorldApplication.fout.write(this.totalTimeMs + ":");
				}
				catch(Exception e){}
				
				return node;
			}
			 
			LinkedList<Node> successors = xp.expand(node);//fringe <- INSERT-ALL(EXPAND(node, problem), fringe)
			for (Node n: successors)
			{
				fringe.addLast(n);
			}
		}
		
		//if EMPTY?(fringe) then return failure
		System.out.println("No Goal found."); //If no solution
		System.out.println("counter FINAL: " + counter);//FINAL EXPANDED NODE COUNT
		
		long finishTimeMs = System.currentTimeMillis();//END TIMER
		long totalTimeMs = finishTimeMs - startTimeMs;
		System.out.println("Total time(ms): " + totalTimeMs);
		
		try 
		{	
			WorldApplication.fout.write(this.counter + ":");
			WorldApplication.fout.write(this.totalTimeMs + ":");
		}
		catch(Exception e){}
		
		return null;	
	}
}//end class
