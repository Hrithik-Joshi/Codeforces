import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ManhattanPermutation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim());
        
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            long k = Long.parseLong(st.nextToken());
            
            if (k > (long) n * (n - 1) / 2) {
                sb.append("No\n");
            } else {
                int[] permutation = new int[n];
                // Generate initial permutation [1, 2, ..., n]
                for (int i = 0; i < n; i++) {
                    permutation[i] = i + 1;
                }
                
                // Adjust the permutation to achieve Manhattan value k
                for (int i = 0; i < n; i++) {
                    if (k == 0) {
                        break;
                    }
                    int maxPossible = n - i - 1;
                    int move = (int) Math.min(maxPossible, k);
                    int temp = permutation[i];
                    permutation[i] = permutation[i + move];
                    permutation[i + move] = temp;
                    k -= move;
                }
                
                sb.append("Yes\n");
                for (int num : permutation) {
                    sb.append(num).append(" ");
                }
                sb.append("\n");
            }
        }
        
        System.out.print(sb);
    }
}
