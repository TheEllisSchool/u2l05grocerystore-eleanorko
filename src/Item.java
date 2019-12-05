import java.text.DecimalFormat;

public class Item {

	//Attributes
	private String type;
	private double unitPrice; 
	private int quantity;
	private double price;
	
	
	//Constructor
			public Item(String t, double u) {
				type = t;
				unitPrice = u;
				
			}
	
		//Constructor
			public Item(String t, int q, double u) {
				type = t;
				quantity = q;
				unitPrice = u;
				price = getPrice();
				
			}
	
	//Methods
	
	public void setType (String t) {
		type = t;
	}
	
	public String getType() {
		return type;
	}
	
	public void setUnitPrice (double u) {
		unitPrice = u;
	}
	
	public double getUnitPrice() {
		return unitPrice;
	}

	public void setQuantity(int q) {
		quantity = q;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getPrice() {
		price = quantity * getUnitPrice();
		return price;
	}
	
	public String toString() {
		return '\n' + "Your order: " + '\n' + "Canned Good: " + getType() + '\n' + "Number of Cans: " + getQuantity() +
				'\n' + "Unit Price: $" + getUnitPrice() + " per can" + '\n' + "Total price: $" + getPrice();
	}
	
	
	
	
} 
