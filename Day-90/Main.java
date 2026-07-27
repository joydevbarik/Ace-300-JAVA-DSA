import java.util.*;

public class Main {

    public static int calculate(String s) {
        List<String> rpn = new ArrayList<>();
        Stack<Character> op = new Stack<>();

        int i = 0;
        while (i < s.length()) {
            char ch = s.charAt(i);

            if (ch == ' ') {
                i++;
            } else if (Character.isDigit(ch)) {
                String num = "";
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    num += s.charAt(i);
                    i++;
                }
                rpn.add(num);
            } else {
                while (!op.isEmpty() && priority(op.peek()) >= priority(ch)) {
                    rpn.add(String.valueOf(op.pop()));
                }
                op.push(ch);
                i++;
            }
        }

        while (!op.isEmpty()) {
            rpn.add(String.valueOf(op.pop()));
        }

        Stack<Integer> stack = new Stack<>();

        for (String t : rpn) {
            if (t.equals("+")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a + b);
            } else if (t.equals("-")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a - b);
            } else if (t.equals("*")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a * b);
            } else if (t.equals("/")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a / b);
            } else {
                stack.push(Integer.parseInt(t));
            }
        }

        return stack.pop();
    }

    public static int priority(char ch) {
        if (ch == '*' || ch == '/')
            return 2;
        return 1;
    }

    public static void main(String[] args) {
        String s = "3+2*2";
        System.out.println(calculate(s)); 
    }
}