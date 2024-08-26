package template;

public abstract class Task {
    private AuditTrail audit_trail;

    public Task(){
        audit_trail = new AuditTrail();
    }

    public Task(AuditTrail audit_trail){
        this.audit_trail = audit_trail;
    }

    public void execute(){
        audit_trail.record();
        doExecute();
    }

    protected abstract void doExecute();
}
