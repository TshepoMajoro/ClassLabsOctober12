package org.example;
/*
Exercise 2.3: Number analysis
Create NumberAnalysis. Determine whether an integer is positive, negative, or zero,
and whether it is even or odd. Remember that zero is even.
 */

public class NumberAnalysis {
    private int number;
    private boolean isPositive;
    private boolean isZero;
    private boolean isEven;

    public NumberAnalysis(int num){
        number = num;
    }

    private boolean isNumberPositive(){
        if (number < 0){
            isPositive = false;
        } else {
            isPositive = true;
        }
        return isPositive;
    }

    private boolean isNumberZero(){
        if (number == 0){
            isZero = true;
        } else {
            isZero = false;
        }
        return isZero;
    }

    private boolean isNumberEven(){
        if (isNumberZero() || number % 2 == 0){
            isEven = true;
        } else {
            isEven = false;
        }
        return isEven;
    }

    public void analyze(){
        if (isNumberPositive() && isNumberEven() && isNumberZero()){
            System.out.println("\n"+number+" is zero, a positive even number");
        } else if(isNumberPositive() && isNumberEven() && !isNumberZero()){
            System.out.println("\n"+number+" is a non-zero positive even number");
        } else if (isNumberPositive() && !isNumberEven()){
            System.out.println("\n"+number+" is a positive odd number");
        }
        else if (!isNumberPositive() && isNumberEven()){
            System.out.println("\n"+number+" is a negative even number");
        } else {
            System.out.println("\n"+number+" is a negative odd number");
        }
    }
}
