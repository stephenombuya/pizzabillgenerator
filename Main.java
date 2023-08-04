package pizzaBillGenerator;

public class Main {

	public static void main(String[] args) {
//		Pizza p1 = new Pizza(true);
//		p1.addExtraToppings();
//		p1.addExtraCheese();
//		p1.takeAway();
//		p1.getBill();
		
		DeluxPizza dp = new DeluxPizza(false);
		dp.takeAway();
		dp.getBill();

	}

}
