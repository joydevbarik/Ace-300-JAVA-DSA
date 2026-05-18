import java.util.*;

public class increasingTriplet {

    public static boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        if (n < 3) return false;

        int[] leftMin = new int[n];
        leftMin[0] = nums[0];

        for (int i = 1; i < n; i++) {
            leftMin[i] = Math.min(leftMin[i - 1], nums[i]);
        }

        int[] rightMax = new int[n];
        rightMax[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], nums[i]);
        }

        for (int j = 1; j < n - 1; j++) {
            if (leftMin[j - 1] < nums[j] && nums[j] < rightMax[j + 1]) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        boolean result = increasingTriplet(nums);

        System.out.println("Increasing Triplet Exists: " + result);
    }
}