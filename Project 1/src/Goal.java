
public class Goal 
{
	XYPair locationOfGold;
	
	public Goal(GridState state)
	{
		char[][][] wWorld = state.getWumpusWorld();
		int size = state.getWorldSize();
		
		for (int i = 0; i < size; i++) 
			for (int j = 0; j < size; j++) 
				if(wWorld[i][j][2] == 'G')
				{
					this.locationOfGold = new XYPair(j, i);
					break;
				}
	}
	
	boolean isGoal(Node n)
	{
		if(n == null)
			return false;
		else if (n.hasGold)
			return true;
		else 
			return false;
	}
}
