package rovuClassDiagram1.ROVU;

public class CoordinateWithPriority implements Comparable<CoordinateWithPriority>{
	
	Coordinate coordinate;
	double priority;
	
	CoordinateWithPriority(Coordinate c, double p){
		coordinate	= c;
		priority 	= p;
	}

	@Override
	public int compareTo(CoordinateWithPriority o) {
		return Double.compare(this.priority, o.priority);
	}
	
}
