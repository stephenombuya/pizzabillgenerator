package pizzaBillGenerator;

import java.util.ArrayList;
import java.util.List;

public class PizzaOrder {
    private List<Pizza> pizzas;

    public PizzaOrder() {
        this.pizzas = new ArrayList<>();
    }

    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public String getOrderSummary() {
        StringBuilder summary = new StringBuilder("Order Summary:\n");
        int total = 0;
        for (Pizza pizza : pizzas) {
            summary.append(pizza.getBill()).append("\n");
            total += pizza.getTotalPrice();
        }
        summary.append("Total Order Price: ").append(total).append("\n");
        return summary.toString();
    }
}
