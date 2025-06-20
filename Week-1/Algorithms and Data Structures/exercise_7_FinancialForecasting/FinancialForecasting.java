import java.util.Scanner;

public class FinancialForecasting {
    public static double futureValue(double p, double r, int y) {
        return helper(p, r, y, 0);
    }

    private static double helper(double p, double r, int y, int cy) {
        if (cy == y) {
            return p;
        }
        double newRate = r + (0.001 * cy);
        double newPrincipal = p * (1 + newRate);
        return helper(newPrincipal, r, y, cy + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Financial Forecasting");
        System.out.println("---------------------");

        System.out.print("\nEnter the Principal Amount: ");
        double p = sc.nextDouble();

        System.out.print("\nEnter the Annual Growth Rate: ");
        double r = sc.nextDouble();

        System.out.print("\nEnter the Number of Years: ");
        int y = sc.nextInt();

        double result = futureValue(p, r, y);
        System.out.printf("\nFuture value after %d years: %.2f\n", y, result);
    }
}
