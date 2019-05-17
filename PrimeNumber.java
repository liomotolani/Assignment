import java.util.*;

public class PrimeNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int number = input.nextInt();
		int count = 0;
			for(int i = 2; i<= number/2; i++){
		if(number %  i == 0){
		count++;
	
			}
		}
		if(count == 0 && number !=1){
			System.out.println(number+" is a prime number");
		}
		input.close();
	}
	
}