package Decorator;

public class CloudeStorage implements Stream{

	@Override
	public void write(String data) {
		// TODO Auto-generated method stub
		System.out.println("Storing : "+data);
	}

}
