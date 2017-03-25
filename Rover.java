// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package rovuClassDiagram1.ROVU;

import rovuClassDiagram1.ROVU.RoverType;
import rovuClassDiagram1.ROVU.Vector3D;

/************************************************************/
/**
 * 
 */
public abstract class Rover {
	/**
	 * 
	 */
	private int id;
	/**
	 * 
	 */
	private float speed;
	/**
	 * 
	 */
	private int direction;
	/**
	 * 
	 */
	private Vector3D position;
	/**
	 * 
	 */
	private float maxSpeed;
	/**
	 * 
	 */
	private boolean active;
	
	/**
	 * 
	 * @return
	 */
	public int getId() {
		return id;
	}

	/**
	 * 
	 * @return
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 
	 * @return
	 */
	public float getSpeed() {
		return speed;
	}

	/**
	 * 
	 * @return
	 */
	public void setSpeed(float speed) {
		this.speed = speed;
	}

	/**
	 * 
	 * @return
	 */
	public int getDirection() {
		return direction;
	}

	/**
	 * 
	 * @return
	 */
	public void setDirection(int direction) {
		this.direction = direction;
	}

	/**
	 * 
	 * @return
	 */
	public Vector3D getPosition() {
		return position;
	}

	/**
	 * 
	 * @return
	 */
	public void setPosition(Vector3D position) {
		this.position = position;
	}

	/**
	 * 
	 * @return
	 */
	public float getMaxSpeed() {
		return maxSpeed;
	}

	/**
	 * 
	 * @return
	 */
	public void setMaxSpeed(float maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	/**
	 * 
	 * @return
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * 
	 * @return
	 */
	public void setActive(boolean active) {
		this.active = active;
	}

	/**
	 * 
	 * @return
	 */
	public RoverType getType() {
		return type;
	}

	/**
	 * 
	 * @return
	 */
	public void setType(RoverType type) {
		this.type = type;
	}

	/**
	 * 
	 * @return
	 */
	public CentralStation getCentralStation() {
		return centralStation;
	}

	/**
	 * 
	 * @return
	 */
	public void setCentralStation(CentralStation centralStation) {
		this.centralStation = centralStation;
	}

	/**
	 * 
	 */
	private RoverType type;
	
	/**
	 * 
	 */
	private CentralStation centralStation;

	/**
	 * 
	 * @param direction 
	 */
	public void moveInDirection(int direction) {
	}

	/**
	 * 
	 * @param Coordinate 
	 */
	public void moveToCoordinate(Vector3D Coordinate) {
	}

	/**
	 * 
	 */
	public void turnOff() {
	}
};