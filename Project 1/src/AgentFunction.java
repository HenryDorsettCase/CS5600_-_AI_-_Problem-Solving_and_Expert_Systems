/*
 * Class that defines the agent function.
 * Run this program with CLA: -r 1 -a false -d 8 -s 10000, where 1 is seed, 8 is size, 10000 is steps
 * java -Xmx1024m WorldApplication
 */
import java.util.*;

class AgentFunction 
{
	private String agentName = "Agent Smith";//string to store the agent's name - do not remove this variable
	
	private boolean formulateGoalsIndefinitely;
	private int maxGoalsToFormulate;
	private int goalsFormulated;

	private LinkedList<Integer> actionSequence;

	public AgentFunction()
	{
		actionSequence = new LinkedList<Integer>();

		formulateGoalsIndefinitely = false;
		maxGoalsToFormulate = 1;
		goalsFormulated = 0;
	}

	public int process(TransferPercept tp)
	{
		int action = Action.NO_OP;//If no solution, returns NO_OPs
		
		GridState state = tp.getState();//state <- UPDATE-STATE(state, percept)
		
		if(actionSequence.size() == 0)//GET ACTION SEQUENCE VIA SEARCH METHODS OR SEARCH FAILED SO RETURN NO_OP
		{
			if(formulateGoalsIndefinitely || goalsFormulated < maxGoalsToFormulate)
			{
				Goal goal = formulateGoal(state);//goal <- FORMULATE-GOAL(state)
				goalsFormulated++;
				
				Problem problem = formulateProblem(state, goal);//problem <- FORMULATE-PROBLEM(state, goal)
				
				actionSequence.addAll(search(problem));//seq <- SEARCH(problem)
			}

		}
		else//actionSequence.size() > 0
		{		
			action = actionSequence.removeFirst(); //action <- FIRST(seq) && seq <- REST(seq)
		}
		
		return action;
	}
	
	Goal formulateGoal(GridState state)
	{
		Goal goal = new Goal(state);		
		return goal;
	}
	
	Problem formulateProblem(GridState initialState, Goal goal)
	{
		return new Problem(initialState, goal);
	}

	//////////////////////////////////////////////////////////////////////////////
	//THIS WILL BECOME A HUGE LIST OF CLASSES FOR THE DIFFERENT SEARCHES DONE	
	//INSTANTIATE ONE AT A TIME TO SOLVE THE WORLD	
	LinkedList<Integer> search(Problem problem)
	{		
		//BFS////////////////////////////////////////////////////////////////////////
		//BFS_raw search = new BFS_raw(problem);
		//Node goalNode = search.BFSearch_raw();
		
		//BFS_cycle_check search = new BFS_cycle_check(problem);
		//Node goalNode = search.BFSearch_cycle_check();
		
		//BFS_closed_list search = new BFS_closed_list(problem);
		//Node goalNode = search.BFSearch_closed_list();
		
		//BFS_cycle_check_closed_list search = new BFS_cycle_check_closed_list(problem);
		//Node goalNode = search.BFSearch_cycle_check_closed_list();
		
		//DFS////////////////////////////////////////////////////////////////////////
		//DFS_raw search = new DFS_raw(problem);
		//Node goalNode = search.DFSearch_raw();
		
		//DFS_cycle_check search = new DFS_cycle_check(problem);
		//Node goalNode = search.DFSearch_cycle_check();
		
		//DFS_closed_list search = new DFS_closed_list(problem);
		//Node goalNode = search.DFSearch_closed_list();
		
		//DFS_cycle_check_closed_list search = new DFS_cycle_check_closed_list(problem);
		//Node goalNode = search.DFSearch_cycle_check_closed_list();
		
		//UCS////////////////////////////////////////////////////////////////////////
		//UCS_raw search = new UCS_raw(problem);
		//Node goalNode = search.UCSearch_raw();
		
		//UCS_cycle_check search = new UCS_cycle_check(problem);
		//Node goalNode = search.UCSearch_cycle_check();
		
		//UCS_closed_list search = new UCS_closed_list(problem);
		//Node goalNode = search.UCSearch_closed_list();
		
		//UCS_cycle_check_closed_list search = new UCS_cycle_check_closed_list(problem);
		//Node goalNode = search.UCSearch_cycle_check_closed_list();
		
		//IDDFS////////////////////////////////////////////////////////////////////////
		//IDDFS_raw search = new IDDFS_raw(problem);
		//Node goalNode = search.IDDFSearch_raw();
		
		//IDDFS_cycle_check search = new IDDFS_cycle_check(problem);
		//Node goalNode = search.IDDFSearch_cycle_check();
		
		IDDFS_closed_list search = new IDDFS_closed_list(problem);
		Node goalNode = search.IDDFSearch_closed_list();
		
		//IDDFS_cycle_check_closed_list search = new IDDFS_cycle_check_closed_list(problem);
		//Node goalNode = search.IDDFSearch_cycle_check_closed_list();
		
		//IDDFSrecursive_raw search = new IDDFSrecursive_raw(problem);
		//Node goalNode = search.recursiveIDDFSearch();
		//////////////////////////////////////////////////////////////////////////////
		
		//BestS////////////////////////////////////////////////////////////////////////
		
		//StraightLine
		
		//BestS_raw_StraightLine search = new BestS_raw_StraightLine(problem);
		//Node goalNode = search.BestSearch_raw_StraightLine();
		
		//BestS_cycle_check_StraightLine search = new BestS_cycle_check_StraightLine(problem);
		//Node goalNode = search.BestSearch_cycle_check_StraightLine();
		
		//BestS_closed_list_StraightLine search = new BestS_closed_list_StraightLine(problem);
		//Node goalNode = search.BestSearch_closed_list_StraightLine();
		
		//BestS_cycle_check_closed_list_StraightLine search = new BestS_cycle_check_closed_list_StraightLine(problem);
		//Node goalNode = search.BestSearch_cycle_check_closed_list_StraightLine();
		
		//Manhattan
		
		//BestS_raw_Manhattan search = new BestS_raw_Manhattan(problem);
		//Node goalNode = search.BestSearch_raw_Manhattan();
		
		//BestS_cycle_check_Manhattan search = new BestS_cycle_check_Manhattan(problem);
		//Node goalNode = search.BestSearch_cycle_check_Manhattan();
		
		//BestS_closed_list_Manhattan search = new BestS_closed_list_Manhattan(problem);
		//Node goalNode = search.BestSearch_closed_list_Manhattan();
		
		//BestS_cycle_check_closed_list_Manhattan search = new BestS_cycle_check_closed_list_Manhattan(problem);
		//Node goalNode = search.BestSearch_cycle_check_closed_list_Manhattan();
		
		//Homegrown
		
		//BestS_raw_Homegrown search = new BestS_raw_Homegrown(problem);
		//Node goalNode = search.BestSearch_raw_Homegrown();
		
		//BestS_cycle_check_Homegrown search = new BestS_cycle_check_Homegrown(problem);
		//Node goalNode = search.BestSearch_cycle_check_Homegrown();
		
		//BestS_closed_list_Homegrown search = new BestS_closed_list_Homegrown(problem);
		//Node goalNode = search.BestSearch_closed_list_Homegrown();
		
		//BestS_cycle_check_closed_list_Homegrown search = new BestS_cycle_check_closed_list_Homegrown(problem);
		//Node goalNode = search.BestSearch_cycle_check_closed_list_Homegrown();
		
		//AStarS////////////////////////////////////////////////////////////////////////
		
		//StraightLine
		
		//AStarS_raw_StraightLine search = new AStarS_raw_StraightLine(problem);
		//Node goalNode = search.AStarSearch_raw_StraightLine();
		
		//AStarS_cycle_check_StraightLine search = new AStarS_cycle_check_StraightLine(problem);
		//Node goalNode = search.AStarSearch_cycle_check_StraightLine();
		
		//AStarS_closed_list_StraightLine search = new AStarS_closed_list_StraightLine(problem);
		//Node goalNode = search.AStarSearch_closed_list_StraightLine();
		
		//AStarS_cycle_check_closed_list_StraightLine search = new AStarS_cycle_check_closed_list_StraightLine(problem);
		//Node goalNode = search.AStarSearch_cycle_check_closed_list_StraightLine();
		
		//Manhattan
		
		//AStarS_raw_Manhattan search = new AStarS_raw_Manhattan(problem);
		//Node goalNode = search.AStarSearch_raw_Manhattan();
		
		//AStarS_cycle_check_Manhattan search = new AStarS_cycle_check_Manhattan(problem);
		//Node goalNode = search.AStarSearch_cycle_check_Manhattan();
		
		//AStarS_closed_list_Manhattan search = new AStarS_closed_list_Manhattan(problem);
		//Node goalNode = search.AStarSearch_closed_list_Manhattan();
		
		//AStarS_cycle_check_closed_list_Manhattan search = new AStarS_cycle_check_closed_list_Manhattan(problem);
		//Node goalNode = search.AStarSearch_cycle_check_closed_list_Manhattan();
		
		//Homegrown
		
		//AStarS_raw_Homegrown search = new AStarS_raw_Homegrown(problem);
		//Node goalNode = search.AStarSearch_raw_Homegrown();
		
		//AStarS_cycle_check_Homegrown search = new AStarS_cycle_check_Homegrown(problem);
		//Node goalNode = search.AStarSearch_cycle_check_Homegrown();
		
		//AStarS_closed_list_Homegrown search = new AStarS_closed_list_Homegrown(problem);
		//Node goalNode = search.AStarSearch_closed_list_Homegrown();
		
		//AStarS_cycle_check_closed_list_Homegrown search = new AStarS_cycle_check_closed_list_Homegrown(problem);
		//Node goalNode = search.AStarSearch_cycle_check_closed_list_Homegrown();
		
		LinkedList<Integer> actionSeq = new LinkedList<Integer>();
		if(problem.goal.isGoal(goalNode))//If solution is valid.
		{
			LinkedList<Node> nodesOfSolution = goalNode.getPathFromRoot();
			while (!nodesOfSolution.isEmpty())
			{
				Node tempNode =  nodesOfSolution.remove();
				int temp = tempNode.action;
				if(!tempNode.isRootNode())//skip the root node, its a NO_OP/START_TRIAL
					actionSeq.addLast(temp);
			}
		}
		
		System.out.println("SOLUTION ACTION SEQUENCE- size:" + actionSeq.size() + ", steps: " + actionSeq.toString());
		
		return actionSeq;
	}
	
	public String getAgentName() {return agentName;}//public method to return the agent's name - do not remove this method
}