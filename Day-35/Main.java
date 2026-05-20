import java.util.HashMap;
import java.util.Scanner;

public class Main {

    private HashMap<Integer, String> map = new HashMap<>();
    private int counter = 0;

    public String encode(String longUrl) {

        map.put(counter, longUrl);

        return "http://tinyurl.com/" + counter++;
    }

    public String decode(String shortUrl) {

        int id = Integer.parseInt(
                shortUrl.replace("http://tinyurl.com/", "")
        );

        return map.get(id);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Main codec = new Main();

        System.out.print("Enter long URL: ");

        String longUrl = sc.nextLine();

        String shortUrl = codec.encode(longUrl);

        System.out.println("Short URL: " + shortUrl);

        String original = codec.decode(shortUrl);

        System.out.println("Decoded URL: " + original);

        sc.close();
    }
}