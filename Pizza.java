package pizzaBillGenerator;

public class Pizza {

    public enum CrustType { THIN, THICK, STUFFED }
    public enum Size { SMALL, MEDIUM, LARGE }
    public enum Sauce { TOMATO, BBQ, ALFREDO }
    
    private final int basePrice;
    private final boolean veg;
    private final int extraCheesePrice = 100;
    private final int extraToppingsPrice = 150;
    private final int takeAwayPrice = 20;
    
    private boolean extraCheeseAdded = false;
    private boolean extraToppingsAdded = false;
    private boolean takeAway = false;

    public Pizza(boolean veg, CrustType crust, Size size, Sauce sauce) {
        this.veg = veg;
        this.basePrice = veg ? 300 : 400;
        this.crust = crust;
        this.size = size;
        this.sauce = sauce;

        if (size == Size.SMALL) sizePrice = 0;
        else if (size == Size.MEDIUM) sizePrice = 50;
        else if (size == Size.LARGE) sizePrice = 100;

        this.basePrice = veg ? 300 : 400;
        this.basePrice += sizePrice;
    }

    public void addExtraCheese() {
        if (!extraCheeseAdded) {
            extraCheeseAdded = true;
        }
    }

    public void addExtraToppings() {
        if (!extraToppingsAdded) {
            extraToppingsAdded = true;
        }
    }

    public void takeAway() {
        if (!takeAway) {
            takeAway = true;
        }
    }

    public String getBill() {
        int totalPrice = basePrice;
        StringBuilder bill = new StringBuilder("Bill Breakdown:\n");
        bill.append("Base Pizza Price: ").append(basePrice).append("\n");
        if (extraCheeseAdded) {
            totalPrice += extraCheesePrice;
            bill.append("Extra Cheese: ").append(extraCheesePrice).append("\n");
        }
        if (extraToppingsAdded) {
            totalPrice += extraToppingsPrice;
            bill.append("Extra Toppings: ").append(extraToppingsPrice).append("\n");
        }
        if (takeAway) {
            totalPrice += takeAwayPrice;
            bill.append("Takeaway: ").append(takeAwayPrice).append("\n");
        }
        bill.append("Total Bill: ").append(totalPrice).append("\n");
        return bill.toString();
    }
}
