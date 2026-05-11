import java.util.*;

public class Main {

    static class MyHashMap {

        private int[] data;

        public MyHashMap() {
            data = new int[1000001];
            Arrays.fill(data, -1);
        }

        public void put(int key, int value) {
            data[key] = value;
        }

        public int get(int key) {
            return data[key];
        }

        public void remove(int key) {
            data[key] = -1;
        }
    }

    public static void main(String[] args) {

        MyHashMap map = new MyHashMap();

        map.put(1, 10);
        map.put(2, 20);

        System.out.println("Value of key 1: " + map.get(1));
        System.out.println("Value of key 2: " + map.get(2));

        map.remove(1);

        System.out.println("After removing key 1: " + map.get(1));
    }
}
