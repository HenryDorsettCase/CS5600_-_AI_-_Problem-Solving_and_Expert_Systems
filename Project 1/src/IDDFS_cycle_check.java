import java.io.*;
import java.util.*;

public class IDDFS_cycle_check
{
	Problem problem;
	long counter;
	long totalTimeMs;
	
	public IDDFS_cycle_check(Problem p)
	{
		this.problem = p;	
		counter = 0;
	}
	
	//function TREE-SEARCH(problem, fringe) returns a solution, or failure
	public Node IDDFSearch_cycle_check()
	{
		int cutoffDepthLimit = 1;
		boolean isCutoff;
		
		LinkedList<Node> fringe = new LinkedList<Node>();
		LinkedList<Node> fringeForNextIteration = new LinkedList<Node>();
		ExpandAndSuccessorFunction xp = new ExpandAndSuccessorFunction(problem);
		
		long startTimeMs = System.currentTimeMillis();//START TIMER
		
		Node initialNode = new Node(problem.state);//fringe <- INSERT(MAKE-NODE(INITIAL-STATE[problem]), fringe)
		fringe.addFirst(initialNode);
		
		do
		{
			//System.out.println("*************************************");
			//System.out.println("BEGINNING CUTOFF LIMIT:" + cutoffDepthLimit); //If no solution
			//System.out.println("*************************************\n");
							
			isCutoff = false;
			while (!fringe.isEmpty())
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
				
				if(node.depth == cutoffDepthLimit)
				{
					isCutoff = true;
					fringeForNextIteration.addFirst(node);//return to fringe
					//System.out.println("CUTOFF: " + node);
				}
				
				if(node.depth < cutoffDepthLimit)
				{	
					if (node.parent == null || node.parent.parent == null || (node.parent.parent != null && !node.equals(node.parent.parent)) ) 
					{								
						this.counter++;//counting expanded nodes
						//System.out.println(counter);
				
						LinkedList<Node> successors = xp.expand(node);//fringe <- INSERT-ALL(EXPAND(node, problem), fringe)
						for (Node n: successors)
						{
							fringe.addFirst(n);
						}
					}
					//else
						//System.out.println("CYCLE: " + n);
					//System.out.println();				
				}//end elseif(node.depth < cutoffDepthLimit)
				
			}//while (!fringe.isEmpty())
			
			//System.out.println("*************************************");
			//System.out.println("END CUTOFF LIMIT:" + cutoffDepthLimit); //If no solution
			//System.out.println("*************************************\n");
			
			if(!isCutoff)
			{
				//if EMPTY?(fringe) and cutoff not hit, then return failure		
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
			
			fringe.addAll(fringeForNextIteration);
			fringeForNextIteration.clear();
			
		}while(cutoffDepthLimit++ < Integer.MAX_VALUE);
		
		return null;
	}//end method
}//end class

