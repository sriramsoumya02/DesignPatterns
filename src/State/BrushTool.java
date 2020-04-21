package State;

public class BrushTool implements Tool {
	
	@Override
	public void mouseDown() {
		// TODO Auto-generated method stub
		System.out.println("current tool is Brush Tool");
	}

	@Override
	public void mouseUp() {
		// TODO Auto-generated method stub
		System.out.println("Draw a line");
	}

}
