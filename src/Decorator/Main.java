package Decorator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream s= new CompressData(new  EncryptData(new CloudeStorage()));
		s.write("Hello132131 world");
		
	}

}
