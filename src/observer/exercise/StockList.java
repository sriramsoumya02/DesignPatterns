package observer.exercise;

public class StockList implements ObserverExercise {
    Stock stock;

    public StockList(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void update() {
        System.out.println("stockList : " + stock.getPrice());
    }
}
