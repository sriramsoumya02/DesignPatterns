package Bridge;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Device sony= new SonyTV();
		RemoteControl basic= new RemoteControl(sony);
		AdvancedRemoteControl advanced= new AdvancedRemoteControl(sony);
		basic.turnOn();
		basic.turnOff();
		advanced.setChannel(10);
	}

}
