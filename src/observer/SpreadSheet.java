package observer;

public class SpreadSheet implements Observer{
	DataSource ds;
	
	public SpreadSheet(DataSource ds) {
		this.ds=ds;
	}

	/** push Style **/
	@Override
	public void update(int value) {
		// TODO Auto-generated method stub
		
		System.out.println("update spreadsheet"+value);
		
	}
	
	/** pull Style **/
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("updated Spread sheet with pull Style "+ds.getValue());
	}

}
