import java.io.*;
import java.util.*;

public class DFS_cycle_check 
{
	Problem problem;
	long counter;
	long totalTimeMs;
	
	public DFS_cycle_check(Problem p)
	{
		this.problem = p;	
		counter = 0;
	}
	
	//function TREE-SEARCH(problem, fringe) returns a solution, or failure
	public Node DFSearch_cycle_check()
	{
		LinkedList<Node> fringe = new LinkedList<Node>();//use as FIFO queue
		ExpandAndSuccessorFunction xp = new ExpandAndSuccessorFunction(problem);
	
		long startTimeMs = System.currentTimeMillis();//START TIMER
		
		Node initialNode = new Node(problem.state);//fringe <- INSERT(MAKE-NODE(INITIAL-STATE[problem]), fringe)
		fringe.addFirst(initialNode);
		
		while(!fringe.isEmpty())
		{
			Node node = fringe.removeFirst();
			
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
			
			if (node.parent == null || node.parent.parent == null || !node.equals(node.parent.parent))	//CYCLE CHECK - if there was no state change from parent to child
			{							   		 														//	successor function will have caught that fact (per discussion thread)			
				this.counter++;//counting expanded nodes
				//System.out.println(counter);
		
				LinkedList<Node> successors = xp.expand(node);//fringe <- INSERT-ALL(EXPAND(node, problem), fringe)
				for (Node n: successors)
				{
					fringe.addFirst(n);
				}
			}
			//else
				//System.out.println("CYCLE: " + node);

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
