import java.util.Scanner;

public class SalesAmount {
    public static void main(String[] args) {
        double validatedAmount = validateInput();
        // Display the calculated sales Amount
        double salesAmount = calculateSalesAmount(validatedAmount);
        System.out.println("The Sales Amount is $" + salesAmount + " for sales commission of $" + validatedAmount);
    }

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

    public static double calculateSalesAmount(double salesCommission) {
        int commissionRate;

        if (salesCommission <= 400) {
            commissionRate = 8;
        } else if (salesCommission <= 1000) {
            commissionRate = 10;

        } else {
            commissionRate = 12;
        }

        double salesAmount = (salesCommission / commissionRate) * 100;
        return salesAmount;
    }
}

// 400
// 1000