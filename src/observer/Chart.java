package observer;

public class Chart implements Observer{
	
	DataSource ds;
	
	public Chart(DataSource ds) {
		this.ds=ds;
	}
	
	/** push Style **/
	
	@Override
	public void update(int value) {
		// TODO Auto-generated method stub
		System.out.println("update Chart"+value);
		
	}
	
	/** pull Style **/

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Chart updated with pull style"+ds.getValue());
		
	}

}
