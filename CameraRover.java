// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package rovuClassDiagram1.ROVU;

import rovuClassDiagram1.ROVU.Photo;
import rovuClassDiagram1.ROVU.Rover;
import rovuClassDiagram1.ROVU.mapObject;

/************************************************************/
/**
 * 
 */
public class CameraRover extends Rover {
	/**
	 * 
	 */
	private mapObject completeMap;
	/**
	 * 
	 */
	private Photo[] photos;

	/**
	 * 
	 * @return
	 */
	public mapObject getCompleteMap() {
		return completeMap;
	}

	/**
	 * 
	 * @param completeMap
	 */
	public void setCompleteMap(mapObject completeMap) {
		this.completeMap = completeMap;
	}

	/**
	 * 
	 * @return
	 */
	public Photo[] getPhotos() {
		return photos;
	}

	/**
	 * 
	 * @param photos
	 */
	public void setPhotos(Photo[] photos) {
		this.photos = photos;
	}

	/**
	 * 
	 */
	public void takePhotos() {
	}

	/**
	 * 
	 * @param completeMap 
	 */
	public void receiveMap(mapObject completeMap) {
	}

	/**
	 * 
	 */
	public void start() {
	}

	/**
	 * 
	 */
	public void sendPhotos() {
	}
};