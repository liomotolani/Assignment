package exercise4_21;

import java.util.Scanner;

public class LargestNumber {
	private int number;
	public int findLargestNumber() {
		
		int largest = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter series of 10 numbers : ");

		int counter = 1;
		
		while(counter <=10) {
			
		number = input.nextInt();
		if(number>largest) {
			largest = number;
		}
		counter++;
		}
		
		
		return largest;
	}
	public static void main(String[] args) {
		
		LargestNumber numbers = new LargestNumber();
		
		
		System.out.println(numbers.findLargestNumber());

	}

}
