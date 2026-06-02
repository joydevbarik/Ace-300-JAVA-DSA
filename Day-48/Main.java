public class Main {

    public static int findMaxLength(int[] nums) {

        int maxLength = 0;

        for (int i = 0; i < nums.length; i++) {

            int zeros = 0;
            int ones = 0;

            for (int j = i; j < nums.length; j++) {

                if (nums[j] == 0) {
                    zeros++;
                } else {
                    ones++;
                }

                if (zeros == ones) {

                    int length = j - i + 1;

                    if (length > maxLength) {
                        maxLength = length;
                    }
                }
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 1, 1, 0};

        System.out.println(findMaxLength(nums));
    }
}