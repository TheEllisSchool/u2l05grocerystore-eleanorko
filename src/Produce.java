public class Produce extends Item {

	//Attributes
		private double weight;
		private String expirationDate;
		private double price;
		
		//Constructor 
		public Produce(String t, double u, double w, String e) {
			super(t, u);
			weight = w;
			expirationDate = e;
			price = getPrice();
		}
		
		//Method
		public void setWeight (double w) {
			weight = w;
		}
		
		public double getWeight() {
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
			return "Your order: " + '\n' + "Produce Type: " + getType() + '\n' + "Unit Price: $" 
					+ getUnitPrice() + " per pound" + '\n' + "Weight: " + getWeight() + " lbs" + '\n' + "Expiration Date: " 
					+ getExpirationDate() + '\n' + "Total price: $" + getPrice();
	
}}
