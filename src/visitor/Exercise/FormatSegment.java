package visitor.Exercise;

public class FormatSegment implements Segment {
    @Override
    public void applyFilter(Filter filter) {
        filter.applyFilter(this);
    }
}
