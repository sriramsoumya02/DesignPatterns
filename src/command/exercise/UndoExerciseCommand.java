package command.exercise;

import command.editor.Command;

public class UndoExerciseCommand implements Command {
    private HistoryCommand history;

    public UndoExerciseCommand(HistoryCommand history) {
        this.history = history;
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        if (history.size() > 0)
            history.pop().unexecute();
    }
}
