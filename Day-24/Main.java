import java.util.Scanner;

public class Main {

    public static int rangeBitwiseAnd(int left, int right) {
        int result = left;

        for (int i = left + 1; i <= right; i++) {
            result = result & i;
            if (result == 0) {
                return 0;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter left value: ");
        int left = sc.nextInt();

        System.out.print("Enter right value: ");
        int right = sc.nextInt();

        int answer = rangeBitwiseAnd(left, right);

        System.out.println("Range Bitwise AND = " + answer);

        sc.close();
    }
}