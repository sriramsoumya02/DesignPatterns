package command.exercise;

import command.editor.Undoable;

import java.util.Stack;

public class HistoryCommand {
    Stack<Undoable> history = new Stack<>();

    public void push(Undoable myCommand) {
        history.add(myCommand);
    }

    public Undoable pop() {
        return history.pop();
    }

    public int size() {
        return history.size();
    }
}
