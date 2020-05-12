package chainOfResponsibility.exercise;

public abstract class DataReader {
    DataReader next;

    public DataReader(DataReader next) {
        this.next = next;
    }

    public void handle(String filename) {
        if (filename.endsWith(getExtension())) {
            doHandle(filename);
            return;
        } else if (next != null)
            next.handle(filename);
        else
            throw new UnsupportedOperationException("File format not supported.");
    }

    protected abstract boolean doHandle(String filename);

    protected abstract String getExtension();
}
