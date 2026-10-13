package org.example;
/*
Exercise 2.1: Pass or fail
Create PassOrFail. If a mark is 50 or higher, display Pass; otherwise, display Fail.

Challenge: Reject marks below 0 or above 100.
 */
public class PassOrFail {
    private double mark;

    public PassOrFail(double _mark){
        mark = _mark;
    }

    public void verdict(){
        if (mark < 0 || mark > 100){
            System.out.println("\n\nInvalid mark, cannot be less than 0 or greater than 100.");
        } else if (mark >= 50){
            System.out.println("\n\nPass");
        } else {
            System.out.println("\n\nFail");
        }
    }
}
