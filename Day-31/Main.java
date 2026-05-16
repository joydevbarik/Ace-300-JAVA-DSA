import java.util.Scanner;

public class Main {

    public static boolean canConstruct(String ransomNote, String magazine) {

        StringBuilder sb = new StringBuilder(magazine);

        for (char c : ransomNote.toCharArray()) {

            int index = sb.indexOf(String.valueOf(c));

            if (index == -1) {
                return false;
            }

            sb.deleteCharAt(index);
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ransom note: ");
        String ransomNote = sc.nextLine();

        System.out.print("Enter magazine text: ");
        String magazine = sc.nextLine();

        boolean result = canConstruct(ransomNote, magazine);

        System.out.println("Can construct: " + result);

        sc.close();
    }
}