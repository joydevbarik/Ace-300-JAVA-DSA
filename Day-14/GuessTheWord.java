import java.util.*;
class Master {
    private String secret;

    public Master(String secret) {
        this.secret = secret;
    }
    public int guess(String word) {
        int match = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == secret.charAt(i)) {
                match++;
            }
        }
        System.out.println("Guessed: " + word + " -> Matches: " + match);
        return match;
    }
}

public class GuessTheWord {

    public static void findSecretWord(String[] words, Master master) {
        List<String> candidates = new ArrayList<>(Arrays.asList(words));

        while (!candidates.isEmpty()) {

            String bestGuess = candidates.get(0);
            int bestMaxGroup = candidates.size();

            for (String word : candidates) {
                int[] groups = new int[7];

                for (String other : candidates) {
                    groups[match(word, other)]++;
                }

                int maxGroup = 0;
                for (int g : groups) {
                    maxGroup = Math.max(maxGroup, g);
                }

                if (maxGroup < bestMaxGroup) {
                    bestMaxGroup = maxGroup;
                    bestGuess = word;
                }
            }

            int matches = master.guess(bestGuess);
            if (matches == 6) {
                System.out.println("Secret word found: " + bestGuess);
                return;
            }

            List<String> filtered = new ArrayList<>();
            for (String word : candidates) {
                if (match(word, bestGuess) == matches) {
                    filtered.add(word);
                }
            }

            candidates = filtered;
        }
    }

    private static int match(String a, String b) {
        int count = 0;
        for (int i = 0; i < 6; i++) {
            if (a.charAt(i) == b.charAt(i)) count++;
        }
        return count;
    }

    public static void main(String[] args) {

        String[] words = {
            "acckzz", "ccbazz", "eiowzz", "abcczz", "acckzz"
        };

        String secret = "acckzz";

        Master master = new Master(secret);

        findSecretWord(words, master);
    }
}