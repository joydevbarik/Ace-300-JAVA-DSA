import java.util.*;

public class Main {

    public static boolean checkInclusion(String s1, String s2) {

        List<String> perms = new ArrayList<>();

        generate(s1.toCharArray(), 0, perms);

        for (String str : perms) {

            if (s2.contains(str)) {
                return true;
            }
        }

        return false;
    }

    public static void generate(char[] arr, int index, List<String> perms) {

        if (index == arr.length) {

            perms.add(new String(arr));
            return;
        }

        for (int i = index; i < arr.length; i++) {

            char temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;

            generate(arr, index + 1, perms);

            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {

        String s1 = "ab";
        String s2 = "eidbaooo";

        System.out.println(checkInclusion(s1, s2));
    }
}