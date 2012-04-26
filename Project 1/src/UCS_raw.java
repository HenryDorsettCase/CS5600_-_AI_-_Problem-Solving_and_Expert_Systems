import java.util.*;
import java.io.*;

public class UCS_raw 
{
	Problem problem;
	long counter;
	long totalTimeMs;
	
	public UCS_raw(Problem p)
	{
		this.problem = p;	
		counter = 0;
	}
	
	//function TREE-SEARCH(problem, fringe) returns a solution, or failure
	public Node UCSearch_raw()
	{
		PriorityQueue<Node> fringe = new PriorityQueue<Node>(1000, new Comparator_UCS());//a priority queue
		ExpandAndSuccessorFunction xp = new ExpandAndSuccessorFunction(problem);
			
		long startTimeMs = System.currentTimeMillis();//START TIMER
		
		Node initialNode = new Node(problem.state);//fringe <- INSERT(MAKE-NODE(INITIAL-STATE[problem]), fringe)
		fringe.add(initialNode);
		
		while(!fringe.isEmpty())
		{
			Node node = fringe.remove();

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
			
			this.counter++;//counting expanded nodes
			//System.out.println(counter);
		
			LinkedList<Node> successors = xp.expand(node);//fringe <- INSERT-ALL(EXPAND(node, problem), fringe)
			for (Node n: successors)
			{
				fringe.add(n);
			}
			
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
