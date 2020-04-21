package Template;

public abstract class  Task {
  AuditTrail audit;
  public Task(AuditTrail audit) {
	  this.audit=audit;
  }
  
  public void doExecute(Task task) {
	  audit.record(task);
	  task.execute(task);
  }
  
  protected abstract void execute(Task task);
  
}
