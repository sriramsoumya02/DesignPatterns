package Proxy;

public class LoggingEbookProxy implements Ebook {
	
	String filename;
	RealEbook ebook;
	
	public LoggingEbookProxy(String filename) {
		super();
		this.filename = filename;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		if(ebook == null)
			ebook= new RealEbook(filename);
		System.out.println("Loggig");
		ebook.show();
	}

	@Override
	public String getFilename() {
		// TODO Auto-generated method stub
		return filename;
	}

}
