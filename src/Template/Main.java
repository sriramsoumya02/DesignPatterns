package Template;

public class Main {

    public static void main(String[] args) {
        Task tt = new TransferTask();
        tt.doExecute();
        Task gr = new GenerateReport();
        gr.doExecute();
    }

}
