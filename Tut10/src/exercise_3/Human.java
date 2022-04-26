package exercise_3;

public class Human {
    public String firstName;
    public String lastName;

    public Human() {
    }

    public Human(String firstName, String lastName) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws IllegalArgumentException {
        if(firstName.charAt(0) != firstName.toUpperCase().charAt(0)) throw
                new IllegalArgumentException("Expected upper case letter! Argument: firstName");
        if(firstName.length() < 4) throw
                new IllegalArgumentException("Expected length at least 4 symbols! Argument: firstName");
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws IllegalArgumentException {
        if(lastName.charAt(0) != lastName.toUpperCase().charAt(0)) throw
                new IllegalArgumentException("Expected upper case letter! Argument: lastName");
        if(lastName.length() < 3) throw
                new IllegalArgumentException("Expected length at least 3 symbols! Argument: lastName");
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Type: ").append(this.getClass().getSimpleName())
                .append(System.lineSeparator())
                .append("First Name: ").append(this.getFirstName())
                .append(System.lineSeparator())
                .append("Last Name: ").append(this.getLastName())
                .append(System.lineSeparator());
        return sb.toString();
    }
}
