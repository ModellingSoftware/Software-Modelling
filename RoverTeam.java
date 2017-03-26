package ROVU;

public class RoverTeam {
	MappingRover mapper;
	CameraRover photographer;
	CO2Rover airInspector;
	
	RoverTeam(MappingRover m, CameraRover c, CO2Rover a){
		mapper = m;
		photographer = c;
		airInspector = a;
	}
}
