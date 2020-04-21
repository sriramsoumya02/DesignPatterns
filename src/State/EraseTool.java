package State;

public class EraseTool implements Tool{
	@Override
	public void mouseDown() {
		// TODO Auto-generated method stub
		System.out.println("current tool is Erase Tool");
	}

	@Override
	public void mouseUp() {
		// TODO Auto-generated method stub
		System.out.println("Erase anything");
	}
}
