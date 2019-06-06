/**
 * 
 */
package exercise4_20;

import java.util.Scanner;

/**
 * @author Victor;Tobi ; Omotolani;
 *
 */
public class EmployeeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		int counter = 1;
		String name = "";
		int hourlyRate;
		int hoursWorked;
		
		while(counter <= 3) {
			counter++;
			System.out.println("Enter employee name : ");
			name = input.nextLine();
			employee.setName(name);
			//call the set name method
			System.out.println("Enter employee hourlyRate : ");
			hourlyRate = input.nextInt();
			// call the hourlyRate method
			employee.setHourlyRate(hourlyRate);
			System.out.println("Enter employee hoursWorked : ");
			hoursWorked = input.nextInt();
			// call the hourlyRate method
			employee.setHoursWorked(hoursWorked);
			//Display grossPay
			System.out.println("Press enter to input the next employee");
			String nothing = input.nextLine();
		
			System.out.printf("Employee name: %s%nGross pay : %.2f%n", employee.getName(),employee.calculateGrossPay());
			
			
			
			
		}
		
		
		

	}

}
