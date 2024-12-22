package pizzaBillGenerator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PizzaOrderGUI extends JFrame {
    private PizzaOrder order;

    public PizzaOrderGUI() {
        order = new PizzaOrder();

        setTitle("Pizza Order System");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        add(panel);
        placeComponents(panel);

        setVisible(true);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel label = new JLabel("Select Pizza Options:");
        label.setBounds(10, 10, 300, 25);
        panel.add(label);

        JCheckBox vegPizzaCheckBox = new JCheckBox("Vegetarian Pizza");
        vegPizzaCheckBox.setBounds(10, 40, 150, 25);
        panel.add(vegPizzaCheckBox);

        JCheckBox extraCheeseCheckBox = new JCheckBox("Extra Cheese");
        extraCheeseCheckBox.setBounds(10, 70, 150, 25);
        panel.add(extraCheeseCheckBox);

        JCheckBox extraToppingsCheckBox = new JCheckBox("Extra Toppings");
        extraToppingsCheckBox.setBounds(10, 100, 150, 25);
        panel.add(extraToppingsCheckBox);

        JCheckBox takeawayCheckBox = new JCheckBox("Takeaway");
        takeawayCheckBox.setBounds(10, 130, 150, 25);
        panel.add(takeawayCheckBox);

        JButton addPizzaButton = new JButton("Add Pizza");
        addPizzaButton.setBounds(10, 160, 150, 25);
        panel.add(addPizzaButton);

        JTextArea orderSummary = new JTextArea();
        orderSummary.setBounds(180, 10, 200, 200);
        orderSummary.setEditable(false);
        panel.add(orderSummary);

        addPizzaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pizza pizza = new Pizza(vegPizzaCheckBox.isSelected());
                if (extraCheeseCheckBox.isSelected()) pizza.addExtraCheese();
                if (extraToppingsCheckBox.isSelected()) pizza.addExtraToppings();
                if (takeawayCheckBox.isSelected()) pizza.takeAway();

                order.addPizza(pizza);
                orderSummary.setText(order.getOrderSummary());
            }
        });
    }

    public static void main(String[] args) {
        new PizzaOrderGUI();
    }
}
