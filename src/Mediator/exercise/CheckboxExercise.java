package Mediator.exercise;

public class CheckboxExercise extends UIControlExercise {
    boolean isChecked;

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
        notifyEventHandler();
    }
}
