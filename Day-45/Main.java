public class Main {

    int[] nums;

    public Main(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int left, int right) {

        int sum = 0;

        for (int i = left; i <= right; i++) {
            sum += nums[i];
        }

        return sum;
    }

    public static void main(String[] args) {

        int[] arr = {-2, 0, 3, -5, 2, -1};

        Main obj = new Main(arr);

        System.out.println(obj.sumRange(0, 2));
        System.out.println(obj.sumRange(2, 5));
        System.out.println(obj.sumRange(0, 5));
    }
}