import java.util.Scanner;

public class Main {

    public static int maxNumberOfBalloons(String text) {

        int[] count = new int[26];

        for (char c : text.toCharArray()) {
            count[c - 'a']++;
        }

        int result = count['b' - 'a'];
        result = Math.min(result, count['a' - 'a']);
        result = Math.min(result, count['l' - 'a'] / 2);
        result = Math.min(result, count['o' - 'a'] / 2);
        result = Math.min(result, count['n' - 'a']);

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        int ans = maxNumberOfBalloons(text);

        System.out.println("Maximum number of balloons = " + ans);

        sc.close();
    }
}