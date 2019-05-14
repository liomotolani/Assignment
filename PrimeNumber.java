import java.util.*;

public class PrimeNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int number = input.nextInt();
		if(number % 2 == 1 || number == 2){
		System.out.println("Number is a prime number");
		}
	}
}