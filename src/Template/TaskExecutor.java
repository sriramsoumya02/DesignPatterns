package Template;

public class TaskExecutor {
	AuditTrail audit;
	public TaskExecutor(AuditTrail audit) {
		this.audit= audit;
	}
	
	public void execute(Task task) {
		audit.record(task);
		//task.execute();
	}

}
