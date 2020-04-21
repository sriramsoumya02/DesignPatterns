package State;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Canvas myCanvas= new Canvas();
		myCanvas.setCurrentTool(new BrushTool());
		myCanvas.mouseDown();
		myCanvas.mouseUp();
		myCanvas.setCurrentTool(new EraseTool());
		myCanvas.mouseDown();
		myCanvas.mouseUp();
		myCanvas.setCurrentTool(new SelectionTool());
		myCanvas.mouseDown();
		myCanvas.mouseUp();

	}

}
