package org.example;

import java.util.Arrays;

/*
Exercise 5.3: Employee salary review
Create an Employee class with employee number, name, and monthly salary.
Create an array of at least five employee objects. Display each employee's details,
employees earning more than a threshold, the highest salary, and the average salary.

Use if statements to classify salaries as below 10,000,
from 10,000 up to but not including 20,000, or 20,000 and above.
 */
public class Employee {
    private String employeeNumber;
    private String employeeName;
    private double salary;

    public Employee(){}

    public Employee(String employeeNumber, String employeeName, double salary){
        this.employeeNumber = employeeNumber;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public void displayDetails(){
        System.out.println("\nEmployee number: "+employeeNumber+"\n" +
                "Employee name: "+employeeName+"\n" +
                "Employee salary: R"+salary+"\n");
    }

    public static class EmployeeDashboard{
        private Employee[] employees;
        private double highestSalary;
        private double averageSalary;


        public EmployeeDashboard(Employee[] employees){
            this.employees = employees;
            highestSalary = 0;
            averageSalary = 0;
        }

        private void determineHighestSalary(){
            Employee highestEarner = new Employee();
            for (Employee employee : employees){
                if (employee.salary > highestSalary){
                    highestSalary = employee.salary;
                    highestEarner = employee;
                }
            }
            System.out.println("\nThe highest earner is: "+highestEarner.employeeName+", " +
                    "with a salary of R"+highestEarner.salary+"\n");
        }

        private void determineAverageSalary(){
            double salarySum = 0;
            for (Employee emp : employees){
                salarySum += emp.salary;
            }
            averageSalary = salarySum / (employees.length);
            System.out.println("\nThe average employee salary is R"+averageSalary+"\n");
        }

        private void classifySalaries(){
            for (Employee emp : employees){
                if (emp.salary >= 20000){
                    System.out.println("\n"+emp.employeeName+" earns R20 000.00 or above");
                } else if (emp.salary >= 10000){
                    System.out.println("\n"+emp.employeeName+" earns between R10 000.00 and " +
                            "R19 999.99");
                } else {
                    System.out.println("\n"+emp.employeeName+" earns less than R10 000.00");
                }
            }
//            Arrays.stream(employees).map((Employee emp) -> {
//                if (emp.salary >= 20000){
//                    System.out.println("\n"+emp.employeeName+" earns R20 000.00 or above");
//                } else if (emp.salary >= 10000){
//                    System.out.println("\n"+emp.employeeName+" earns between R10 000.00 and " +
//                            "R19 999.99");
//                } else {
//                    System.out.println("\n"+emp.employeeName+" earns less than R10 000.00");
//                }
//                return null;
//            });
        }

        public void display(){
            System.out.println("\n\nEmployee Dashboard:::");
            for (Employee emp : employees){
                emp.displayDetails();
            }
//            Arrays.stream(employees).map((Employee emp) -> {
//                emp.displayDetails();
//                return null;
//            });
            classifySalaries();
            determineAverageSalary();
            determineHighestSalary();
        }
    }
}
