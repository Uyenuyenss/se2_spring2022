package exercise_1;

import exercise_1.Child;
import exercise_1.Person;

import java.util.Scanner;

public class Main {


	// write your code here
        public static void main(String[] args) {
            System.out.println("Enter your name:");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            System.out.println("Enter your age");
            int age = Integer.valueOf(scanner.nextLine());
            try {
                Child child = new Child(name, age);
                System.out.println(child.toString());
                String personClassName = Person.class.getSimpleName();
                String childClassName = Child.class.getSimpleName();
            } catch (IllegalArgumentException error) {
                System.out.println(error.getMessage());
            }
        }

}
