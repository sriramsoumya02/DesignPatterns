package Bridge;

public  class RemoteControl {
	Device device;
	
	public RemoteControl(Device device) {
		super();
		this.device = device;
	}
	public  void turnOn() {
		device.turnOn();
	}
	public  void turnOff() {
		device.turnOff();
	}
}
