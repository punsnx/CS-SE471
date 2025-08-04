package Gemini;

public class Employee {
    private String firstName;
    private String lastName;
    private String employeeId;

    public Employee(String firstName, String lastName, String employeeId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmployeeId() {
        return employeeId;
    }
}
