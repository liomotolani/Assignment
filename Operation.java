import java.util.*;

public class Operation{
       public static void main(String[] args){
        Scanner input = new Scanner(System.in);
   
        System.out.println("Enter operator: ");
        String operators = input.nextLine();

        System.out.println("Enter input1: ");
        double input1 = input.nextDouble();

        System.out.println("Enter input2: ");
        double input2 = input.nextDouble();

        double result;
        
        switch(operators){
            case "+":
            result = input1 + input2;
            System.out.println(result);
            break;
            case "-":
            result = input1 - input2;
            System.out.println(result);
            break;
            case "*":
            result = input1 * input2;
            System.out.println(result);
            break;
            case "%":
            result = input1 % input2;
            System.out.println(result);
            break;
            default:
        }
      input.close();  
    }


}