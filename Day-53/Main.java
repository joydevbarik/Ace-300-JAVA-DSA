import java.util.HashSet;

public class Main {

    public static long maximumSubarraySum(int[] nums, int k) {

        long maxSum = 0;

        for (int i = 0; i <= nums.length - k; i++) {

            HashSet<Integer> set = new HashSet<>();

            long sum = 0;

            boolean unique = true;

            for (int j = i; j < i + k; j++) {

                if (set.contains(nums[j])) {
                    unique = false;
                    break;
                }

                set.add(nums[j]);

                sum += nums[j];
            }

            if (unique && sum > maxSum) {
                maxSum = sum;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] nums = {1, 5, 4, 2, 9, 9, 9};

        int k = 3;

        System.out.println(maximumSubarraySum(nums, k));
    }
}