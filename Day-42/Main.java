public class Main {

    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;

        int max = 0;

        while (left < right) {

            int width = right - left;

            int minHeight;

            if (height[left] < height[right]) {
                minHeight = height[left];
            } else {
                minHeight = height[right];
            }

            int area = width * minHeight;

            if (area > max) {
                max = area;
            }

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        Main obj = new Main();

        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        int result = obj.maxArea(height);

        System.out.println(result);
    }
}