import java.util.Arrays;

public class Main {

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            int ans = -1;
            boolean found = false;

            for (int j = 0; j < nums2.length; j++) {

                if (nums2[j] == nums1[i]) {
                    found = true;
                }

                if (found && nums2[j] > nums1[i]) {
                    ans = nums2[j];
                    break;
                }
            }

            result[i] = ans;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        int[] result = nextGreaterElement(nums1, nums2);

        System.out.println(Arrays.toString(result));
    }
}