package org.example;
/*
Exercise 2.2: Grade calculator
Create GradeCalculator and classify marks:

Mark Grade

80--100 Distinction 70--79 Merit 50--69 Pass 0--49 Fail Outside 0--100 Invalid mark

Order conditions correctly so each mark receives one result.
 */

public class GradeCalculator {
    private double mark;

    public GradeCalculator(double _mark){
        mark = _mark;
    }

    public void outcome(){
        if (mark >= 80 && mark <= 100){
            System.out.println("\nDistinction");
        } else if (mark >= 70 && mark <= 79){
            System.out.println("\nMerit");
        } else if (mark >= 50 && mark <= 69){
            System.out.println("\nPass");
        } else if (mark >= 0 && mark <= 49){
            System.out.println("\nFail");
        } else {
            System.out.println("\nInvalid Mark!");
        }
    }
}
