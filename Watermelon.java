import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(helper(n));
        sc.close();
    }

    public static String helper(int n) {
        if(n==2){
            return "NO";
        }
        if ( n % 2 == 0  ) {
            return "YES";
        }
        return "NO";
    }
}