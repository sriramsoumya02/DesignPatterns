package Mediator.exercise;

public class ButtonExercise extends UIControlExercise {
    boolean isEnabled;

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
        notifyEventHandler();
    }
}
