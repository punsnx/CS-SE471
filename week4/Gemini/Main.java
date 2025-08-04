package Gemini;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee("Jane", "Smith", "98765");

        Customer employeeAsCustomer = new EmployeeAdapter(employee);

        System.out.println("--- Preparing to process transaction ---");
        System.out.println("Original Employee First Name: " + employee.getFirstName());
        System.out.println("Original Employee ID: " + employee.getEmployeeId());
        
        System.out.println("\n--- Using the Adapter ---");

        processTransaction(employeeAsCustomer);
    }

    public static void processTransaction(Customer customer) {
        System.out.println("Processing transaction for Customer:");
        System.out.println("  Full Name: " + customer.getFullName());
        System.out.println("  Customer ID: " + customer.getCustomerID());
        System.out.println("Applying employee discount... Transaction complete.");
    }
}

