package command.editor;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {
	private Deque<Undoable> commands= new ArrayDeque<Undoable>();
	
	public void push(Undoable e) {
		commands.add(e);
	}
	public Undoable pop() {
		return commands.pop();
	}
	
	public int size() {
		return  commands.size();
	}

}
