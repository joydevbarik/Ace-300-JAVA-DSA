import java.util.Arrays;

public class Main {

    public static int[] canSeePersonsCount(int[] heights) {
        int n = heights.length;
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            int maxBetween = 0;

            for (int j = i + 1; j < n; j++) {
 
                if (maxBetween < heights[j] && maxBetween < heights[i]) {
                    answer[i]++;
                }
 
                if (heights[j] > heights[i]) {
                    break;
                }
 
                if (heights[j] > maxBetween) {
                    maxBetween = heights[j];
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] heights = {10, 6, 8, 5, 11, 9};

        int[] result = canSeePersonsCount(heights);

        System.out.println(Arrays.toString(result));
    }
}