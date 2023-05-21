public class TestEmployee {

    public static void main(String[] args) {
        System.out.println("Number of working days: " + Employee.NUM_WORKING_DAYS);
        System.out.println("Weekend days: " + Employee.WEEKEND_DAYS);

        // Create a new Employee object
        Employee employee = new Employee();

        // Set the employee's attributes
        employee.setEmpNum(123);
        employee.setEmpName("John Doe");

        // Test the getters
        System.out.println("Employee number: " + employee.getEmpNum());
        System.out.println("Employee name: " + employee.getEmpName());

        // Test the setters
        employee.setEmpNum(456);
        employee.setEmpName("Jane Smith");

        // Test the getters again
        System.out.println("Employee number: " + employee.getEmpNum());
        System.out.println("Employee name: " + employee.getEmpName());
    }

}
