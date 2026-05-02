import java.util.*;

public class countingBits {

    public static int[] countBits(int n) {
        int[] ans = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            int count = 0;
            int num = i;
            while (num > 0) {
                count += num & 1;
                num >>= 1;
            }

            ans[i] = count;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] result = countBits(n);

        System.out.println("Bit counts from 0 to " + n + ":");
        for (int i = 0; i < result.length; i++) {
            System.out.println(i + " -> " + result[i]);
        }

        sc.close();
    }
}