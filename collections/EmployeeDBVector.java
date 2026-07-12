package com.wipro.collections;

import java.util.Vector;

public class EmployeeDBVector {

    Vector<Employee> list = new Vector<Employee>();

    public boolean addEmployee(Employee e) {
        return list.add(e);
    }

    public boolean deleteEmployee(int empId) {

        for (Employee e : list) {
            if (e.empId == empId) {
                list.remove(e);
                return true;
            }
        }
        return false;
    }

    public String showPaySlip(int empId) {

        for (Employee e : list) {
            if (e.empId == empId) {
                return "Pay Slip for Employee ID : " + empId +
                       "\nSalary : " + e.salary;
            }
        }
        return "Employee Not Found";
    }

    public void showAllEmployees() {

        for (Employee e : list) {
            e.GetEmployeeDetails();
            System.out.println("-------------------------");
        }
    }
}