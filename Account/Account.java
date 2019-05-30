
public class Account{
    private String name;
    private double balance;

    public Account(String name, double balance){
        this.name = name;
        if(balance>0){
        this.balance = balance;}
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void depositAmount(double deposit){
        if(deposit > 0){
            balance = balance + deposit;
        }
    }
    public double withdrawal(double withdrawAmount){
        if(withdrawAmount > balance){
            System.out.print(name + " withdrawal amount exceeded account balance \n");
        }
        if(withdrawAmount <= balance){
        balance = balance - withdrawAmount;
    }
        
        return balance;
    }

}