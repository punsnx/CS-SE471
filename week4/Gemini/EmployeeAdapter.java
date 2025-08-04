package Gemini;

public class EmployeeAdapter implements Customer {

    private Employee employee;

    public EmployeeAdapter(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String getFullName() {
        return employee.getFirstName() + " " + employee.getLastName();
    }
    @Override
    public String getCustomerID() {
        return "EMP_" + employee.getEmployeeId();
    }
}
