package Template;

public class TransferTask extends Task{

	public TransferTask(AuditTrail audit) {
		super(audit);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void execute(Task task) {
		// TODO Auto-generated method stub
		System.out.println("Transfer Money");
	}


}
