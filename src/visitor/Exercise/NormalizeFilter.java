package visitor.Exercise;

public class NormalizeFilter implements Filter {
    @Override
    public void applyFilter(FormatSegment formatSegment) {
        System.out.println("NormalizeFilter on formatsegment");
    }

    @Override
    public void applyFilter(FactSegment factSegment) {
        System.out.println("NormalizeFilter on formatsegment");
    }
}
