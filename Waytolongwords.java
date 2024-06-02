import java.util.Scanner;

public class Waytolongwords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String str = sc.next();
            System.out.println(helper(str));
        }
        sc.close();
    }

    public static String helper(String str) {
        if (str.length() > 10) {
            String op = "";
            op += str.charAt(0);
            int count = str.length() - 2;
            op += String.valueOf(count);
            op += str.charAt(str.length() - 1);
            return op;
        }
        return str;
    }
}
