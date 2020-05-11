package Template.exercise;

public class CameraWindow implements Window {
    @Override
    public void executeBeforeWindowClose() {
        System.out.println("Camera window before close");
    }

    @Override
    public void executeAfterWindowClose() {
        System.out.println("Camera window after close");
    }
}
