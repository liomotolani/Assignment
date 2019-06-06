package exercise4_20;

public class Employee {
	private String name;
	private int hourlyRate;
	private int hoursWorked;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the hourlyRate
	 */
	public int getHourlyRate() {
		return hourlyRate;
	}
	/**
	 * @param hourlyRate the hourlyRate to set
	 */
	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	/**
	 * @return the hoursWorked
	 */
	public int getHoursWorked() {
		return hoursWorked;
	}
	/**
	 * @param hoursWorked the hoursWorked to set
	 */
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	public double calculateGrossPay() {
		double grossPay = 0;
		
		if(hoursWorked <= 40) {
			
			grossPay = hoursWorked * hourlyRate;
			return grossPay;
			
		} 
		if(hoursWorked > 40) {
			
			double extraHour = hoursWorked - 40;
			extraHour = extraHour + (extraHour * 0.5);
			grossPay = (40 + extraHour) * hourlyRate;
			return grossPay;
		}
		return grossPay;
		
	}

}
