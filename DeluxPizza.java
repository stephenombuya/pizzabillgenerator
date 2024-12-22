package pizzaBillGenerator;

public class DeluxPizza extends Pizza {

    public DeluxPizza(boolean veg) {
        super(veg);
        addExtraCheese();
        addExtraToppings();
    }

    @Override
    public String getBill() {
        return super.getBill();
    }
}
