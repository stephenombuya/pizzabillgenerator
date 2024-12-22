package pizzaBillGenerator;

public class Main {

    public static void main(String[] args) {
        Pizza vegPizza = new Pizza(true);
        vegPizza.addExtraToppings();
        vegPizza.addExtraCheese();
        vegPizza.takeAway();
        System.out.println(vegPizza.getBill());

        DeluxPizza nonVegDelux = new DeluxPizza(false);
        nonVegDelux.takeAway();
        System.out.println(nonVegDelux.getBill());
    }
}
