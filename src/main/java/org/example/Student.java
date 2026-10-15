package org.example;
/*
Exercise 4.1: Student class
Create a Student class with name (String), studentNumber (String), and mark (double).
Add a constructor, displayDetails(), and hasPassed()
which returns true when the mark is at least 50.

In StudentApp, create at least two Student objects and call their methods.
 */
public class Student {
    private String name;
    private String studentNumber;
    private double mark;

    public Student(String _name, String _studentNumber, double _mark){
        name = _name;
        studentNumber = _studentNumber;
        mark = _mark;
    }

    public boolean hasPassed(){
        if (mark >= 50){
            return true;
        }
        return false;
    }

    public void displayDetails(){
        System.out.println("\n\nStudent Details:::");
        System.out.println("Student name: "+name+"\n" +
                "Student number: "+studentNumber+"\n" +
                "Mark: "+mark+"\n"+
                "Results: "+(hasPassed() ? "Passed" : "Failed"));
    }
}
