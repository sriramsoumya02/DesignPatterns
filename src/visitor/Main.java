package visitor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HTMLDocument doc= new HTMLDocument();
		doc.add(new HeadNode());
		doc.add(new Anchor());
		doc.executeOpertaion(new HighlightOperation());
		doc.executeOpertaion(new PlainTextOperation());
	}

}
