package observer.exercise;

public class Demo {
    public static void main(String[] args) {
        Stock s = new Stock();
        Statusbar statusbar = new Statusbar(s);
        StockList stockList = new StockList(s);
        s.addObserver(statusbar);
        s.addObserver(stockList);
        s.setName("test");
        s.setPrice(20);
        s.removeObserver(statusbar);
        s.setPrice(10);
    }
}
