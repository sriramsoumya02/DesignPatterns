package Mediator.exercise;

public class TextboxExercise extends UIControlExercise {
    String Content;

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        this.Content = content;
        notifyEventHandler();
    }
}
