package org.example;
/*
Exercise 3.2: Highest and lowest values
Create ArrayStatistics. Use an array of at least six integers to find the largest value,
smallest value, and number of elements.

Challenge: Count how many values are greater than or equal to 50.
 */

import java.util.ArrayList;

public class ArrayStatistics {
    private int[] numbers;
    private int highest;
    private int lowest;
    private int numsHigherThan50;

    public ArrayStatistics(int[] nums) throws Exception {
        if (nums.length >= 6){
            numbers = nums;
        } else {
            throw new Exception("Array must have at least 6 integers!!!");
        }
    }

    private void getHighestNumber(){
        highest = numbers[0];
        for (int index = 1; index < numbers.length; index++){
            if (numbers[index] > highest){
                highest = numbers[index];
            }
        }
    }

    private void getLowestNumber(){
        lowest = numbers[0];
        for (int index = 1; index < numbers.length; index++){
            if (numbers[index] < lowest){
                lowest = numbers[index];
            }
        }
    }

    private void getNumbersHigherThan50(){
        for (int number : numbers){
            if (number > 50){
                numsHigherThan50 += 1;
            }
        }
    }

    public void acquireStatistics(){
        getHighestNumber();
        getLowestNumber();
        getNumbersHigherThan50();
        System.out.println("\n\nArray Statistics:::\n");
        System.out.println("The number of digits in the array is: "+numbers.length);
        System.out.println("The highest number is: "+highest);
        System.out.println("The lowest number is: "+lowest);
        System.out.println("The quantity of digits larger than 50 is: "+numsHigherThan50);
    }
}
