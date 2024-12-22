package pizzaBillGenerator;

import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;

public class PizzaOrder {
    private List<Pizza> pizzas;
    private String promoCode;

    public void applyPromoCode(String code) {
        this.promoCode = code;
    }
    
    public PizzaOrder() {
        this.pizzas = new ArrayList<>();
    }

    public int calculateDiscount(int totalPrice) {
        if ("DISCOUNT10".equals(promoCode)) {
            return (int) (totalPrice * 0.1);  // 10% discount
        }
        return 0;
    }

    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

   public String getOrderSummary() {
        int total = 0;
        for (Pizza pizza : pizzas) {
            total += pizza.getTotalPrice();
        }
        int discount = calculateDiscount(total);
        return "Total Price: " + total + "\nDiscount: " + discount + "\nFinal Price: " + (total - discount);
    }

     public void saveOrder(String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(getOrderSummary());
        } catch (IOException e) {
            System.out.println("Error saving order: " + e.getMessage());
        }
    }
}
