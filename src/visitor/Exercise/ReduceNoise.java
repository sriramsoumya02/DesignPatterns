package visitor.Exercise;

public class ReduceNoise implements Filter {
    @Override
    public void applyFilter(FormatSegment formatSegment) {
        System.out.println("Redusing noise on formatsegment");
    }

    @Override
    public void applyFilter(FactSegment factSegment) {
        System.out.println("Redusing noise on factSegment");
    }
}
