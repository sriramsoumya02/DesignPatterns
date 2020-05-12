package chainOfResponsibility.exercise;

public class Excel extends DataReader {
    public Excel(DataReader next) {
        super(next);
    }

    @Override
    protected boolean doHandle(String filename) {
        System.out.println("Reading data from an Excel spreadsheet.");
        return true;
    }

    @Override
    protected String getExtension() {
        return ".xls";
    }
}
