package Users;

public class Billing {

	public static double[] computePaymentAmount(Patient patient, double amount) {
		double[] payments = new double[2];

		HealthInsurancePlan patientInsurancePlan = patient.getInsurancePlan();

		if (patientInsurancePlan instanceof PlatinumPlan) {

			double temp = amount;
			temp *= patientInsurancePlan.getCoverage();
			payments[0] = amount - (amount - temp);
			payments[1] = amount - temp - 50;

		} else if (patientInsurancePlan instanceof GoldPlan) {

			double temp = amount;
			temp *= patientInsurancePlan.getCoverage();
			payments[0] = amount - (amount - temp);
			payments[1] = amount - temp - 40;

		} else if (patientInsurancePlan instanceof SilverPlan) {

			double temp = amount;
			temp *= patientInsurancePlan.getCoverage();
			payments[0] = amount - (amount - temp);
			payments[1] = amount - temp - 30;

		} else if (patientInsurancePlan instanceof BronzePlan) {

			double temp = amount;
			temp *= patientInsurancePlan.getCoverage();
			payments[0] = amount - (amount - temp);
			payments[1] = amount - temp - 25;

		} else if (patientInsurancePlan == null){
			payments[0] = amount - (amount - 20);
			payments[1] = amount - 20;
		}

		return payments;
	}

}
