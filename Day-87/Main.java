import java.util.Stack;

public class Main {

    static String remove(String s) {

        int[] count = new int[26];
        boolean[] used = new boolean[26];

        for (char ch : s.toCharArray())
            count[ch - 'a']++;

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            count[ch - 'a']--;

            if (used[ch - 'a'])
                continue;

            while (!stack.isEmpty()
                    && stack.peek() > ch
                    && count[stack.peek() - 'a'] > 0) {

                used[stack.pop() - 'a'] = false;
            }

            stack.push(ch);
            used[ch - 'a'] = true;
        }

        StringBuilder ans = new StringBuilder();

        for (char c : stack)
            ans.append(c);

        return ans.toString();
    }

    public static void main(String[] args) {

        String s = "cbacdcbc";

        System.out.println(remove(s));
    }
}