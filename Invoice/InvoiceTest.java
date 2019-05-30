import java.util.Scanner;
public class InvoiceTest{
    public static void main(String[] args){
        Scanner insert = new Scanner(System.in);
        Invoice buyer1 = new Invoice("WGH2334HHJ","Toyota body part",2,1000);

        System.out.print("Enter quantity of item :");
        int quantity = insert.nextInt();
        buyer1.setQuantity(quantity);
        System.out.print("Enter price per item :");
        double pricePerItem = insert.nextDouble();
        buyer1.setPricePerPrice(pricePerItem);
        
        System.out.print("Customer Invoice  " + buyer1.getInvoiceAmount() );
        insert.close();
    }
}