package exercise4_22;

public class TabularOutput {

	public static void main(String[] args) {
		System.out.println("N\t10*N\t100*N\t1000*N\n");
	
		int counter = 1;
		while(counter<=5) {
			int num1 = 10*counter;
			int num2 = 100*counter;
			int num3 = 1000*counter;
			System.out.println(counter+"\t"+num1+"\t"+num2+"\t"+num3+"\t");
			
			counter++;
		}
	}

}
