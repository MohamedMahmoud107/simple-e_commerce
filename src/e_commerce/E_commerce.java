package e_commerce;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class E_commerce {

    // Function to display a message dialog with given text
    private static void showMessageDialog(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    // Function to prompt user for input and return as String
    private static String showInputDialog(String message) {
        return JOptionPane.showInputDialog(null, message);
    }

    // Function to prompt user for input and return as int
    private static int showInputDialogInt(String message) {
        String input = showInputDialog(message);
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            showMessageDialog("Invalid input. Please enter a number.");
            return showInputDialogInt(message);
        }
    }

    // Function to create and show a JFrame with given title, text, and size
    private static void showOutputFrame(String title, String text, int width, int height) {
        JFrame frame = new JFrame(title);
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea textArea = new JTextArea();
        textArea.setFont(new Font("Arial", Font.PLAIN, 16));
        textArea.setText(text);
        textArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        String welcome = showInputDialog("Welcome to the E_Commerce System\nWrite 'start' to go forward");
        String welcome2 = welcome.toLowerCase().trim();

        if ("start".equals(welcome2)) {
            String name = showInputDialog("Enter your name:");
            int id = showInputDialogInt("Enter your id:");
            String address = showInputDialog("Enter your address:");

            Electronicproduct p1 = new Electronicproduct("Samsung", 1, 1, "Mobilephone", 599.9f);
            clothingproduct p2 = new clothingproduct("Medium", "Cotton", 2, "T-shirt", 19.99f);
            bookproduct p3 = new bookproduct("O'Reilly", "X publication", 3, "OOP", 39.99f);
            customer customer1 = new customer(id, name, address);

            int n = showInputDialogInt("Enter number of products you want to add:\n1 - " + p1.getName() + "\n2 - " + p2.getName() + "\n3 - " + p3.getName());
            cart cart = new cart(id, n);

            for (int i = 0; i < cart.getNProducts(); i++) {
                int select = showInputDialogInt("Which product you want to add\n1 - " + p1.getName() + "\n2 - " + p2.getName() + "\n3 - " + p3.getName());
                switch (select) {
                    case 1:
                        cart.addProduct(p1);
                        break;
                    case 2:
                        cart.addProduct(p2);
                        break;
                    case 3:
                        cart.addProduct(p3);
                        break;
                    default:
                        showMessageDialog("Please select a proper selection");
                        i--; // To repeat the iteration for valid input
                        break;
                }
            }

            float total = cart.calculatePrice();
            int x = showInputDialogInt("Your total price =" + total + "\nWould you like to place the order?\n1 - Yes\n2 - If you want to delete one or more items\nAny other number will cancel the process");

            switch (x) {
                case 1:
                    cart.placeOrder();
                    orderinfo o = new orderinfo(customer1.getCustomerid(), 1, cart.getProducts(), total);
                    o.printorderinfo();

                    showOutputFrame("Order Confirmation", "Thanks " + name + ", your order will be sent to your address: " + address, 600, 600);
                    break;

                case 2:
                    int z = showInputDialogInt("How many items do you want to delete?");
                    if (z < n) {
                        for (int i = 0; i < z; i++) {
                            int deletedItem = showInputDialogInt("Choose the item to delete\n1 - " + p1.getName() + "\n2 - " + p2.getName() + "\n3 - " + p3.getName());
                            cart.removeProduct(deletedItem);
                        }

                        total = cart.calculatePrice();
                        showMessageDialog("Your total price after deletion = " + total);

                        int y = showInputDialogInt("Would you like to place the order now?\n1 - Yes\n2 - No");
                        if (y == 1) {
                            cart.placeOrder();
                            orderinfo order = new orderinfo(customer1.getCustomerid(), 1, cart.getProducts(), total);
                            order.printorderinfo();

                            showOutputFrame("Order Confirmation", "Welcome " + name + ", thanks for your trust. Your order will be sent to your address: " + address, 600, 600);
                        } else {
                            showMessageDialog("Thanks for your time.");
                        }
                    } else if (z == n) {
                        showMessageDialog("You have removed all items. The application will close.");
                    } else {
                        showMessageDialog("Invalid input.");
                    }
                    break;

                default:
                    showMessageDialog("Thanks for your time.");
                    break;
            }
        } else {
            showMessageDialog("Thank you for your time.");
        }
    }
}
