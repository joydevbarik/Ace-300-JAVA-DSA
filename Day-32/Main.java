import java.util.*;

public class Main {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> lastSeen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (lastSeen.containsKey(nums[i]) && i - lastSeen.get(nums[i]) <= k) {
                return true;
            }

            lastSeen.put(nums[i], i);
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter k value: ");
        int k = sc.nextInt();

        boolean result = containsNearbyDuplicate(nums, k);

        System.out.println("Contains Nearby Duplicate: " + result);

        sc.close();
    }
}