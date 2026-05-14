import java.util.Scanner;

public class Main {

    public static boolean isIsomorphic(String s, String t) {

        int n = s.length();

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {

                if (s.charAt(j) == s.charAt(i) && t.charAt(j) != t.charAt(i)) {
                    return false;
                }

                if (t.charAt(j) == t.charAt(i) && s.charAt(j) != s.charAt(i)) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s = sc.nextLine();

        System.out.print("Enter second string: ");
        String t = sc.nextLine();

        boolean result = isIsomorphic(s, t);

        System.out.println("Isomorphic: " + result);

        sc.close();
    }
}