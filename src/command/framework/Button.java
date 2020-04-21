package command.framework;

public class Button {
	
	String label;
	Command command;
	
	public Button(Command command) {
		this.command=command;
	}
	
	public void onClick() {
		command.execute();
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}
