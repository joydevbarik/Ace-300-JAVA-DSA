public class Main {

    public static String minWindow(String s, String t) {

        if (t.length() > s.length()) {
            return "";
        }

        int[] tFreq = new int[128];

        for (int i = 0; i < t.length(); i++) {
            tFreq[t.charAt(i)]++;
        }

        int start = 0;
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {

            int[] window = new int[128];

            for (int j = i; j < s.length(); j++) {

                window[s.charAt(j)]++;

                if ((j - i + 1) >= t.length() && containsAll(window, tFreq)) {

                    if ((j - i + 1) < minLen) {
                        minLen = j - i + 1;
                        start = i;
                    }

                    break;
                }
            }
        }

        if (minLen == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minLen);
    }

    public static boolean containsAll(int[] window, int[] target) {

        for (int i = 0; i < 128; i++) {
            if (window[i] < target[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "ADOBECODEBANC";
        String t = "ABC";

        System.out.println(minWindow(s, t));
    }
}