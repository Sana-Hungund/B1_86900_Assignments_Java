
class Invoice {
	private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;
    
	public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		setQuantity(quantity);
		setPricePerItem(pricePerItem);
	}	
		
	public String getPartNumber() {
		return partNumber;
	}
	
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	
	public String getPartDescription() {
		return partDescription;
	}
	
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	
	public int getquantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		if (quantity > 0) {
			this.quantity = quantity;
		}
		else {
			this.quantity = 0;
		}
	}
	public double getpricePerItem() {
		return pricePerItem;
	}
	
	public void setPricePerItem(double pricePerItem) {
		if (pricePerItem > 0) {
			this.pricePerItem = pricePerItem;
		}
		else {
			this.pricePerItem = 0.0;
		}
	}
	
	public double getInvoiceAmount() {
		return quantity * pricePerItem;
	}
		
	
}



public class Question1 {

	public static void main(String[] args) {
		Invoice obj1 = new Invoice("A123", "engine", 10, 20.5);
		
		System.out.println("partNumber : " + obj1.getPartNumber());
		System.out.println("partDescription : " + obj1.getPartDescription());
		System.out.println("Quantity : " + obj1.getquantity());
		System.out.println("PricePerItem : " + obj1.getpricePerItem());
		System.out.println("Invoice Amount: " + obj1.getInvoiceAmount());
		
		obj1.setQuantity(-5);
        obj1.setPricePerItem(-10.0);

        
        System.out.println();
        System.out.println("Quantity: " + obj1.getquantity());
        System.out.println("Price per Item: " + obj1.getpricePerItem());
        System.out.println("Invoice Amount: " + obj1.getInvoiceAmount());
    }

	

}
