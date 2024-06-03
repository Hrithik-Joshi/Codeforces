import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count = 0;
        while (t-- > 0) {
            int arr[] = new int[3];
            for (int i = 0; i < 3; i++) {
                arr[i] = sc.nextInt();
            }
            count += helper(arr);
        }
        System.out.println(count);
        sc.close();
    }

    public static int helper(int arr[]) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        if (sum >= 2) {
            return 1;
        }
        return 0;
    }
}
