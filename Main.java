import java.util.*;

public class Main {

    public static int longestSubarray(int[] nums, int limit) {
        int maxLen = 1;

        for (int i = 0; i < nums.length; i++) {
            int min = nums[i];
            int max = nums[i];

            for (int j = i + 1; j < nums.length; j++) {

                min = Math.min(min, nums[j]);
                max = Math.max(max, nums[j]);

                if (max - min > limit) {
                    break;
                }

                maxLen = Math.max(maxLen, j - i + 1);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {

        int[] nums = {8, 2, 4, 7};
        int limit = 4;

        System.out.println(longestSubarray(nums, limit));
    }
}