public class Tap_14 {

    String courseName = "Java Course";

    class Student {

        String name;

        Student(String name) {
            this.name = name;
        }

        void show() {
            System.out.println(name + " оқиды " + courseName);
        }
    }

    public static void main(String[] args) {

        Tap_14 c = new Tap_14();
        Student s = c.new Student("Dana");

        s.show();
    }
}