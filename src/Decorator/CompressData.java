package Decorator;

public class CompressData implements Stream {
	Stream s;
	
	public CompressData(Stream s) {
		super();
		this.s = s;
	}

	@Override
	public void write(String data) {
		// TODO Auto-generated method stub
		s.write(compress(data));
	}
	
	private String compress(String data) {
		return data.substring(0,5);
	}
	

}
