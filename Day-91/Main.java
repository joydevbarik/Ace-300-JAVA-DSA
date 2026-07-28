public class Main {

    public static int longestValidParentheses(String s) {
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 2; j <= s.length(); j += 2) {
                if (isValid(s, i, j)) {
                    maxLen = Math.max(maxLen, j - i);
                }
            }
        }

        return maxLen;
    }

    public static boolean isValid(String s, int start, int end) {
        int count = 0;

        for (int i = start; i < end; i++) {
            if (s.charAt(i) == '(') {
                count++;
            } else {
                count--;
            }

            if (count < 0) {
                return false;
            }
        }

        return count == 0;
    }

    public static void main(String[] args) {
        String s = "(()())";
        System.out.println("Longest Valid Parentheses Length = " + longestValidParentheses(s));
    }
}