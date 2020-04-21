package visitor;

public interface Operation {
	void apply(HeadNode node);
	void apply(Anchor node);
}
