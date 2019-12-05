import javax.swing.JOptionPane;

public class GroceryStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Item peaches = new Item("peaches", 30, 1.5);
	
		Produce pineapple = new Produce("pineapple", 3, 17, "12/10/19");
		
		Flower carnation = new Flower("carnation", "pink", true, 30, 3.0);
		
		
		System.out.println("In stock: " + '\n' + peaches.getQuantity() + " cans of peaches" + '\n' +
				pineapple.getWeight() + " pounds of pineapple" + '\n' + carnation.getOrder() + " carnations");
		
		String input = JOptionPane.showInputDialog(null, "How many cans of peaches would you like: ");
		int peachOrder = Integer.parseInt(input);
		peaches.setQuantity(peachOrder);
		int peachesNum = peaches.getQuantity() - peachOrder;
		
		String inputTwo = JOptionPane.showInputDialog(null, "How many pounds of pineapple would you like: ");
		int pineappleOrder = Integer.parseInt(input);
		pineapple.setWeight(pineappleOrder);
		int pineappleNum = pineapple.getWeight() - pineappleOrder;
		
		String inputThree = JOptionPane.showInputDialog(null, "How many carnations would you like: ");
		int flowerOrder = Integer.parseInt(input);
		carnation.setOrder(flowerOrder);
		int flowerNum = carnation.getOrder() - flowerOrder;
		
		
		if (peachesNum < 0) {
			System.out.println("Invalid Value");
		} else {
			System.out.println('\n' + "There are " + peachesNum + " cans of peaches left in stock");
		}
	
		
		if (pineappleNum < 0) {
			System.out.println("Invalid Value");
		} else {
			System.out.println("There are " + pineappleNum + " pounds of pineapple left in stock");
		}
		
		
		if (flowerNum < 0) {
			System.out.println("Invalid Value");
		} else {
			System.out.println("There are " + flowerNum + " carnations left in stock");
		}
		
		System.out.println(peaches.toString());
		System.out.println(pineapple.toString());
		System.out.println(carnation.toString());
		
		Produce elaini = new Produce("pineapple", 4, 25, "12/5/19");
		
		//System.out.println(elaini);
		
		Flower hannah = new Flower("carnation", "pink", true , 5, 3.0);
		 
		//System.out.println(hannah);	
		
		Item annelise = new Item("peaches", 3, 1.50);
		 
		//System.out.println(annelise);
		
		
	}

}
