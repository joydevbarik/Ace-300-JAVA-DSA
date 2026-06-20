public class Main {

    public static int maxScoreSightseeingPair(int[] values) {

        int best = values[0]; 
        int answer = 0;

        for (int j = 1; j < values.length; j++) {

            answer = Math.max(answer, best + values[j] - j);

            best = Math.max(best, values[j] + j);
        }

        return answer;
    }


    public static void main(String[] args) {

        int[] values = {8, 1, 5, 2, 6};

        int result = maxScoreSightseeingPair(values);

        System.out.println("Maximum Score = " + result);
    }
}