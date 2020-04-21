package Bridge;

public class AdvancedRemoteControl extends RemoteControl{
	public AdvancedRemoteControl(Device device) {
		super(device);
		// TODO Auto-generated constructor stub
	}

	public void setChannel(int number) {
		device.setChannel(number);
	}
}
