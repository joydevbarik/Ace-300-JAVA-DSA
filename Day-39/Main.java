import java.util.*;

public class Main {

    public static int numSplits(String s) {

        int n = s.length();

        int[] prefix = new int[n];
        int[] suffix = new int[n];

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(s.charAt(i));
            prefix[i] = set.size();
        }

        set.clear();

        for (int i = n - 1; i >= 0; i--) {
            set.add(s.charAt(i));
            suffix[i] = set.size();
        }

        int count = 0;

        for (int i = 1; i < n; i++) {
            if (prefix[i - 1] == suffix[i])
                count++;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(numSplits(s));

        sc.close();
    }
}