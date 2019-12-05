public class Produce extends Item {

	//Attributes
		private int weight;
		private String expirationDate;
		private double price;
		
		//Constructor 
		public Produce(String t, double u, int w, String e) {
			super(t, u);
			weight = w;
			expirationDate = e;
			price = getPrice();
		}
		
		//Method
		public void setWeight (int w) {
			weight = w;
		}
		
		public int getWeight() {
			return weight;
		}
		
		public void setexpirationDate (String e) {
			expirationDate = e;
		}
		
		public String getExpirationDate() {
			return expirationDate;
		}
		
		public double getPrice() {
			price = weight * getUnitPrice();
			return price;
		}
		
		public String toString() {
			return '\n' + "Your order: " + '\n' + "Produce Type: " + getType() + '\n' + "Unit Price: $" 
					+ getUnitPrice() + " per pound" + '\n' + "Weight: " + getWeight() + " lbs" + '\n' + "Expiration Date: " 
					+ getExpirationDate() + '\n' + "Total price: $" + getPrice();
	
}}
