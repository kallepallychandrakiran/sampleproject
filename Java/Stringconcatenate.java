public class Stringconcatenate {
    public static void main(String[] args) {

        String s2 = "Rama" + "Sita";
        String s1 = "Rama" + "Sita";
        if (s1 == s2) {
            System.out.println("they are pointing to same address");
        } else {
            System.out.println("they are not pointing to same object");
        }

        String s3 = "Rama";
        String s4 = "Sita";
        String s5 = s3 + s4;
        String s6 = s3 + "Sita";
        String s7 = new String("RamaSita");
        if (s5 == s6) {
            System.out.println("they are pointing to same address");
        } else {
            System.out.println("they are not pointing to same object");
        }
        System.out.println(Integer.toHexString(s5.hashCode()));
        System.out.println(Integer.toHexString(s6.hashCode()));
        System.out.println(Integer.toHexString(s7.hashCode()));
    }
}
