package visitor.Exercise;

public class FactSegment implements Segment {
    @Override
    public void applyFilter(Filter filter) {
        filter.applyFilter(this);
    }
}
