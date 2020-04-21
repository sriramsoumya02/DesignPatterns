package Bridge;

public class SonyTV implements Device{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("syntv : turn On");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("syntv : turn Off");
	}

	@Override
	public void setChannel(int number) {
		// TODO Auto-generated method stub
		System.out.println("syntv :setChannel");
	}

}
