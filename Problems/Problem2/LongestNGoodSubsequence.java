import java.util.*;

public class LongestNGoodSubsequence {

    public static int longestNGoodSubsequence(String s, int N) {
        Map<Character, Integer> frequency = new HashMap<>();
        for (char c : s.toCharArray()) {
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }

        List<Integer> freqCounts = new ArrayList<>(frequency.values());
        Collections.sort(freqCounts, Collections.reverseOrder());

        if (freqCounts.size() < N - 1) {
            return 0;
        }
        int subsequenceLength = 0;
        for (int i = 0; i < N - 1; ++i) {
            if (freqCounts.get(i) < i + 2) {
                return 0;
            }
            subsequenceLength += (i + 2);
        }
        return subsequenceLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int N = scanner.nextInt();

        int result = longestNGoodSubsequence(s, N);
        System.out.println(result);
    }
}
