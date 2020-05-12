package visitor.Exercise;

public class AddReverb implements Filter {
    @Override
    public void applyFilter(FormatSegment formatSegment) {
        System.out.println("Adreverb on formatsegment");
    }

    @Override
    public void applyFilter(FactSegment factSegment) {
        System.out.println("Adreverb on factSegment");
    }
}
