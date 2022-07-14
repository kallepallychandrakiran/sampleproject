import java.util.Scanner;

public class PersonApp {
    public static void main(String[] args) {
        int i;
        try (Scanner sc = new Scanner(System.in)) {
            Person[] p = new Person[4];
            p[0] = new Person();
            p[1] = new Person();
            p[2] = new Person();
            p[3] = new Person();

            for (i = 0; i <= 3; i++) {
                System.out.println("Enter the name");
                p[i].name = sc.next();
                System.out.println("enter the age");
                p[i].age = sc.nextInt();
            }

            for (i = 0; i <= 3; i++) {
                System.out.print(p[i].name + " " + p[i].age);
                System.out.println();
            }
        }

    }
}