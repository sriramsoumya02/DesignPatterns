package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	List<Observer> observers= new ArrayList<Observer>();
	
	public void addObservers(Observer observer) {
		observers.add(observer);
	}
	public void removeObservers(Observer observer) {
		observers.remove(observer);
	}
	/** push Style **/
	public void notifyObservers(DataSource data) {
		for (Observer observer : observers) {
			observer.update(data.getValue());
		}
	}
	/** pull Style **/
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
}
