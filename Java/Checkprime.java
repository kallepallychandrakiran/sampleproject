public class Checkprime {
    public static void main(String[] args) {
        int n, i, rem, count;
        n = 12;
        i = 2;
        rem = 0;
        count = 0;
        if (n == 0) {
            System.out.println("pls enter a valid input");
        }

        while (i <= n / 2) {
            rem = n % i;
            if (rem == 0) {
                System.out.println("This is not a prime number");
                break;
            }

            else if (rem != 0) {
                i++;
                count++;

            }

        }
        System.out.println("This is a prime number");

    }
}
