import java.util.*;
public class Reverse{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a value: ");
        String value = input.nextLine();
        String reverse = " ";
        for(int s = value.length()-1;s >=0 ; s--){
            reverse = reverse + value.charAt(s);
        }
        System.out.println("This is the reverse value: " + reverse );
        input.close();
    }
}