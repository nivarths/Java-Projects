import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // variables
        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        while(true) {
            System.out.print("Enter the principal amount ($1000 - $1 000 000): ");
            principal = scanner.nextDouble();
            if(principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.println("Please enter a principal amount between $1000 and $1 000 000");
        }

        while(true) {
            System.out.print("Enter the interest rate (in %, between 1 and 30): ");
            rate = scanner.nextDouble() / 100;
            if(rate >= 0.01 && rate <= 0.30)
                break;
            System.out.println("Please enter a rate (in %) between 1 and 30: ");
        }


        while(true) {
            System.out.print("Enter the number of times compounded per year (annually, semi-annually, quarterly, monthly, or daily): ");
            timesCompounded = scanner.nextInt();
            if(timesCompounded == 1 || timesCompounded == 2 || timesCompounded == 4 || timesCompounded == 12 || timesCompounded == 365)
                break;
            System.out.println("Please enter compounding frequency (1 = annually, 2 = semi-annually, 4 = quarterly, 12 = monthly, 365 = daily): ");
        }

        while(true) {
            System.out.print("Enter the number of years (between 1 and 30): ");
            years = scanner.nextInt();
            if(years >= 1 && years <= 30)
                break;
            System.out.println("Please enter the number of years (between 1 and 30): ");
        }

        amount = principal * Math.pow(1 + (rate/timesCompounded), (timesCompounded * years));
        System.out.printf("The amount after %d year(s) is $%.2f", years, amount);

        scanner.close();
    }
}