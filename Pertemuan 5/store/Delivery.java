package store;

public class Delivery extends AbstractStoreEmployee{
	private double commision;
	private int efficiency;
	private final int totalTask;
	
	/**
	 * This is an argument constructor which initializes all the instance
	 * variables
	 *
	 * @param numberOfHoursWorked - The parameter Number of hours worked is
	 *                            passed.
	 * @param hourlyRate          - The parameter Hourly rate of the Employee in dollars
	 *                            is passed.
	 * @param storeDetails        - The parameter Details of the Store is passed.
	 * @param basePay             - The parameter Base pay of the Employee in dollars is
	 *                            passed.
	 * @param employeeName        - The parameter Full name of the Employee is passed.
	 * @param taskFinished        - The parameter total task have been done by the Delivery
	 * @param totalTask           - The parameter total task should be work by the Delivery
	 */

	
	/**
	 * Returns calculated Pay of the Freelance. The calculated pay is the
	 * sum of total task finished, commission rate, and number of hours worked and hourly rate.
	 *
	 * @return - This method returns Payment of the Freelance.
	 */
    public Delivery(double numberOfHoursWorked, double hourlyRate, String storeDetails, double basePay,
            String employeeName, int efficiency, int totalTask) {
        super(numberOfHoursWorked, hourlyRate, storeDetails, basePay, employeeName);
        this.efficiency = efficiency;
        this.totalTask = totalTask;
    }

	@Override
	public double calculatePay() {

		 if (efficiency > 25000) {
            commision = 15.00;
        } else {
            commision = 1;
        }

        return (super.getNumberOfHoursWorked() * super.getHourlyRate()
                + super.getBasePay()) * (1 + commision / 100);
	}
	

    /**
	 * Checks if the employee should be awarded with a promotion.
	 *
	 * @return - This method returns boolean the eligibility status for
	 * promotion for an employee.
	 */
	@Override
	public boolean checkPromotionEligibility() {
		return calculatePay() > 2000.0;
	}
	
	/**
	 * Delivery has no annual salary.
	 */
	public int getEfficiency() {
        return efficiency;
    }

    public int getTotalTask() {
        return totalTask;
    }

    public void setEfficiency(int efficiency) {
        this.efficiency = efficiency;
    }

@Override
public double bonus(){
if(getNumberOfHoursWorked() > 50) {
	return getBasePay() * 5/100;
	}else{
		return 0;
	}
}

}