package Oops;

import java.util.Optional;

// User-defined Exception
class InvalidEmployeeException extends Exception {
    public InvalidEmployeeException(String message) {
        super(message);
    }
}

// Employee class
class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
    }
}

// Main class
public class EmployeeDemo {

    public static void main(String[] args) {

        Employee emp = null; // Change to new Employee(101, "Saranya") to test

        try {
            Optional<Employee> employee = Optional.ofNullable(emp);

            Employee e = employee.orElseThrow(() ->
                    new InvalidEmployeeException("Invalid Employee"));

            e.display();

        } catch (InvalidEmployeeException ex) {
            System.out.println(ex.getMessage());
        }
    }
}