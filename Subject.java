package ROVU;

import java.util.ArrayList;

public class Subject {
	
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	private int state;

	public int getState() {
		return this.state;
	}

	public void setState(int state) {
		this.state = state;
		this.notifyAllObservers();
	}
	
	public void attach(Observer observer) {
		this.observers.add(observer);
	}
	
	public void detach(Observer observer) {
		//this.observers.remove(test.indexOf(observer));
	}
	
	public void notifyAllObservers() {
		for (Observer observer : this. observers) {
			//observer.update();
		}
	}
}
