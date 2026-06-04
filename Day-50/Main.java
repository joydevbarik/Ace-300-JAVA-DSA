import java.util.*;

public class Main {

    public static List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        int[] pCount = new int[26];
        int[] window = new int[26];

        int pLen = p.length();

        if (s.length() < pLen)
            return result;

        for (int i = 0; i < pLen; i++) {

            pCount[p.charAt(i) - 'a']++;
            window[s.charAt(i) - 'a']++;
        }

        if (Arrays.equals(pCount, window))
            result.add(0);

        for (int i = pLen; i < s.length(); i++) {

            window[s.charAt(i) - 'a']++;

            window[s.charAt(i - pLen) - 'a']--;

            if (Arrays.equals(pCount, window))
                result.add(i - pLen + 1);
        }

        return result;
    }

    public static void main(String[] args) {

        String s = "cbaebabacd";
        String p = "abc";

        System.out.println(findAnagrams(s, p));
    }
}