public class Invoice{
    private String partNumber;
    private String description;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber,String description,int quantity,double pricePerItem){
        this.partNumber = partNumber;
        this.description = description;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public void setPartNumber(String partNumber){
        this.partNumber = partNumber;
    }

    public String getPartNumber(){
        return partNumber;
    }
    public void setDescription(String description){
        this.description = description;
    }
    
    public String getDescription(){
        return description;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    
    public int getQuantity(){
        return quantity;
    }
    public void setPricePerPrice(double pricePerItem){
        this.pricePerItem = pricePerItem;
    }
 
    public double getPricePerItem(){
        return pricePerItem;
    }

    public double getInvoiceAmount(){
        double invoiceAmount = 0.0;
        if(quantity < 0){
            return invoiceAmount;
        }
        if(pricePerItem < 0){
            return invoiceAmount;
        }
        invoiceAmount = quantity * pricePerItem;    
        return invoiceAmount;
    }
}