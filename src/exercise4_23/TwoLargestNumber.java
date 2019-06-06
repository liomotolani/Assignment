package exercise4_23;

import java.util.Scanner;

import exercise4_21.LargestNumber;

public class TwoLargestNumber {
	private int number;
	public void findLargestNumber() {
		
		int largest1 = 0;
		
		int largest2 =0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter series of 10 numbers : ");

		int counter = 1;
		
		while(counter <=10) {
			
		number = input.nextInt();
		if(number>largest1) {
			largest2 = largest1;
			largest1 = number;
		}else if(number > largest2) {
			largest2 = number;
		}
		counter++;
		}
		
		System.out.println("First largest number :" + largest1);
		System.out.println("Second largest number :" + largest2);
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TwoLargestNumber numbers = new TwoLargestNumber();
		
		
		numbers.findLargestNumber();

	}

}
