package Users;

public class UITester {

	public static void main(String[] args) {

		User user = new User();
		InsuranceBrand insuranceBrand = new BlueCrossBlueShield();
		HealthInsurancePlan insurancePlan = new PlatinumPlan();
		
		insurancePlan.setOfferedBy(insuranceBrand);
		user.setInsurancePlan(insurancePlan);
		System.out.println(insurancePlan.computeMonthlyPremium(5000, 56, true));
		

	}

}
