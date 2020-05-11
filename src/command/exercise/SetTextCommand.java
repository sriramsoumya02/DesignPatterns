package command.exercise;

public class SetTextCommand extends AbstractUndoableCommand {
    String text;
    String prevText;


    public SetTextCommand(VideoEditor videoEditor, String text, HistoryCommand h) {
        super(videoEditor, h);
        this.text = text;
        prevText = videoEditor.getLabel();
    }

    @Override
    public void unexecute() {
        videoEditor.setLabel(prevText);
    }

    @Override
    protected void doExecute() {
        videoEditor.setLabel(text);
    }

}
