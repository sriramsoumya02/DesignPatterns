package visitor;

public class Anchor implements HTMLNode{
	private String nodename="Anchor";

	public String getNodename() {
		return nodename;
	}

	@Override
	public void execute(Operation op) {
		// TODO Auto-generated method stub
		op.apply(this);
	}

}
