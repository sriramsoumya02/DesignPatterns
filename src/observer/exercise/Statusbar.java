package observer.exercise;

public class Statusbar implements ObserverExercise {
    Stock stock;

    public Statusbar(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void update() {
        System.out.println("Statusbar :" + stock.getName());
    }
}
