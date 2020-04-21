package observer;

public class DataSource extends Subject {
	private int value;


	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
		/** push Style **/
		//notifyObservers(this);
		/** pull Style **/
		notifyObservers();
	}
	
}
