import java.util.Scanner;

public class BitPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int x = 0;
        while (t-- > 0) {
            String str = sc.next();

            x = helper(str,x);
        }
        System.out.println(x);
        sc.close();
    }
    public static int helper(String str,int x){
        switch (str) {
            case "++X":
                    return x = x+1;
            case "X++":
                    return x = x+1;
            case "--X":
                    return x = x-1;  
            default:
                    return x = x-1;
        }
        
    }
}
