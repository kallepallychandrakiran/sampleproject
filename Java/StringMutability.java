public class StringMutability {
    public static void main(String[] args) {
        String s1 = "hyderabad";
        System.out.println("Value of s1 before s2 changed it is : " + s1);
        String s2 = s1;
        s2 = "vijayawada";
        System.out.println("Value of s1 after s2 changed it is : " + s1);

    }

}
