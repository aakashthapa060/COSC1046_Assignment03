import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Sales Amount: ");
        double amount = input.nextDouble();

        double validatedAmount = validateInput(amount);

        // Display the calculated sales Commission
        double salesCommission = calculateSalesCommission(validatedAmount);
        System.out.println("The commission is $" + salesCommission + " for sales amount of $" + validatedAmount);

    }

    /*
     * Function to Validate given amount
     */
    public static double validateInput(double num) {
        Scanner input = new Scanner(System.in);
        while (num < 1) {
            System.out.println("Please Enter a Valid Sales Amount: ");
            num = input.nextDouble();
        }
        return num;
    }

    // Function to calculate sales amount based on commission
    public static double calculateSalesCommission(double salesAmount) {
        int commissionRate;

        if (salesAmount <= 5000) {
            commissionRate = 8;
        } else if (salesAmount <= 10000) {
            commissionRate = 10;
        } else {
            commissionRate = 12;

        }

        double salesCommission = (salesAmount * commissionRate) / 100;
        return salesCommission;
    }

}