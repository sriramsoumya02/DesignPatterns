package command.exercise;

import command.editor.Undoable;

// The purpose of this class is to make sure all undoable commands have
// a VideoEditor and a History. Plus, whenever a command is executed,
// it's pushed in the history. This way, we don't have to remember to
// store each individual command in the history.
public abstract class AbstractUndoableCommand implements Undoable {
    VideoEditor videoEditor;
    HistoryCommand h;

    public AbstractUndoableCommand(VideoEditor videoEditor, HistoryCommand h) {
        this.videoEditor = videoEditor;
        this.h = h;
    }

    protected abstract void doExecute();

    @Override
    public void execute() {
        doExecute();
        h.push(this);
    }
}
