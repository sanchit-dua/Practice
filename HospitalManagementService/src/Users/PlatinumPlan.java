package Users;

public class PlatinumPlan extends HealthInsurancePlan {
	
PlatinumPlan(){
	setCoverage(0.9);
}

@Override
public double computeMonthlyPremium(double salary, int age, boolean smoking) {
	
	return (salary*0.08) + getOfferedBy().computeMonthlyPremium(this, age, smoking);
}
}
