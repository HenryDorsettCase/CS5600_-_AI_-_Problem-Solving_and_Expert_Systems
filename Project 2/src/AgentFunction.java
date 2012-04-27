/*
 * Class that defines the agent function.
 * 
 * Written by James P. Biagioni (jbiagi1@uic.edu)
 * for CS511 Artificial Intelligence II
 * at The University of Illinois at Chicago
 * 
 * Last modified 2/19/07 
 * 
 * DISCLAIMER:
 * Elements of this application were borrowed from
 * the client-server implementation of the Wumpus
 * World Simulator written by Kruti Mehta at
 * The University of Texas at Arlington.
 * 
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class AgentFunction 
{
	PL_DPLL dpll;
	PL_Resolution resolution;
	
	ClausesSet KB;
	InitKnowledgeBase initKB;
	Symbols symbols;
	
	BufferedReader reader;
	
	public AgentFunction()
	{
		this.KB = new ClausesSet();
		this.symbols = new Symbols();
		
		this.dpll = new PL_DPLL();
		this.resolution = new PL_Resolution();
		
		reader = new BufferedReader( new InputStreamReader( System.in ) );
	}

	public int process(TransferPercept tp)
	{
		System.out.println("Agent got percepts:" + tp.getGridPercepts());
		
		//Load Knowledge Base
		new InitKnowledgeBase(this.KB, tp, WorldApplication.WUMPUS, WorldApplication.RESOLUTION);//true means include Stench/Wumpus rules
		System.out.println("LOADED KB FROM GRID");
		System.out.println("KB.size():" + this.KB.size());
		//this.KB.print();
		//try{reader.readLine();}catch (Exception e){}
		
		//Load Symbols of Knowledge Base
		new InitSymbolsList(this.symbols, tp, WorldApplication.WUMPUS);//true means include Stench/Wumpus symbols
		System.out.println("LOADED SYMBOLS OVER GRID");
		System.out.println("symbols.size(): " + symbols.size());
		//System.out.println("symbols: " + symbols);
		//try{reader.readLine();}catch (Exception e){}
		
		//Run & Time DPLL or RESOLUTION - uncomment the SAT solver you wish to run
		long startTimeMs = System.currentTimeMillis();//START TIMER
		
		boolean result;
		if(WorldApplication.RESOLUTION)
			result = resolution.Resolution_Satisfiable(this.KB);
		else
			result = dpll.DPLL_Satisfiable(this.KB, this.symbols);
		
		System.out.println(result);
		
		long finishTimeMs = System.currentTimeMillis(); //END TIMER
		long totalTimeMs = finishTimeMs - startTimeMs;
		System.out.println("Total time(ms): " + totalTimeMs);
		
		//Conclusion
		try 
		{	
			WorldApplication.fout.write(totalTimeMs + ":");
			if(result)WorldApplication.fout.write("1"); else WorldApplication.fout.write("0");
		}
		catch(Exception e){}
		
	    return Action.END_TRIAL;    
	}
	
	// string to store the agent's name. Do not remove this variable
	private String agentName = "Agent Smith";
	// public method to return the agent's name. Do not remove this method
	public String getAgentName() {return agentName;}
}