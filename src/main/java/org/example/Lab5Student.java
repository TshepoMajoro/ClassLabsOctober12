package org.example;
/*
Create a Student class with student number, name, and an array of three marks.
Add methods to calculate the average, determine whether the student passed
(average at least 50), and display a summary.

In a separate main class, create at least three student objects,
display their averages and results, count how many passed, and
identify the student with the highest average.

Validation: Marks must be between 0 and 100.
 */
public class Lab5Student {
    private String studentNumber;
    private String studentName;
    private double[] studentMarks;
    private double averageMark;
    private boolean didPass;
    private boolean areMarksValid;

    public Lab5Student(String stdntNum, String name, double[] marks){
        studentNumber = stdntNum;
        studentName = name;
        if (marksAreValid(marks)){
            studentMarks = marks;
        } else {
            System.out.println(studentName+" of student number "+studentNumber+" has " +
                    "invalid marks!!!");
        }
    }

    private boolean marksAreValid(double[] marks){
        if (marks.length == 3){
            for (double mark : marks){
                if (mark < 0 || mark > 100){
                    areMarksValid = false;
                    return areMarksValid;
                }
            }
        } else {
            System.out.println("\nStudent must have 3 assessment marks");
            areMarksValid = false;
            return areMarksValid;
        }
        areMarksValid = true;
        return areMarksValid;
    }

    private void calculateStudentAverage(){
        double sum = 0;
        for(double mark : studentMarks){
            sum += mark;
        }
        averageMark += (sum / 3);
    }

    private void outcome(){
        if (averageMark >= 50){
            didPass = true;
        } else {
            didPass = false;
        }
    }

    public void display(){
        if (studentMarks.length == 3 && areMarksValid){
            calculateStudentAverage();
            outcome();
            System.out.println("\n\nLab 05 Student::::");
            System.out.println("\nStudent name: "+studentName+"\n" +
                    "Student number: "+studentNumber+"\n" +
                    "Average: "+Math.round(averageMark)+"\n" +
                    "Final outcome: "+(didPass ? "Passed" : "Failed"));
        }
    }

    public void comparePerformance(Lab5Student[] otherStudents){
        double highestAverage = averageMark;
        String highestPerformer = studentName + " of the student number "+studentNumber+", with" +
                " an average mark of "+highestAverage;
        int numStudentsPassed = didPass ? 1 : 0;

        for (Lab5Student student : otherStudents){
            if (student.averageMark > highestAverage){
                highestAverage = student.averageMark;
                highestPerformer = student.studentName + " of the student number "+student.studentNumber+", with" +
                        " an average mark of "+highestAverage;
            }
            numStudentsPassed += student.didPass ? 1 : 0;
        }

        System.out.println("\n"+numStudentsPassed+" out of "+(otherStudents.length + 1)+" " +
                "students passed.\n"+"With the highest performer being "+highestPerformer);
    }
}
