
	public class Flower extends Item {

		//Attributes
			private String color;
			private String variety;
			private double price;
			private int order;
			private boolean arrangement;
			
			//Constructor 
			public Flower(String v, String c, boolean a, int o, double u) {
				super("Flower", u);
				color = c;
				variety = v;
				arrangement = a;
				order = o;
				price = getPrice();
			}
			
			//Method
			public void setColor (String c) {
				color = c;
			}
			
			public String getColor() {
				return color;
			}
			
			public void setVariety (String v) {
				variety = v;
			}
			
			public String getVariety() {
				return variety;
			}
			
			public void setArrangement (boolean a) {
				arrangement = a;
			}
			
			public boolean getArrangement() {
				return arrangement;
			}
			
			
			public void setOrder (int o) {
				order = o;
			}
			
			public int getOrder() {
				return order;
			}
			
			public double getPrice() {
				if (arrangement == true) {
					price = getUnitPrice() * order + 5;
					return price;
				}
				else {
					price = getUnitPrice() * order;
					return price;
				}}
			
			
			public String toString() {
				return '\n' + "Your order: " + '\n' + "Flower Type: " + getVariety() + '\n' + "Unit Price: $" 
						+ getUnitPrice() + " per flower" + '\n' + "Number of Flowers: " + getOrder() + " flowers" +
						'\n' + "Total price: $" + getPrice();
		
	}}
	
