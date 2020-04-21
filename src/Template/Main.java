package Template;

public class Main {
	
	public static void main(String[] args) {
		AuditTrail audit=new AuditTrail();
		Task tt= new TransferTask(audit);
		tt.doExecute(tt);
		Task gr= new GenerateReport(audit);
		gr.doExecute(gr);
	}

}
