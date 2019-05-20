import java.util.*;

public class Permutation{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter input1: ");
        int input1 = input.nextInt();
      
        System.out.println("Enter input2: ");
        int input2 = input.nextInt();

        int variable2 = input1-input2;
        int variable = input1;
        

        
    for (int i = 1; i<input1; i++){
            int decrement = input1 - i;
            variable = variable * decrement;
        
        }
        if(input1 != input2){
            for(int j = 1; j< variable2; j++){
            int decrement = variable2 -j;  
            variable2 = variable2 * decrement;
        }

        } else if(input1 == input2){
            variable2 = variable2 + 1;
        } 

        int result = variable / variable2;
        System.out.println(result);
        input.close();
    }
    
}