package Mediator;

import java.util.ArrayList;
import java.util.List;


public class UIControl {
	
	List<EventHandler> eventHandlers= new ArrayList<EventHandler>();
	
	public void addEventController(EventHandler eventHandler) {
		eventHandlers.add(eventHandler);
	}
	public void removeObservers(EventHandler observer) {
		eventHandlers.remove(observer);
	}
	/** push Style **/
	public void notifyEventHandler(UIControl control) {
		for (EventHandler eventHandler : eventHandlers) {
			//observer.changed(control);
		}
	}
	/** pull Style **/
	protected void notifyEventHandler() {
		for (EventHandler eventHandler : eventHandlers) {
			eventHandler.handle();
		}
	}
}
