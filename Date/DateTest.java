import java.util.Scanner;
public class DateTest{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter month : ");
        int month = input.nextInt();
        System.out.println("Enter day : ");
        int day = input.nextInt();
        System.out.println("Enter year : ");
        int year = input.nextInt();

        Date date1 = new Date(month,day,year);
        date1.displayDate(month, day, year);
    }
}