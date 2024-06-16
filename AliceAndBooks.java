import java.util.Scanner;
import java.util.Arrays;

public class AliceAndBooks {
    public static void solve(Scanner scanner) {
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; ++i) {
            arr[i] = scanner.nextInt();
        }
        
        // Find the maximum element excluding the last element
        int max2 = Arrays.stream(arr, 0, n - 1).max().getAsInt();
        
        // Output the maximum sum Alice can read
        System.out.println(max2 + arr[n - 1]);
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
