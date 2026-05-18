
public class Main {
    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 2,5, 3};

        int n = nums.length;
        int k = 0;
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < k; j++) {
                if (nums[i] == nums[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                nums[k] = nums[i];
                k++;
            }
        }

        System.out.println("Unique elements count: " + k);

        System.out.print("Array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}