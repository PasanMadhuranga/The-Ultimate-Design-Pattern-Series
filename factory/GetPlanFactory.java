package factory;

public class GetPlanFactory {
    public Plan getPlan(String planType){
        if (planType == null){
            return null;
        }

        if (planType.equals("DOMESTICPLAN")){
            return new DomesticPlan();
        } else if(planType.equalsIgnoreCase("COMMERCIALPLAN")){
            return new CommercialPlan();
        } else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
            return new InstitutionalPlan();
        }

        return null;
    }
}
