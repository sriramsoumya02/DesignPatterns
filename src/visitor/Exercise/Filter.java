package visitor.Exercise;

public interface Filter {
    void applyFilter(FormatSegment formatSegment);

    void applyFilter(FactSegment factSegment);
}
