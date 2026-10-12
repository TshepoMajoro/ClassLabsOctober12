package org.example;

/*
Lab 1: Variables and Data Types
Exercise 1.1: Student details
Create StudentDetails. Declare variables for a student's name (String), age (int),
average mark (double), and registration status (boolean). Assign values and
print a labelled summary.

Expected output example:

Student Name: Naledi
Age: 20
Average Mark: 76.5
Registered: true
* */

public class StudentDetails{

    private String name;
    private int age;
    private double mark;
    private boolean status;

    public StudentDetails(String _name, int _age, double _mark, boolean _status){
        name = _name;
        age = _age;
        mark = _mark;
        status = _status;
    }

    @Override
    public String toString(){
        return "Student Name: "+this.name+"\n" +
                "Age: "+this.age+"\n" +
                "Average Mark: "+this.mark+"\n" +
                "Registered: "+this.status;
    }
}
