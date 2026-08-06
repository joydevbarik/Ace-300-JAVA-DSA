import java.util.ArrayList;

public class Main {

    static class RecentCounter {

        ArrayList<Integer> pings;

        public RecentCounter() {
            pings = new ArrayList<>();
        }

        public int ping(int t) {
            pings.add(t);

            int count = 0;

            for (int time : pings) {
                if (time >= t - 3000) {
                    count++;
                }
            }

            return count;
        }
    }

    public static void main(String[] args) {

        RecentCounter rc = new RecentCounter();

        System.out.println(rc.ping(1));     
        System.out.println(rc.ping(100));   
        System.out.println(rc.ping(3001));  
        System.out.println(rc.ping(3002));  
    }
}