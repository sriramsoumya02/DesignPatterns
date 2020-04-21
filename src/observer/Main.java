package observer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/** push style **/
		/*
		 SpreadSheet s= new SpreadSheet();
		Chart c= new Chart();
		DataSource ds= new DataSource();
		ds.addObservers(s);
		ds.addObservers(c);
		ds.setValue(0);
		ds.removeObservers(s);
		ds.setValue(1);
		*/
		DataSource ds= new DataSource();
		
		SpreadSheet s= new SpreadSheet(ds);
		Chart c= new Chart(ds);
		ds.addObservers(s);
		ds.addObservers(c);
		ds.setValue(0);
		ds.removeObservers(s);
		ds.setValue(1);

		

	}

}
