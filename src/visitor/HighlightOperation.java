package visitor;

public class HighlightOperation implements Operation{


	@Override
	public void apply(HeadNode node) {
		// TODO Auto-generated method stub
		System.out.println("head node highlighted");
	}

	@Override
	public void apply(Anchor node) {
		// TODO Auto-generated method stub
		System.out.println("anchor node highlighted");
	}

}
