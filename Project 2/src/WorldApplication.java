/*
 * Wumpus-Lite, version 0.21 alpha
 * A lightweight Java-based Wumpus World Simulator
 * 
 * Written by James P. Biagioni (jbiagi1@uic.edu)
 * for CS511 Artificial Intelligence II
 * at The University of Illinois at Chicago
 * 
 * Thanks to everyone who provided feedback and
 * suggestions for improving this application,
 * especially the students from Professor
 * Gmytrasiewicz's Spring 2007 CS511 class.
 * 
 * Last modified 4/14/08
 * 
 * DISCLAIMER:
 * Elements of this application were borrowed from
 * the client-server implementation of the Wumpus
 * World Simulator written by Kruti Mehta at
 * The University of Texas at Arlington.
 * 
 */


import java.io.*;
import java.util.Random;

class WorldApplication {

	private static String VERSION = "v0.21a";
	public static boolean WUMPUS = false;
	public static boolean RESOLUTION = false;
	public static BufferedWriter fout;

	public static void main (String args[]) 
	{
		String outFilename = "wumpus_out.txt";
		try {fout = new BufferedWriter(new FileWriter(outFilename, true));} catch (Exception e) {}

		int worldSize = 4;
		int numTrials = 1;
		//int maxSteps = 50;
		int maxSteps = 1;

		boolean nonDeterministicMode = false;
		boolean randomAgentLoc = true;
		boolean userDefinedSeed = false;

		Random rand = new Random();
		int seed = rand.nextInt();

		int numPits = 2;
		int numWumpus = 1;

		// iterate through command-line parameters
		for (int i = 0; i < args.length; i++) 
		{

			String arg = args[i];
			
			if(arg.equals("-w") == true)
			{
				WUMPUS = Boolean.parseBoolean(args[i+1]);
				System.out.println("WUMPUS: " + WUMPUS);
				i++;
			}
			
			else if(arg.equals("-res") == true)
			{
				RESOLUTION = Boolean.parseBoolean(args[i+1]);
				System.out.println("RESOLUTION : " + RESOLUTION);
				i++;
			}

			// if the world dimension is specified
			else if (arg.equals("-d") == true) {

				if (Integer.parseInt(args[i+1]) > 1) {	    		

					worldSize = Integer.parseInt(args[i+1]);
					numPits = 2*worldSize;
					numWumpus = worldSize;
				}

				i++;
			}	    	
			// if the maximum number of steps is specified
			else if (arg.equals("-s") == true) {

				maxSteps = Integer.parseInt(args[i+1]);
				i++;

			}	    	
			// if the number of trials is specified
			else if (arg.equals("-t") == true) {

				numTrials = Integer.parseInt(args[i+1]);
				i++;

			}
			// if the random agent location value is specified
			else if (arg.equals("-a") == true) {

				randomAgentLoc = Boolean.parseBoolean(args[i+1]);
				i++;

			}
			// if the random number seed is specified
			else if (arg.equals("-r") == true) {

				seed = Integer.parseInt(args[i+1]);
				userDefinedSeed = true;
				i++;

			}
			// if the output filename is specified
			//else if (arg.equals("-f") == true) {
			//	
			//	outFilename = String.valueOf(args[i+1]);
			//	i++;
			//	
			//}
			// if the non-determinism is specified
			else if (arg.equals("-n") == true) {

				nonDeterministicMode = Boolean.parseBoolean(args[i+1]);
				i++;

			}
		}

		try {
			if(RESOLUTION) fout.write("res:"); else fout.write("dpll:");
			if(WUMPUS) fout.write("wp:"); else fout.write("p:");

			//System.out.println("Wumpus-Lite " + VERSION + "\n");
			//outputWriter.write("Wumpus-Lite " + VERSION + "\n\n");

			System.out.println("Dimensions: " + worldSize + "x" + worldSize);
			fout.write(worldSize + ":");

			//System.out.println("Maximum number of steps: " + maxSteps);
			//outputWriter.write("Maximum number of steps: " + maxSteps + "\n");

			//System.out.println("Number of trials: " + numTrials);
			//outputWriter.write("Number of trials: " + numTrials + "\n");

			//System.out.println("Random Agent Location: " + randomAgentLoc);
			//outputWriter.write("Random Agent Location: " + randomAgentLoc + "\n");

			System.out.println("Random number seed: " + seed);
			fout.write(seed + ":");		    	

			//System.out.println("Output filename: " + outFilename);
			//outputWriter.write("Output filename: " + outFilename + "\n");

			//System.out.println("Non-Deterministic Behavior: " + nonDeterministicMode + "\n");
			//outputWriter.write("Non-Deterministic Behavior: " + nonDeterministicMode + "\n\n");

			char[][][] wumpusWorld = generateRandomWumpusWorld(seed, worldSize, randomAgentLoc, numPits, numWumpus);
			Environment wumpusEnvironment = new Environment(worldSize, wumpusWorld); //, outputWriter);

			int trialScores[] = new int[numTrials];
			int totalScore = 0;

			for (int currTrial = 0; currTrial < numTrials; currTrial++) {

				Simulation trial = new Simulation(wumpusEnvironment, maxSteps, nonDeterministicMode); //, outputWriter, nonDeterministicMode);
				trialScores[currTrial] = trial.getScore();

				//System.out.println("\n\n___________________________________________\n");
				//outputWriter.write("\n\n___________________________________________\n\n");

				if (userDefinedSeed == true) 
				{
					wumpusWorld = generateRandomWumpusWorld(++seed, worldSize, randomAgentLoc, numPits, numWumpus);	
				}
				else 
				{
					wumpusWorld = generateRandomWumpusWorld(rand.nextInt(), worldSize, randomAgentLoc, numPits, numWumpus);
				}

				wumpusEnvironment = new Environment(worldSize, wumpusWorld); //, outputWriter);

				System.runFinalization();
			}

			for (int i = 0; i < numTrials; i++) 
			{
				//System.out.println("Trial " + (i+1) + " score: " + trialScores[i]);
				//outputWriter.write("Trial " + (i+1) + " score: " + trialScores[i] + "\n");
				totalScore += trialScores[i];
			}

			//System.out.println("\nTotal Score: " + totalScore);
			//outputWriter.write("\nTotal Score: " + totalScore + "\n");

			//System.out.println("Average Score: " + ((double)totalScore/(double)numTrials));
			//outputWriter.write("Average Score: " + ((double)totalScore/(double)numTrials) + "\n");

			fout.newLine();
			fout.close();
		}
		catch (Exception e) {
			System.out.println("An exception was thrown: " + e);
		}

		//System.out.println("\nFinished.");	    
	}

	public static char[][][] generateRandomWumpusWorld(int seed, int size, boolean randomlyPlaceAgent, int numPits, int numWumpus) {

		char[][][] newWorld = new char[size][size][4];
		boolean[][] occupied = new boolean[size][size];

		int x, y;

		Random randGen = new Random(seed);

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				for (int k = 0; k < 4; k++) {
					newWorld[i][j][k] = ' '; 
				}
			}
		}

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				occupied[i][j] = false;
			}
		}

		int pits = numPits;

		// default agent location
		// and orientation
		int agentXLoc = 0;
		int agentYLoc = 0;
		char agentIcon = '>';

		// randomly generate agent
		// location and orientation
		if (randomlyPlaceAgent == true) {

			agentXLoc = randGen.nextInt(size);
			agentYLoc = randGen.nextInt(size);

			switch (randGen.nextInt(4)) {

			case 0: agentIcon = 'A'; break;
			case 1: agentIcon = '>'; break;
			case 2: agentIcon = 'V'; break;
			case 3: agentIcon = '<'; break;
			}
		}

		// place agent in the world
		newWorld[agentXLoc][agentYLoc][3] = agentIcon;

		// Pit generation
		for (int i = 0; i < pits; i++) {

			x = randGen.nextInt(size);
			y = randGen.nextInt(size);

			while ((x == agentXLoc && y == agentYLoc) | occupied[x][y] == true) {
				x = randGen.nextInt(size);
				y = randGen.nextInt(size);    	   
			}

			occupied[x][y] = true;

			newWorld[x][y][0] = 'P';

		}

		// Wumpus Generation
		for (int i = 0; i < numWumpus; i++) {
			x = randGen.nextInt(size);
			y = randGen.nextInt(size);

			while (x == agentXLoc && y == agentYLoc) {
				x = randGen.nextInt(size);
				y = randGen.nextInt(size);   
			}

			occupied[x][y] = true;

			newWorld[x][y][1] = 'W';
		}

		// Gold Generation
		x = randGen.nextInt(size);
		y = randGen.nextInt(size);

		//while (x == 0 && y == 0) {
		//	x = randGen.nextInt(size);
		//	y = randGen.nextInt(size);    	   
		//}

		occupied[x][y] = true;

		newWorld[x][y][2] = 'G';

		return newWorld;
	}

}