public class Strings {
    public static void main(String[] args) {
        String s1 = new String("Rama");
        String s2 = new String("Rama");
        String s3 = "Sita";
        String s4 = "Sita";
        String s5;
        s5 = s4;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);

        if (s3 == s4) {
            System.out.println("Same Address");
        } else {
            System.out.println("Address not same");
        }
        if (s4 == s5) {
            System.out.println("Same Address");
        } else {
            System.out.println("Address not same");
        }

    }

}
