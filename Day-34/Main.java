import java.util.*;

public class Main {

    public static List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            char[] arr = str.toCharArray();

            Arrays.sort(arr);

            String key = new String(arr);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();

        String[] strs = new String[n];

        System.out.println("Enter strings:");

        for (int i = 0; i < n; i++) {
            strs[i] = sc.next();
        }

        List<List<String>> result = groupAnagrams(strs);

        System.out.println(result);

        sc.close();
    }
}