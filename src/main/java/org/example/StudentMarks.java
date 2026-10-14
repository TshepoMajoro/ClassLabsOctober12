package org.example;
/*
Exercise 3.1: Store student marks
Create StudentMarks with an integer array of five marks. Print each mark using a loop,
then calculate and display the total and average.
 */
public class StudentMarks {
    private int[] marks;
    private double averageMark;
    private int totalMark;

    public StudentMarks(int[] _marks_){
        marks = _marks_;
        averageMark = 0.0;
        totalMark = 0;
        performCalculations();
    }

    public void performCalculations(){
        int numMarks = 0;
        for(int mark : marks){
            totalMark += mark;
            numMarks += 1;
        }
        averageMark += ((double)totalMark / numMarks);
    }

    public void getStats(){
        System.out.println("\n\nStudent Marks::::");
        for(int mark : marks){
            System.out.println(mark);
        }
        System.out.println("The net sum of all the marks is: "+totalMark+"\n" +
                "The average mark is: "+averageMark);
    }
}
