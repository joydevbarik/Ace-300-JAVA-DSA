import java.util.*;

public class Main {

    public static List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> set = new HashSet<>();

        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {

            for (int j = i + 1; j < n - 1; j++) {

                for (int k = j + 1; k < n; k++) {

                    if (nums[i] + nums[j] + nums[k] == 0) {

                        List<Integer> triplet =
                                Arrays.asList(nums[i], nums[j], nums[k]);

                        Collections.sort(triplet);

                        set.add(triplet);
                    }
                }
            }
        }

        return new ArrayList<>(set);
    }

    public static void main(String[] args) {

        int[] nums = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> result = threeSum(nums);

        System.out.println(result);
    }
}