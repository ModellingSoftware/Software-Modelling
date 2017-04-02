// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package ROVU;

import javax.vecmath.Vector3d;

import jogamp.nativewindow.Debug;

import java.io.*;

/************************************************************/
/**
 * 
 */
public class MappingRover extends Rover {
	public MappingRover(Vector3d arg0, String arg1) {
		super(arg0, arg1);
		out = new PrintStream(System.out);
		this.setCurrentMode("waiting");
	}
	
	PrintStream out;

	/**
	 * 
	 */
	private mapObject map;
	
	private Vector3d destination;

	/**
	 * 
	 */
	public void updateMap() {
	}

	/**
	 * 
	 * @return  
	 */
	public boolean isDoneMapping() {
		return false;
	}

	/**
	 * 
	 */
	public void start() {
	}

	/**
	 * 
	 */
	public void sendMap() {
	}

	/**
	 * 
	 * @return
	 */
	public mapObject getMap() {
		return map;
	}

	/**
	 * 
	 * @param map
	 */
	public void setMap(mapObject map) {
		this.map = map;
	}
	
	public boolean reachedDestination() {
		Vector3d currentPos = this.getPosition();
		
		if (currentPos.x == destination.x && currentPos.y == destination.y && currentPos.z == destination.z) {
			return true;
		}
		
		return false;
	}
	
	public void initBehaviour() {
		out.print("init");

		//this.setCurrentMode("waiting");
	}
	
	public void performBehavior() {
    	if (this.isActive()) {
    		out.print("isActive");
    		
	    	Rover collidingRover = null;
	    	// perform the following actions every 5 virtual seconds
	    	if(this.getCounter() % 5 == 0) {
	        	out.print("perfStart");
	        	out.print(this.getCounter());
	        	out.print(this.getCurrentMode());
	    		/*if (this.getCurrentMode().equals("waiting") && this.getCounter() % 20 == 0) {
	    			this.setCurrentMode("moveStep");
		        	out.print("perfwaitedLongEnough");
	    		}*/
	        	out.print("perfAboutToMoveStep");

	    		if (this.getCurrentMode().equals("moveStep")) {
		        	out.print("perfMoveStep");

	    			if (reachedDestination()) {
	    				this.setCurrentMode("waiting");
	    			} else {    		
			        	setRotationalVelocity(0);
			        	
			        	Vector3d currentPos = this.getPosition();
			        	destination = new Vector3d (currentPos.x + 1, currentPos.y, currentPos.z);
			        	
			            this.setTranslationalVelocity(getMaxSpeed());
	    			}
	    		} else if(this.getCurrentMode().equals("waiting")) {
			        	this.setTranslationalVelocity(0);
	    		}
	    	}
    	}
    	out.print("perfend");
	}
};
