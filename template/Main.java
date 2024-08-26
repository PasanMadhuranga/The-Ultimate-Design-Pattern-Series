package template;

public class Main {
    public static void main(String[] args) {
        Task task = new TransferMoneyTask();
        task.execute();
        // A protected member is accessible within the same package and can also be accessed by subclasses (in any package)
        // that extend the class. So here we can access doExecute() method also. But if you move the main method to another
        // package then you can access only the execute() method.

        Task task2 = new GenerateReportTask(new AuditTrail());
        task2.execute();
    }
}
