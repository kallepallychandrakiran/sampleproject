import java.util.Arrays;
import java.util.Scanner;

public class palidrome {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the word!");
            String s = scan.next();
            int m = s.length();
            int i, j;
            char[] org = new char[m];
            char[] rev = new char[m];
            for (i = 0; i <= m - 1; i++) {
                org[i] = s.charAt(i);
            }
            i = m - 1;
            j = 0;
            while (i >= 0) {
                rev[j] = org[i];
                i--;
                j++;
            }

            System.out.println(org);
            System.out.println(rev);

            boolean status = Arrays.equals(org, rev);

            if (status == true) {
                System.out.println("This is a valid palindrome");
            } else {
                System.out.println("This is NOT a valid palindrome");
            }
            scan.close();
        }

    }
}
