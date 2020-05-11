package Template;

public abstract class Task {
    AuditTrail audit;

    public Task() {
        this.audit = new AuditTrail();
    }

    public void doExecute() {
        audit.record(this);
        execute();
    }

    protected abstract void execute();

}
