import java.util.concurrent.TimeUnit;

public class FibonnaciApp {
    public static void main(String[] args) {
        int z = 10000;
        int firstterm, secondterm, nextterm;
        firstterm = 0;
        secondterm = 1;

        while (firstterm <= z) {
            System.out.print(" " + firstterm);
            nextterm = firstterm + secondterm;
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            firstterm = secondterm;
            secondterm = nextterm;

        }

    }
}
