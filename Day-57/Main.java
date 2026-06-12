public class Main {

    public static int minSubArrayLen(int target, int[] nums) {

        int minLength = nums.length + 1;

        for (int i = 0; i < nums.length; i++) {

            int sum = 0;

            for (int j = i; j < nums.length; j++) {

                sum += nums[j];

                if (sum >= target) {

                    minLength = Math.min(minLength, j - i + 1);
                    break;
                }
            }
        }

        if (minLength == nums.length + 1)
            return 0;

        return minLength;
    }

    public static void main(String[] args) {

        int[] nums = {2, 3, 1, 2, 4, 3};

        int target = 7;

        System.out.println(minSubArrayLen(target, nums));
    }
}