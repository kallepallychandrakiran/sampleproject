import java.io.IOException;
import java.util.Scanner;

public class Charactercount {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int i = 0;
        System.out.println("Enter a String ");
        String s = scan.next();
        System.out.println("Enter a Charachter");
        char c = (char) (System.in.read());
        // for (int i = 0; i <= s.length() - 1; i++) {
        // if (s.charAt(i) == c) {
        // count++;
        // }
        // }

        while (i <= s.length() - 1) {
            if (s.charAt(i) == c) {
                count++;
            }
            i++;
        }
        System.out.println("No of occurances of " + c + " = " + count);
    }
}
