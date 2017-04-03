package ROVU;

public class RoverTeam {
	OldMappingRover mapper;
	CameraRover photographer;
	CO2Rover airInspector;
	
	RoverTeam(OldMappingRover m, CameraRover c, CO2Rover a){
		mapper = m;
		photographer = c;
		airInspector = a;
	}
}
