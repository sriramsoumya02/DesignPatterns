package Mediator;

public class Button extends UIControl{
	
	private boolean isEnabled;
	
	
	public boolean getIsEnabled() {
		return isEnabled;
	}

	public void setIsEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
		notifyEventHandler();
	} ;	

}
