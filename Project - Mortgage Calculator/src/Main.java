import java.text.NumberFormat;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        int principal = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;


        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("Principal ($1000 - $1 000 000): ");
            principal = scanner.nextInt();
            if(principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.println("Please enter a number between 1000 and 1 000 000.");
        }

        while(true){
            System.out.print("Annual interest rate: ");
            float annualInterest = scanner.nextFloat();
            if(annualInterest >= 1 || annualInterest <= 30){
                monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Please enter a value that is between 1 and 30");
        }

        while(true){
            System.out.print("Number of years: ");
            byte years = scanner.nextByte();
            if(years >= 1 && years <= 30){
                numberOfPayments = years * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Please enter a value that is between 1 and 30");
        }


        float numer = monthlyInterest * (float)Math.pow((1 + monthlyInterest), numberOfPayments);
        float denom = ((float)Math.pow((1 + monthlyInterest), numberOfPayments)) - 1;

        float mortgage = principal * (numer/denom);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);

        }
    }