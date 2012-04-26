import java.util.*;

public class IDDFSrecursive_raw 
{
	Problem problem;
	long counter;
	long totalTimeMs;
	Runtime r;
	
	private final int limit;
	
	public IDDFSrecursive_raw(Problem p)
	{
		this.problem = p;	
		counter = 0;
		this.limit = Integer.MAX_VALUE;
	}
	
	//function TREE-SEARCH(problem, fringe) returns a solution, or failure
	public Node recursiveIDDFSearch()
	{
		long startTimeMs = System.currentTimeMillis();//START TIMER
		
		// for depth <- to infinity do
		for (int i = 1; i <= limit; i++) 
		{
			// result <- DEPTH-LIMITED-SEARCH(problem, depth)
			DepthLimitedSearch dls = new DepthLimitedSearch(i);
			Node result = dls.DLS_raw(problem);

			if(result != null && result.action != -1)//No cutoff
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
				
				return result;
			}
			
			if(result == null)//No solution
			{
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
			
			//System.out.println("*************************************");
			System.out.println("CUTOFF LIMIT:" + i); //If no solution
			//System.out.println("*************************************\n");
		}
		return null;
	}
	
	class DepthLimitedSearch
	{
		private final int limit;
		ExpandAndSuccessorFunction xp;
		
		public DepthLimitedSearch(int index)
		{
			limit = index;
			xp = new ExpandAndSuccessorFunction(problem);
		}
		
		public Node DLS_raw(Problem p)
		{
			Node initialNode = new Node(problem.state);//MAKE-NODE(INITIAL-STATE[problem]
			Node result = recursiveDLS(initialNode, limit);
			return result;
		}
		
		private Node recursiveDLS(Node node, int limit)
		{
			boolean cutOffOccurred = false;
			
			if (problem.goal.isGoal(node))
				return node;
			else if (node.depth == limit)
				return new Node(node, -1);
			else
			{
				counter++;
				
				LinkedList<Node> successors = xp.expand(node);//fringe <- INSERT-ALL(EXPAND(node, problem), fringe)
				for (Node n: successors)
				{
					// result <- RECURSIVE-DLS(successor, problem, limit)
					Node result = recursiveDLS(n, limit);
					if(result.action == -1)
						cutOffOccurred = true;
					else if (result != null)
						return result;
				}
				
				if (cutOffOccurred) 
				{
					return new Node(node, -1);
				}
				else
					return null;
			}
		}//end method recursiveDLS
	}//end class
}//end class

