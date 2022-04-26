package exercise_3;

public class Worker extends Human {
    public int weekSalary;
    public int workHourPerDay;


    public Worker(String firstName, String lastName, int weekSalary, int workHourPerDay ) {
        super();
        this.firstName = getFirstName();
        this.setWeekSalary(weekSalary);
        this.setWorkHourPerDay(workHourPerDay);

    }


    public int getWeekSalary() {
        return weekSalary;
    }

    public void setWeekSalary(int weekSalary) throws IllegalArgumentException {
        if(weekSalary <= 10) throw
                new IllegalArgumentException("Expected value mismatch!Argument: weekSalary");
        this.weekSalary = weekSalary;
    }

    public int getWorkHourPerDay() {
        return workHourPerDay;
    }

    public void setWorkHourPerDay(int workHourPerDay) throws IllegalArgumentException {
        if (workHourPerDay <= 10) throw
                new IllegalArgumentException("Expected value mismatch!Argument: workHourPerDay");
        this.workHourPerDay = workHourPerDay;
    }
    @Override
        public void setLastName(String lastName) throws IllegalArgumentException{
        if(lastName.length() <= 3) throw
                new IllegalArgumentException("Expected length more than 3 symbols! Argument: lastName");
        this.lastName = lastName;
    };

    @Override
    public String toString() {
        return "Worker{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", weekSalary=" + weekSalary +
                ", Hours per day=" + workHourPerDay +

                '}';
    }
}
