public class Main {

    public static int maxProduct(int[] nums) {

        int maxSoFar = nums[0];
        int minSoFar = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int tempMax = Math.max(
                    nums[i],
                    Math.max(maxSoFar * nums[i],
                             minSoFar * nums[i])
            );

            int tempMin = Math.min(
                    nums[i],
                    Math.min(maxSoFar * nums[i],
                             minSoFar * nums[i])
            );

            maxSoFar = tempMax;
            minSoFar = tempMin;

            result = Math.max(result, maxSoFar);
        }

        return result;
    }


    public static void main(String[] args) {

        int[] nums = {2, 3, -2, 4};

        int answer = maxProduct(nums);

        System.out.println("Maximum Product Subarray = " + answer);
    }
}