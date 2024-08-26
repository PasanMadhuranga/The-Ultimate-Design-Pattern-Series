package template;

public class GenerateReportTask extends Task{

    // With a constructor
    public GenerateReportTask(AuditTrail audit_trail){
        super(audit_trail);
    }

    @Override
    protected void doExecute() {
        System.out.println("Generating Report");
    }
}
