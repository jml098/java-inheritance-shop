import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {
        Prompt prompt = new Prompt(new Scanner(System.in));

        List<Product> cart = new ArrayList<>();

        String choice = "";
        System.out.println("Add to cart");
        do {
            String category = prompt.ask("Which product you want to add?: ");
            Product product;
            choice = "";

            switch (category.toLowerCase()) {
                case "smartphone" -> {
                    product = new Smartphone(
                            prompt.ask("Choose name: "),
                            prompt.ask("Choose brand: "),
                            new BigDecimal((prompt.ask("Choose price: "))),
                            new BigDecimal((prompt.ask("Choose vat: "))),
                            Integer.parseInt(prompt.ask("Choose memory size: "))
                    );

                    cart.add(product);
                }
                case "tv" -> {
                    product = new TV(
                            prompt.ask("Choose name: "),
                            prompt.ask("Choose brand: "),
                            new BigDecimal((prompt.ask("Choose price: "))),
                            new BigDecimal((prompt.ask("Choose vat: "))),
                            Integer.parseInt(prompt.ask("Choose inches: ")),
                            prompt.ask("Is smart?: ").equalsIgnoreCase("yes")
                    );

                    cart.add(product);
                }
                case "headphones" -> {
                    product = new Headphones(
                            prompt.ask("Choose name: "),
                            prompt.ask("Choose brand: "),
                            new BigDecimal((prompt.ask("Choose price: "))),
                            new BigDecimal((prompt.ask("Choose vat: "))),
                            prompt.ask("Choose color: "),
                            prompt.ask("Are wireless?: ").equalsIgnoreCase("yes")
                    );

                    cart.add(product);
                }
                default -> {
                    System.out.println("Sorry, couldn't find the category you provided.");
                }
            }


            while (choice.equalsIgnoreCase("")) {
                choice = prompt.ask("Do you want to add another product? (Y/N)");
            }

        } while (choice.equalsIgnoreCase("y"));

        Boolean hasFidelty = prompt.ask("Do you have fidelty card?").equalsIgnoreCase("yes");

        BigDecimal totalPrice = new BigDecimal(0);

        for (Product p : cart) {
            totalPrice = totalPrice.add(p.calculateFinalPrice(hasFidelty));
        }

        System.out.println("Total price of your products is: " + totalPrice + "€");
    }
}
