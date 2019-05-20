import java.util.*;

public class NthRoot{
        
    public double findNthRoot(double input1,double input2){
        double powerResult = input1;
            for(int i = 0; i< input2;i++){
              powerResult *= (1/input2);//powerResult = powerResult * input1
            }
            return powerResult;

    
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter input1: ");
        double input1 = input.nextDouble();
      
        System.out.println("Enter input2: ");
        double input2 = input.nextDouble();

        NthRoot newNthRoot = new NthRoot();

        System.out.println(newNthRoot.findNthRoot(input1,input2));
        
        
        }
    
    }