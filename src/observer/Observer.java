package observer;

public interface Observer {
	
	/** push Style **/
	void update(int value);
	
	/** pull Style **/
	void update();

}
