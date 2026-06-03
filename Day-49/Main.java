public class Main {

    public static double findMaxAverage(int[] nums, int k) {

        double maxSum = Integer.MIN_VALUE;

        for (int i = 0; i <= nums.length - k; i++) {

            int sum = 0;

            for (int j = i; j < i + k; j++) {
                sum += nums[j];
            }

            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        return maxSum / k;
    }

    public static void main(String[] args) {

        int[] nums = {1, 12, -5, -6, 50, 3};

        int k = 4;

        System.out.println(findMaxAverage(nums, k));
    }
}