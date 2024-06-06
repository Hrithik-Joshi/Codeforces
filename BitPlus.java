import java.util.Scanner;

public class BitPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int x = 0;
        while (t-- > 0) {
            String str = sc.next();

            helper(str,x);
        }
        System.out.println(x);
        sc.close();
    }
    public static int helper(String str,int x){
        switch (str) {
            case "++X":
                return ++x;
            case "X++":
                return x++;
            case "--X":
                return --x;        
            default:
                return x--;
        }
    }
}
