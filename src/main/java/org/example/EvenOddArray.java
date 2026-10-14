package org.example;

import com.sun.jdi.event.ExceptionEvent;

/*
Exercise 3.4: Separate even and odd numbers
Create EvenOddArray. Count the even and odd values in an integer array.

Challenge: Store the even and odd values in separate arrays or lists.
 */
public class EvenOddArray {
    private int[] mixedNumbers;
    private int[] oddNumsOnly;
    private int[] evenNumsOnly;
    private int countOfOddNums;
    private int countOfEvenNums;

    public EvenOddArray(int[] numbers){
        mixedNumbers = numbers;
    }

    private void countEvenAndOdd(){
        for (int num : mixedNumbers){
            if (num % 2 == 0){
                countOfEvenNums += 1;
            } else {
                countOfOddNums += 1;
            }
        }
    }

    private void separateEvenFromOdd(){
        countEvenAndOdd();
        oddNumsOnly = new int[countOfOddNums];
        evenNumsOnly = new int[countOfEvenNums];
        int e = countOfEvenNums;
        int o = countOfOddNums;

        for (int num : mixedNumbers){
            if (num % 2 == 0){
                evenNumsOnly[countOfEvenNums - e] = num;
                e -= 1;
            } else {
                oddNumsOnly[countOfOddNums - o] = num;
                o -= 1;
            }
        }
    }

    public void Display(){
        separateEvenFromOdd();
        System.out.println("\n\nEven and Odd arrays:::");
        System.out.println("Here's the series of even numbers: ");
        for (int num : evenNumsOnly){
            System.out.println(num);
        }
        System.out.println("Here's the series of odd numbers: ");
        for (int num : oddNumsOnly){
            System.out.println(num);
        }
    }
}
