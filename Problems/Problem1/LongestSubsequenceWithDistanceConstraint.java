import java.util.HashMap;
import java.util.Scanner;

public class LongestSubsequenceWithDistanceConstraint {

    public static int longestSubsequence(int[] arr, int k) {
        if (arr.length == 0)
            return 0;
        int[] dp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            dp[i] = 1;
        }
        HashMap<Integer, Integer> lastSeen = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int currentValue = arr[i];
            if (lastSeen.containsKey(currentValue)) {
                int lastIndex = lastSeen.get(currentValue);
                if (i - lastIndex >= k) {
                    dp[i] = dp[lastIndex] + 1;
                }
            }
            lastSeen.put(currentValue, i);
        }

        int maxLength = 1;
        for (int length : dp) {
            if (length > maxLength) {
                maxLength = length;
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        int result = longestSubsequence(arr, k);
        System.out.println(result);
        scanner.close();
    }
}
