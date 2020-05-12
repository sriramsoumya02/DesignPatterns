package Mediator.exercise;

import Mediator.EventHandler;

import java.util.ArrayList;
import java.util.List;

public class UIControlExercise {
    List<EventHandler> eventHandlers = new ArrayList<>();

    public void attach(EventHandler e) {
        eventHandlers.add(e);
    }

    public void notifyEventHandler() {
        for (EventHandler e : eventHandlers)
            e.handle();
    }
}
