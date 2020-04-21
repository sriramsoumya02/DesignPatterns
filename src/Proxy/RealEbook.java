package Proxy;

public class RealEbook implements Ebook {
	private String filename;
	
	public RealEbook(String filename) {
		super();
		this.filename = filename;
		load();
	}
	
	private void load() {
		System.out.println("loading e book:"+filename);
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("showing ebook :"+filename);
	}
	public String getFilename() {
		return filename;
	}

}
