import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {

        double validatedAmount = validateInput();
        // Display the calculated sales Commission
        double salesCommission = calculateSalesCommission(validatedAmount);
        System.out.println("The commission is $" + salesCommission + " for sales amount of $" + validatedAmount);

    }

    /*
     * Function to Validate given amount
     */
    public static double validateInput() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Sales Amount: ");
        double amount = input.nextDouble();
        while (amount < 1) {
            System.out.println("Please Enter a Valid Sales Amount: ");
            amount = input.nextDouble();
        }
        return amount;
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