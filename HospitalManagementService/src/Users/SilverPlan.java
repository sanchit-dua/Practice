package Users;

public class SilverPlan extends HealthInsurancePlan {
	
	SilverPlan(){
		setCoverage(0.7);
	}

	@Override
	public double computeMonthlyPremium(double salary, int age, boolean smoking) {
		
		return (salary * 0.06) + getOfferedBy().computeMonthlyPremium(this, age, smoking);
	}

}
