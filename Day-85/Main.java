public class Main {

    static String remove(String s) {

        StringBuilder sb = new StringBuilder(s);

        boolean found = true;

        while (found) {

            found = false;

            for (int i = 0; i < sb.length() - 1; i++) {

                if (sb.charAt(i) == sb.charAt(i + 1)) {

                    sb.delete(i, i + 2);

                    found = true;

                    break;
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        String s = "abbaca";

        System.out.println(remove(s));
    }
}