public class Main {

    public static String minWindow(String s, String t) {

        String ans = "";

        for (int i = 0; i < s.length(); i++) {

            int[] freq = new int[128];

            for (char ch : t.toCharArray()) {
                freq[ch]++;
            }

            int count = t.length();

            for (int j = i; j < s.length(); j++) {

                char ch = s.charAt(j);

                if (freq[ch] > 0)
                    count--;

                freq[ch]--;

                if (count == 0) {

                    String window = s.substring(i, j + 1);

                    if (ans.equals("") ||
                            window.length() < ans.length()) {
                        ans = window;
                    }

                    break;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        String s = "ADOBECODEBANC";
        String t = "ABC";

        System.out.println(minWindow(s, t));
    }
}