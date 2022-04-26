package exercise_3;

public class Student extends Human{
    public int facultyNumber;


    public Student(String firstName, String lastName, int facultyNumber) {
        super(firstName, lastName);
        this.setFacultyNumber(facultyNumber);
    }

    public int getFacultyNumber() {
        return facultyNumber;
    }

    public void setFacultyNumber(int facultyNumber) throws IllegalArgumentException{
        if(facultyNumber <= 5 && facultyNumber >= 10) throw
                new IllegalArgumentException("Invalid faculty number");
        this.facultyNumber = facultyNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", facultyNumber=" + facultyNumber +
                '}';
    }
}
