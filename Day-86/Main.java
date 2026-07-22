import java.util.ArrayList;

public class Main {

    static class MinStack {

        ArrayList<Integer> stack = new ArrayList<>();

        void push(int x) {
            stack.add(x);
        }

        void pop() {
            if (!stack.isEmpty())
                stack.remove(stack.size() - 1);
        }

        int top() {
            return stack.get(stack.size() - 1);
        }

        int getMin() {

            int min = stack.get(0);

            for (int x : stack) {

                if (x < min)
                    min = x;
            }

            return min;
        }
    }

    public static void main(String[] args) {

        MinStack s = new MinStack();

        s.push(5);
        s.push(3);
        s.push(7);
        s.push(2);

        System.out.println("Top = " + s.top());
        System.out.println("Min = " + s.getMin());

        s.pop();

        System.out.println("After Pop");
        System.out.println("Top = " + s.top());
        System.out.println("Min = " + s.getMin());
    }
}