package Users;

public class BronzePlan extends HealthInsurancePlan {
	
	BronzePlan(){
		setCoverage(0.6);
	}

	@Override
	public double computeMonthlyPremium(double salary, int age, boolean smoking) {
		
		return (salary * 0.05) + getOfferedBy().computeMonthlyPremium(this, age, smoking);
	}

}
