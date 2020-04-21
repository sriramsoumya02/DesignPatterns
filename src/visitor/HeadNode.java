package visitor;

public class HeadNode implements HTMLNode {
	private String nodename= "HeadNode";

	public String getNodename() {
		return nodename;
	}

	@Override
	public void execute(Operation op) {
		// TODO Auto-generated method stub
		op.apply(this);
		
	}
	
	
}
