public class Tap_15 {

    static int studentCount = 0;

    static class Student {

        Student() {
            studentCount++;
        }
    }

    public static void main(String[] args) {

        new Student();
        new Student();
        new Student();

        System.out.println("Студент саны: " + studentCount);
    }
}