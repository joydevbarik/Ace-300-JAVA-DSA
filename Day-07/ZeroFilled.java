public class ZeroFilled {

    public static long zeroFilledSubarray(int[] nums) {
        long count = 0;
        int consecutiveZeros = 0;

        for (int num : nums) {
            if (num == 0) {
                consecutiveZeros++;
            } else {
                consecutiveZeros = 0;
            }
            count += consecutiveZeros;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 0, 0, 0};

        long result = zeroFilledSubarray(nums);

        System.out.println("Zero Filled Subarrays: " + result);
    }
}