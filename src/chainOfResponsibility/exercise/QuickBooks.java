package chainOfResponsibility.exercise;

public class QuickBooks extends DataReader {
    public QuickBooks(DataReader next) {
        super(next);
    }

    @Override
    protected boolean doHandle(String filename) {
        System.out.println("Reading data from a QuickBooks file.");
        return true;
    }

    @Override
    protected String getExtension() {
        return ".qbw";
    }
}
