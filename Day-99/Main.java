import java.util.*;

public class Main {

    public static int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);

        int n = deck.length;
        int[] result = new int[n];

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            queue.add(i);
        }

        int i = 0;

        while (!queue.isEmpty()) {
            int index = queue.poll();

            result[index] = deck[i];
            i++;

            if (!queue.isEmpty()) {
                queue.add(queue.poll());
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] deck = {17, 13, 11, 2, 3, 5, 7};

        int[] result = deckRevealedIncreasing(deck);

        System.out.println(Arrays.toString(result));
    }
}