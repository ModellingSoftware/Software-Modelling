package ROVU;

import javax.swing.JOptionPane;
import javax.vecmath.Vector3d;

import simbad.sim.Agent;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import java.io.*;
import java.util.ArrayList;

public class Client {

	PrintStream out;
	//Scanner in;
	
	Client() {
		out = new PrintStream(System.out);

	}
	
	public void Start() {		
		boolean loggedIn = false;
		
		while (!loggedIn) {
			String operator = logIn();

			if (operator == "mainOperator") {
				if (mainOperatorMenu().equals("Start Mission")) {
					startMission();
					loggedIn = true;
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
				
				if (givenPass != null) {
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
		Environment newEnvironment = new Environment();

		if (defaultSettings()) {
			Mission mission = new Mission(newEnvironment);
			mission.startMission();
		}
		else {			
			int numberOfRoverTeams = askNumOfRoverTeams();
			
			Mission mission = new Mission(numberOfRoverTeams, newEnvironment);
			
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
	
	int askNumOfRoverTeams() {
		JFrame frame = new JFrame("ROVU");
		
		Object[] inputField = new Object[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"};
		String givenNumOfRoverTeams = (String)JOptionPane.showInputDialog(frame, "Choose the amount of rover teams for this mission (default = 4): ", "ROVU Client", JOptionPane.PLAIN_MESSAGE, null, inputField, "");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
						
		return Integer.parseInt(givenNumOfRoverTeams);
	}
	
	public static void main(String[] args) {
		new Client().Start();
	}
}
