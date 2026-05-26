import java.util.Arrays;

public class Main {

    public int[] twoSum(int[] numbers, int target) {

        int n = numbers.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = i + 1; j < n; j++) {

                if (numbers[i] + numbers[j] == target) {

                    return new int[]{i + 1, j + 1};
                }
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        Main sol = new Main();

        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] result = sol.twoSum(numbers, target);

        System.out.println(Arrays.toString(result));
    }
}