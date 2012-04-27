
public class GridPercepts {

	private final char[][][] wumpusWorldObservation;
	private final int worldSize;

	public int getWorldSize() {
		return worldSize;
	}

	public char[][][] getWumpusWorldObservation() {
		return wumpusWorldObservation;
	}

	public GridPercepts(char[][][] wumpusWorldObservation, int worldSize) {
		super();
		this.wumpusWorldObservation = wumpusWorldObservation;
		this.worldSize = worldSize;
	}

	public String toString(){
		
		//   -----------------------
		//  | P W | P W | P W | P W |
 		//  | G A | G A | G A | G A |
		//   -----------------------
		//  | P W | P W | P W | P W |
 		//  | G A | G A | G A | G A |
		//   -----------------------
		//  | P W | P W | P W | P W |
 		//  | G A | G A | G A | G A |
		//   ----------------------- 23
		//  | P W | P W | P W | P W | A A |
 		//  | G A | G A | G A | G A | A A |
		//   ----------------------------- 29
		//
		// P,W,G,A

		StringBuilder s = new StringBuilder();
		
		try {
			
			// initialize bar to the empty string
			String bar = "";
			
			// create divider bar for display output
			for (int i = 0; i < (worldSize * 5) + worldSize - 1; i++) {
				bar = bar + "-";
			}
			
			//s.append("\n -----------------------");
			//outputWriter.write("\n -----------------------" + "\n");
			
			s.append("\n " + bar + "\n");
			//outputWriter.write("\n " + bar + "\n");
			
			for (int i = worldSize-1; i > -1; i--) {
				for (int j = 0; j < 2; j++) {
					for (int k = 0; k < worldSize; k++) {
						
						if (j == 0) {
							s.append("| " + wumpusWorldObservation[i][k][0] + " " + wumpusWorldObservation[i][k][1] + " ");
							//outputWriter.write("| " + wumpusWorld[i][k][0] + " " + wumpusWorld[i][k][1] + " ");
						}
						else {
							s.append("| " + wumpusWorldObservation[i][k][2] + " " + wumpusWorldObservation[i][k][3] + " ");
							//outputWriter.write("| " + wumpusWorld[i][k][2] + " " + wumpusWorld[i][k][3] + " ");
						}
						
						if (k == worldSize-1) {
							s.append("|");
							//outputWriter.write("|");
						}
						
					}
					s.append("\n");
					//outputWriter.write("\n");
				}
				//s.append(" -----------------------");
				//outputWriter.write(" -----------------------" + "\n");
				
				s.append(" " + bar+ "\n");
				//outputWriter.write(" " + bar + "\n");
			}
			s.append("\n");
			//outputWriter.write("\n");
		}
		catch (Exception e) {
			s.append("An exception was thrown: " + e);
		}
		return s.toString();
	}
	
}
