    
    public class Employee extends Person {
    int empId;
    double salary;

    public Employee(String name, String dob, int empId, double salary) {
        super(name, dob);
        this.empId = empId;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        displayPersonDetails();
        System.out.println("Emp ID: " + empId + ", Salary: " + salary);
    }
}



