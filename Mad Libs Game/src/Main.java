import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Scan in
        Scanner scanner = new Scanner(System.in);

        // Variables
        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        // User input
        System.out.print("Enter an adjective (descriptive word): ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a noun (animal or person): ");
        noun1 = scanner.nextLine();
        System.out.print("Enter an adjective (descriptive word): ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter a verb (action word) ending with -ing: ");
        verb1 = scanner.nextLine();
        System.out.print("Enter an adjective (descriptive word): ");
        adjective3 = scanner.nextLine();

        // Story
        System.out.println("\nToday I went to a " + adjective1 + " zoo ");
        System.out.println("In an exhibit, I saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");

        // Scan in closed
        scanner.close();
    }
}