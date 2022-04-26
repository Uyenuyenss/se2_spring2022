package exercise_3;

public class Main {
    public static void main(String[] args) {
        Human student = new Student("Nguyen", "To Uyen", 6);
        Human worker = new Worker("Nguyen","To Uyen", 12, 11);
        System.out.println(student.toString());
        worker.toString();
    }
}
