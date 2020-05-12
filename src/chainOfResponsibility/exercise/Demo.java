package chainOfResponsibility.exercise;

public class Demo {
    public static void main(String[] args) {
        QuickBooks q = new QuickBooks(null);
        NumberSpreadSheet n = new NumberSpreadSheet(q);
        Excel excel = new Excel(n);
        Account a = new Account(excel);
        a.readFile("abc.numbers");
        a.readFile("abc.qbw");
        a.readFile("abc.xyz");
    }
}
