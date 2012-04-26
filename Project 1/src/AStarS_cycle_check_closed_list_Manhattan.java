import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.PriorityQueue;


public class AStarS_cycle_check_closed_list_Manhattan  
{
	Problem problem;
	long counter;
	long totalTimeMs;
	
	public AStarS_cycle_check_closed_list_Manhattan (Problem p)
	{
		this.problem = p;	
		counter = 0;
	}
	
	//function TREE-SEARCH(problem, fringe) returns a solution, or failure
	public Node AStarSearch_cycle_check_closed_list_Manhattan ()
	{
		PriorityQueue<Node> fringe = new PriorityQueue<Node>(1000, new Comparator_AStarS());//a priority queue
		HashSet<Node> closedList = new HashSet<Node>();
		ExpandAndSuccessorFunction xp = new ExpandAndSuccessorFunction(problem);
			
		long startTimeMs = System.currentTimeMillis();//START TIMER
		
		Node initialNode = new Node(problem.state, problem.goal.locationOfGold, Node.MANHATTAN_H);//fringe <- INSERT(MAKE-NODE(INITIAL-STATE[problem]), fringe)
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
			
			if (node.parent == null || node.parent.parent == null || !node.equals(node.parent.parent))//CYCLE CHECK - if there was no state change from parent to child
			{							   		 								//	successor function will have caught that fact (per discussion thread)					
				
				if(!closedList.contains(node))
				{
					closedList.add(node);
					this.counter++;//counting expanded nodes
					//System.out.println(counter);
			
					LinkedList<Node> successors = xp.expand(node);//fringe <- INSERT-ALL(EXPAND(node, problem), fringe)
					for (Node n: successors)
					{
						fringe.add(n);
					}
				}
				//else
					//System.out.println("IN CLOSED: " + node);
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
