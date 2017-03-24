package rovuClassDiagram1.ROVU;

import javax.swing.JOptionPane;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import java.io.*;

public class Client {

	PrintStream out;
	//Scanner in;
	
	Client() {
		out = new PrintStream(System.out);

	}
	
	public void Start() {		
		boolean loggedIn = false;
		
		while (true) {
			String operator = logIn();

			if (operator == "mainOperator") {
				if (mainOperatorMenu().equals("Start Mission")) {
					startMission();
				}
				out.printf("yo");
				//mainOperatorMenu();
			} else if (operator == "assistantOperator") {
				//assistantOperatorMenu();
				out.printf("tryagain");
			}
		}
	}
	
	public String logIn() {
		String username = "reaL";
		String password = "Deal";
		
		JFrame frame = new JFrame("ROVU");
		
		Object[] inputField = null;
		
		String givenUser = (String)JOptionPane.showInputDialog(frame, "Please fill in your Username: ", "ROVU Client", JOptionPane.PLAIN_MESSAGE, null, inputField, "");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
		if (givenUser != null) {
			if (givenUser.equals(username)) {
				String givenPass = (String)JOptionPane.showInputDialog(frame, "Please fill in your Password: ", "ROVU Client", JOptionPane.PLAIN_MESSAGE, null, inputField, "");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.pack();
				frame.setVisible(true);
				
				if (givenUser != null) {
					if (givenPass.equals(password)) {
						return "mainOperator";
					}
				}
			}
		}
		//showDialogue
		//String input = getInput()
		/**for () {
		 * if (getLineInFile()) {
			 * if input == passWordOnThisLine(){
			 * 	String operator = readOperatorType();
			 * }
			}
		 * 
		 * return operator;
		**/
		return "assistantOperator";
	}
	
	String mainOperatorMenu() {
		JFrame frame = new JFrame("ROVU");
		
		Object[] inputField = {"Start Mission", "Photos", "CO2 Levels"};
		
		String givenUser = (String)JOptionPane.showInputDialog(frame, " ", "ROVU Client", JOptionPane.PLAIN_MESSAGE, null, inputField, "");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
		return givenUser;
	}
	
	void startMission() {
		if (defaultSettings()) {
			Mission mission = new Mission();
			mission.startMission();
		}
		else {			
			int[] numberOfRovers = askNumOfRovers(); //number of mapping rovers at index 0, number of photo rovers at index 1
			Mission mission = new Mission(numberOfRovers[0], numberOfRovers[1]);
			mission.startMission();
		}					
	}
	
	boolean defaultSettings() {
		JFrame frame = new JFrame("ROVU");
		
		Object[] inputField = {"Default Settings", "Customized Settings"};
		
		String settings = (String)JOptionPane.showInputDialog(frame, " ", "ROVU Client", JOptionPane.PLAIN_MESSAGE, null, inputField, "");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
		if (settings.equals("Default Settings")) {
			return true;
		}
		return false;
	}
	
	int[] askNumOfRovers() {
		int[] numOfMapAndPhotoRovers = new int[2];
		JFrame frame = new JFrame("ROVU");
		
		Object[] inputField = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"};
		
		String givenNumOfMapRovers = (String)JOptionPane.showInputDialog(frame, "Choose the amount of mapping rovers for this mission (default = 4): ", "ROVU Client", JOptionPane.PLAIN_MESSAGE, null, inputField, "");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
		inputField = new Object[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"};
		String givenNumOfPhotoRovers = (String)JOptionPane.showInputDialog(frame, "Choose the amount of mapping rovers for this mission (default = 4): ", "ROVU Client", JOptionPane.PLAIN_MESSAGE, null, inputField, "");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
		numOfMapAndPhotoRovers[0] = Integer.parseInt(givenNumOfMapRovers);
		numOfMapAndPhotoRovers[1] = Integer.parseInt(givenNumOfPhotoRovers);
				
		return numOfMapAndPhotoRovers;
	}
	
	public static void main(String[] args) {
		new Client().Start();
	}
}
