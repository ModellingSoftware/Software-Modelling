package rovuClassDiagram1.ROVU;

import javax.vecmath.Vector3d;

public class Coordinate{
	private int x, y;
	
	
	
	Coordinate(int xc, int yc){
		x = xc; y = yc;
	}
	public int getx(){
		return x;
	}
	public int gety(){
		return y;
	}
	
	public boolean equals(Coordinate c){
		if(x==c.getx() && y==c.gety()){
			return true;
		}
		return false;
	}
}
