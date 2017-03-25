// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package rovuClassDiagram1.ROVU;

import rovuClassDiagram1.ROVU.MappingRover;
import rovuClassDiagram1.ROVU.Photo;
import rovuClassDiagram1.ROVU.Rover;
import rovuClassDiagram1.ROVU.mapObject;

/************************************************************/
/**
 * 
 */
public class CentralStation {
	/**
	 * 
	 */
	private static CentralStation instance = new CentralStation();
	
	public static CentralStation getInstance() {
		return instance;
	}
	
	private CentralStation(){
		
	}
	/**
	 * 
	 */
	private mapObject map;
	
	/**
	 * 
	 */
	private Rover[] rovers;
	
	/**
	 * 
	 */
	private RoverFactory factory;
	
	
	/**
	 * 
	 * @return
	 */
	public Rover[] getRovers() {
		return rovers;
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

	/**
	 * 
	 * @return  
	 */


	/**
	 * 
	 * @param mapSection 
	 */
	public void receiveMapSection(mapObject mapSection) {
	}

	/**
	 * 
	 * @param photoArray 
	 */
	public void receivePhotos(Photo[] photoArray) {
	}

	/**
	 * 
	 */
	public void initMappingStage() {
	}

	/**
	 * 
	 * @param mappingRover 
	 */
	public void initCameraStage(MappingRover mappingRover) {
	}

	/**
	 * 
	 * @param roverID 
	 */
	public void getRoverByID(int roverID) {
	}

	/**
	 * 
	 * @param roverID 
	 */
	public void indexNewRover(Rover roverID) {
	}
};
