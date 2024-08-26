package factory;

public class Main {
    public static void main(String[] args) {
        GetPlanFactory factory = new GetPlanFactory();
        String planName = "COMMERCIALPLAN";
        int units = 12;

        Plan p = factory.getPlan(planName);

        System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");
        p.getRate();
        p.calculateBill(units);
    }
}
