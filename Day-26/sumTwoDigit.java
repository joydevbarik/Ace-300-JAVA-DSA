import java.util.Scanner;

public class sumTwoDigit {

    public static int getSum(int a, int b) {

        while (b > 0) {
            a = -~a;
            b = ~-b;
        }

        while (b < 0) {
            a = ~-a;
            b = -~b;
        }

        return a;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int result = getSum(a, b);

        System.out.println("Sum = " + result);

        sc.close();
    }
}