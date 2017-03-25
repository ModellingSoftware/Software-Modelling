// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------


package rovuClassDiagram1.ROVU;
import java.io.*;
import java.util.ArrayList;

import javax.vecmath.Vector3d;

import rovuClassDiagram1.ROVU.CentralStation;
import simbad.gui.Simbad;
import simbad.sim.Agent;

public class Mission {
	
	private int	numOfRoverTeams;
	private Environment environment;
	
	PrintStream out;
	
	Mission(Environment env) {
		out = new PrintStream(System.out);
		numOfRoverTeams = 1;
		out.print("Be Starting Missions All Day");
		environment = env;

	}
	
	Mission(int numbOfRoverTeams, Environment env) {
		numOfRoverTeams = numbOfRoverTeams;
		environment = env;
	}
		
	public CentralStation centralStation;
	
	/**
	 * 
	 */
	public void startMission() {
		centralStation = CentralStation.getInstance();
		
		addRoversToEnvironment();
		
		centralStation.initMappingStage();
		
		
	}
	
	/**
	 * 
	 * @param numRovers
	 */
	public void startMission(int numRovers) {
		
	}
	
	/**
	 * 
	 */
	public void stopMission() {
		
	}
	
	/**
	 * 
	 * @return
	 */
	public String getMissionStatus() {
		return "";
	}
	
	public void addRoversToEnvironment() {
		
        ArrayList<Agent> swarm = new ArrayList<Agent>();
        
        for (int i = 0; i < numOfRoverTeams; i++) {
        	swarm.add(new ExampleRobot(new Vector3d(0, 0, 0), "Mapping " + i));
        	swarm.add(new ExampleRobot(new Vector3d(-2, 0, -2), "Photo " + i));
        }
        
        for(Agent robot:swarm){
        	environment.add(robot);
        }
        
        new Simbad(environment, false);
	}
}
