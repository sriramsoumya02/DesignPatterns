package observer.exercise;

import java.util.ArrayList;
import java.util.List;

public class StockSubject {
    List<ObserverExercise> observers = new ArrayList<>();

    public void addObserver(ObserverExercise o) {
        observers.add(o);
    }

    public void removeObserver(ObserverExercise o) {
        observers.remove(o);
    }

    public void notifyObserver() {
        for (ObserverExercise o : observers)
            o.update();
    }
}
