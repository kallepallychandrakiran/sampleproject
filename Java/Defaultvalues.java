class Student {
    int age;
    String name;
    boolean isMarried;
    float height;
}

public class Defaultvalues {
    public static void main(String[] args) {
        int a = 23;
        Student s = new Student();
        System.out.println(s.age);
        System.out.println(s.name);
        System.out.println(s.isMarried);
        System.out.println(s.height);
        System.out.println(a);
    }
}
