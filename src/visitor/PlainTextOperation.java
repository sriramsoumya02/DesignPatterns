package visitor;

public class PlainTextOperation implements Operation{

	

	@Override
	public void apply(HeadNode node) {
		// TODO Auto-generated method stub
		System.out.println("head node plaintext");
	}

	@Override
	public void apply(Anchor node) {
		// TODO Auto-generated method stub
		System.out.println("anchor node plaintext");
	}

}
