package Users;

abstract class HealthInsurancePlan {
    private double coverage;
    
    public double getCoverage() {
		return coverage;
	}

	public void setCoverage(double coverage) {
		this.coverage = coverage;
	}
	
	public abstract double computeMonthlyPremium(double salary, int age, boolean smoking);
	
	// Don't worry about the below code and also the InsuranceBrand class
	private InsuranceBrand offeredBy;

	public InsuranceBrand getOfferedBy() {
		return offeredBy;
	}

	public void setOfferedBy(InsuranceBrand offeredBy) {
		this.offeredBy = offeredBy;
	}
}