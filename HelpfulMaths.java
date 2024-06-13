import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int arr[] = new int[(s.length()+1)/2];
        int j=0;
        for(int i = 0; i<s.length();){
            arr[j]=s.charAt(i)-'0';
            i+=2;
            j++;
        }
        Arrays.sort(arr);
        
        String ans = "";
        for(int i = 0; i<arr.length;i++){
            ans+=String.valueOf(arr[i]);
            if(ans.length()<s.length()){
                ans+='+';
            }
        }
        System.out.println(ans);
    }
}
