public class Tap_13 {

    class Employee {

        String name;
        String position;

        Employee(String name, String position) {
            this.name = name;
            this.position = position;
        }

        void show() {
            System.out.println(name + " - " + position);
        }
    }

    public static void main(String[] args) {

        Tap_13 c = new Tap_13();
        Employee e = c.new Employee("Ayan", "Programmer");

        e.show();
    }
}