package wrapper;

public class Employee implements Cloneable {

    int empId;
    String empName;
    double salary;

    Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    void display() {
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Salary : " + salary);
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        Employee emp1 = new Employee(101, "Saranya", 50000);

        Employee emp2 = (Employee) emp1.clone();

        // Change original object
        emp1.empId = 102;
        emp1.empName = "Priya";
        emp1.salary = 60000;

        System.out.println("Original Employee Details");
        emp1.display();

        System.out.println();

        System.out.println("Cloned Employee Details");
        emp2.display();

        System.out.println();

        System.out.println("Observation:");
        System.out.println("Changing the original object does not affect the cloned object.");
    }
}