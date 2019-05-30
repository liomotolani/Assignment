import java.util.Scanner;
public class AccountTest{
    public static void main(String[] args){
        Account account1 = new Account("James",-7.60);
        Account account2 = new Account("Ehis",50.0);
        displayAccount(account1);
        displayAccount(account2);

        Scanner insert = new Scanner(System.in);
        System.out.print("Enter deposit amount for account1 :");
        double deposit = insert.nextDouble();
        account1.depositAmount(deposit);
        displayAccount(account1);
        displayAccount(account2);
        
        System.out.print("Enter deposit amount for account2 :");
        double deposit1 = insert.nextDouble();
        account2.depositAmount(deposit1);
        displayAccount(account1);
        displayAccount(account2);

        System.out.print("Enter withrawal amount for account1 :");
        double withdrawalAmount = insert.nextDouble();
        account1.withdrawal(withdrawalAmount);
        displayAccount(account1);
        displayAccount(account2);
        System.out.print("Enter withdrawal amount for account2 :");
        double withdrawalAmount1 = insert.nextDouble();
        account2.withdrawal(withdrawalAmount1);
        displayAccount(account1);
        displayAccount(account2);

    insert.close();
    }
    public static void displayAccount(Account account){
        System.out.printf("%s balance: $%.2f%n",account.getName(),account.getBalance());
       
    }
}