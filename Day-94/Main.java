public class Main {

    public static boolean find132pattern(int[] nums) {
        int n = nums.length; 
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {

                    if (nums[i] < nums[k] && nums[k] < nums[j]) {
                        return true;
                    }

                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 2};

        System.out.println(find132pattern(nums));
    }
}