import java.util.Scanner;

public class NewBakery {
    public static void solve(Scanner scanner) {
        long n = scanner.nextLong();
        long usualPrice = scanner.nextLong();
        long modifiedPrice = scanner.nextLong();

        if (modifiedPrice < usualPrice) {
            System.out.println(n * usualPrice);
        } else {
            // Calculate how many buns we can sell at modified prices (limited by n and modifiedPrice - usualPrice).
            long numModifiedBuns = Math.min(n, modifiedPrice - usualPrice);
            // Remaining buns sold at usual price.
            long numUsualBuns = n - numModifiedBuns;
            // Calculate the sum of the first numModifiedBuns modified prices using arithmetic series formula.
            long lastModifiedPrice = modifiedPrice - numModifiedBuns;
            long maxProfit = numUsualBuns * usualPrice + (modifiedPrice * (modifiedPrice + 1) / 2) - (lastModifiedPrice * (lastModifiedPrice + 1) / 2);

            System.out.println(maxProfit);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            solve(scanner);
        }

        scanner.close();
    }
}
