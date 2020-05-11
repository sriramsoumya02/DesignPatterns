package Template.exercise;

public class ChatWindow implements Window {
    @Override
    public void executeBeforeWindowClose() {
        System.out.println("Chat window before close");
    }

    @Override
    public void executeAfterWindowClose() {
        System.out.println("Chat window after close");
    }
}
