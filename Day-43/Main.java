public class Main {

    public static int trap(int[] height) {

        int n = height.length;

        int totalWater = 0;

        for (int i = 0; i < n; i++) {

            int maxLeft = 0;

            for (int j = 0; j <= i; j++) {
                maxLeft = Math.max(maxLeft, height[j]);
            }

            int maxRight = 0;

            for (int j = i; j < n; j++) {
                maxRight = Math.max(maxRight, height[j]);
            }

            totalWater += Math.min(maxLeft, maxRight) - height[i];
        }

        return totalWater;
    }

    public static void main(String[] args) {

        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};

        System.out.println(trap(height));
    }
}