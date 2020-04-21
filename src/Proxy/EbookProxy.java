package Proxy;

public class EbookProxy implements Ebook{
	
	RealEbook ebook;
	String filename;
	
	public EbookProxy(String filename) {
		super();
		this.filename = filename;
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		if(ebook == null)
			ebook= new RealEbook(filename);
		ebook.show();
	}
	public String getFilename() {
		return filename;
	}

}
