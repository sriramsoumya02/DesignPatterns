package visitor;

public interface HTMLNode {
	public String getNodename();
	public void execute(Operation op);
}
