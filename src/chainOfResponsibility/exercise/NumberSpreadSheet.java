package chainOfResponsibility.exercise;

public class NumberSpreadSheet extends DataReader {
    public NumberSpreadSheet(DataReader next) {
        super(next);
    }

    @Override
    protected boolean doHandle(String filename) {
        System.out.println("Reading data from a Numbers spreadsheet.");
        return true;
    }

    @Override
    protected String getExtension() {
        return ".numbers";
    }
}
