import java.util.*;

public class Main {

    public static List<Integer> findSubstring(String s, String[] words) {

        List<Integer> result = new ArrayList<>();

        int wordLength = words[0].length();
        int totalWords = words.length;
        int totalLength = wordLength * totalWords;

        HashMap<String, Integer> target = new HashMap<>();

        for (String word : words) {
            target.put(word, target.getOrDefault(word, 0) + 1);
        }

        for (int i = 0; i <= s.length() - totalLength; i++) {

            HashMap<String, Integer> seen = new HashMap<>();

            boolean valid = true;

            for (int j = 0; j < totalWords; j++) {

                String part = s.substring(
                        i + j * wordLength,
                        i + (j + 1) * wordLength
                );

                seen.put(part, seen.getOrDefault(part, 0) + 1);

                if (seen.get(part) > target.getOrDefault(part, 0)) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                result.add(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        String s = "barfoothefoobarman";

        String[] words = {"foo", "bar"};

        System.out.println(findSubstring(s, words));
    }
}