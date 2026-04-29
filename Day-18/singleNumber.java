
public class singleNumber {
    public static int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean foundDuplicate = false;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    foundDuplicate = true;
                    break;
                }
            }
            if (!foundDuplicate) {
                return nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1};

        int result = singleNumber(nums);

        System.out.println("Single number is: " + result);
    }
}