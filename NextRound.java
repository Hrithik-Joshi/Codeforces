import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int temp = arr[k - 1];
        int x = k;
        int count = 0;
        int inc = k + 1;
        while (inc <= n) {
            if (arr[inc - 1] != 0 && arr[inc - 1] >= temp) {
                count = count + 1;
                inc++;
            } else
                break;
        }
        int dec = k;
        while (dec > 0) {
            if (arr[dec - 1] != 0 && arr[dec - 1] >= temp) {
                count = count + 1;
                
            }
            dec--;
        }
        System.out.println(count);
        sc.close();
    }
}
