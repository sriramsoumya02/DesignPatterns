package chainOfResponsibility.exercise;

public class Account {
    DataReader dataReader;

    public Account(DataReader dataReader) {
        this.dataReader = dataReader;
    }

    public void readFile(String fileName) {
        dataReader.handle(fileName);
    }


}
