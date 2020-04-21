package Decorator;

public class EncryptData implements Stream{
	Stream s;
	
	public EncryptData(Stream s) {
		super();
		this.s = s;
	}

	@Override
	public void write(String data) {
		// TODO Auto-generated method stub
		s.write(encrypt(data));
	}
	
	private String encrypt (String data) {
		return "$^^#%"+data;		
	}
}
