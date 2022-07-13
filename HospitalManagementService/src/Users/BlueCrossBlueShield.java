package Users;

public class BlueCrossBlueShield implements InsuranceBrand {
	
	private long id;
	private String name;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public double computeMonthlyPremium(HealthInsurancePlan insurancePlan, int age, boolean smoking) {
		if(insurancePlan instanceof PlatinumPlan) {
			double prem = 0;
				if(age>55) {
					prem += 200;
				}
				if(smoking == true) {
					prem += 100;
				}
				return prem;
		}
		
		if(insurancePlan instanceof GoldPlan) {
			double prem = 0;
				if(age>55) {
					prem += 150;
				}
				if(smoking == true) {
					prem += 90;
				}
				return prem;
		}
		
		if(insurancePlan instanceof SilverPlan) {
			double prem = 0;
				if(age>55) {
					prem += 100;
				}
				if(smoking == true) {
					prem += 80;
				}
				return prem;
		}
		
		if(insurancePlan instanceof BronzePlan) {
			double prem = 0;
				if(age>55) {
					prem += 50;
				}
				if(smoking == true) {
					prem += 70;
				}
				return prem;
		}
		else return 0;
	}

}
