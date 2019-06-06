package exercise4_24;

import java.util.Scanner;

public class Analysis {
	
	    public static void main(String[] args){
	        Scanner input = new Scanner(System.in);
	        int fail = 0;
	        int pass = 0;
	        int gradecounter = 1;
	        
	        

	        while(gradecounter <= 10){
	        	
	        	int result = 0;
    			System.out.println("Enter result (pass = 1, fail =2)");
    			result = input.nextInt();

	        		while(result > 2 || result < 1)
	        		{
	        			if(result!=1 || result !=2) {
	        			System.out.println("Wrong value try again");
	        			}

	        			result = input.nextInt();
	        		}
	        	
	            if(result == 1){
	                pass = pass + 1;
	            }else{
	                if(result == 2){
	                    fail = fail + 1;
	                }
	            }
	            gradecounter++;
	        }

	        System.out.printf("%d%n%d%n", pass, fail);

	        if (pass > 8){
	            System.out.println("Lecturer deserves a bonus");
	        }
	        
	    }

}
