class Main {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            freq[s.charAt(right) - 'A']++;
            while ((right - left + 1) - getMaxFreq(freq) > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    private int getMaxFreq(int[] freq) {
        int max = 0;
        for (int f : freq) {
            max = Math.max(max, f);
        }
        return max;
    }
}