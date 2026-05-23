import java.util.Scanner;

public class Main {

    public static int numMatchingSubseq(String s, String[] words) {
        int count = 0;

        for (String word : words) {
            if (isSubsequence(s, word)) {
                count++;
            }
        }

        return count;
    }
    private static boolean isSubsequence(String s, String word) {
        int i = 0; 

        for (int j = 0; j < s.length() && i < word.length(); j++) {
            if (s.charAt(j) == word.charAt(i)) {
                i++;
            }
        }
        return i == word.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String s = sc.nextLine();
        System.out.print("Enter number of words: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] words = new String[n];

        System.out.println("Enter words:");
        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }
        int result = numMatchingSubseq(s, words);
        System.out.println("Number of matching subsequences = " + result);

        sc.close();
    }
}