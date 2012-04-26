public class Problem
{
	GridState state;
	boolean hasGold;
	Goal goal;


	public Problem(GridState state, Goal goal)
	{
		this.state = state;
		this.hasGold = false;
		this.goal = goal;
	}
}