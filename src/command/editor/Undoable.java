package command.editor;

public interface Undoable extends Command {
	
	void unexecute();

}
