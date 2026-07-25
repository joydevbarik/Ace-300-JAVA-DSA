public class Main {
    public String removeStars(String s) {
        StringBuilder stack = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '*') {
                stack.deleteCharAt(stack.length() - 1);
            } else {
                stack.append(c);
            }
        }
        return stack.toString();
    }

    public static void main(String[] args) {
        Solution solver = new Solution();

        String test1 = "leet**cod*e";
        String test2 = "erase*****";

        System.out.println("Input: " + test1 + " -> Output: " + solver.removeStars(test1));
        System.out.println("Input: " + test2 + " -> Output: " + solver.removeStars(test2));
    }
}