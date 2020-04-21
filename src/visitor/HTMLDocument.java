package visitor;

import java.util.ArrayList;
import java.util.List;

public class HTMLDocument {

	private List<HTMLNode> nodes= new ArrayList<HTMLNode>();
	//private List<Operation> operations= new ArrayList<Operation>();
	
	public void add(HTMLNode node) {
		nodes.add(node);
	}
	
	public void executeOpertaion(Operation op) {
		for (HTMLNode node : nodes) {
			node.execute(op);
		}
	}
}
