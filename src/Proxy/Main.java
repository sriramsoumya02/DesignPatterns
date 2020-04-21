package Proxy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library library= new Library();
		String [] booknames= {"1","2","3","4"};
		for(String filename:booknames) {
			//library.add(new EbookProxy(filename));
			library.add(new LoggingEbookProxy(filename));
		}
		library.openEbook("3");
		library.openEbook("1");
	}

}
