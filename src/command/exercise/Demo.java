package command.exercise;

public class Demo {
    public static void main(String[] args) {
        VideoEditor videoEditor = new VideoEditor();
        HistoryCommand history = new HistoryCommand();

        SetTextCommand setTextCommand = new SetTextCommand(videoEditor, "Video Title", history);
        setTextCommand.execute();
        System.out.println("TEXT: " + videoEditor);

        ContrastCommand setContrast = new ContrastCommand(videoEditor, 1, history);
        setContrast.execute();
        System.out.println("CONTRAST: " + videoEditor);

        SetTextCommand setTextCommand1 = new SetTextCommand(videoEditor, "Video Title1", history);
        setTextCommand1.execute();

        ContrastCommand setContrast1 = new ContrastCommand(videoEditor, 1.5f, history);
        setContrast1.execute();

        UndoExerciseCommand undoCommand = new UndoExerciseCommand(history);
        undoCommand.execute();
        System.out.println("UNDO: " + videoEditor);

        undoCommand.execute();
        System.out.println("UNDO: " + videoEditor);

        undoCommand.execute();
        System.out.println("UNDO: " + videoEditor);
    }
}
