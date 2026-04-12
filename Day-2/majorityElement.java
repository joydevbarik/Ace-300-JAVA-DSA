import java.util.*;
class majorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        int threshold = nums.length / 2;

        for (int num : nums) {
            int count = counts.getOrDefault(num, 0) + 1;
            counts.put(num, count);

            if (count > threshold) {
                return num;
            }
        }

        return -1; 
    }
     public static void main(String[] args) {
        majorityElement obj = new majorityElement();

        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        int result = obj.majorityElement(nums);

        System.out.println("Majority Element: " + result);
    }
}
