// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package ROVU;

import javax.vecmath.Vector3d;

/************************************************************/
/**
 * 
 */
public class CameraRover extends Rover {
	
	public CameraRover(Vector3d arg0, String arg1) {
		super(arg0, arg1);
	}

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
