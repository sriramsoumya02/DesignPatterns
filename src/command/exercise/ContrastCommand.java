package command.exercise;

public class ContrastCommand extends AbstractUndoableCommand {
    float contrast;
    float preContrast;


    public ContrastCommand(VideoEditor videoEditor, float contrast, HistoryCommand h) {
        super(videoEditor, h);
        this.contrast = contrast;
        preContrast = videoEditor.getContrast();
    }

    @Override
    public void unexecute() {
        videoEditor.setContrast(preContrast);
    }

    @Override
    protected void doExecute() {
        videoEditor.setContrast(contrast);
    }
}
