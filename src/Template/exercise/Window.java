package Template.exercise;

public interface Window {
    void executeBeforeWindowClose();

    void executeAfterWindowClose();

    public default void close() {
        executeAfterWindowClose();
        System.out.println("window closing");
        executeAfterWindowClose();
    }
}
