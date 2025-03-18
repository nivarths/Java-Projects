import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Scan in
        Scanner scanner = new Scanner(System.in);

        // Variables
        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();

        System.out.print("How many would you like?: ");
        quantity = scanner.nextInt();

        total = (price * quantity);

        System.out.println("You have bought " + quantity + " " + item + "(s)");
        System.out.print("Your total is: " + currency + total);

        // Scan in closed
        scanner.close();
    }
}