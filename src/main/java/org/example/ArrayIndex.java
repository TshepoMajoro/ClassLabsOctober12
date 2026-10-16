package org.example;
/*
Exercise 6.2: Array index
Explain the error and correct the loop condition.

int[] numbers = {10, 20, 30};

for (int i = 0; i <= numbers.length; i++) {
    System.out.println(numbers[i]);
}
 */
public class ArrayIndex {
    static void main(String[] args){
        System.out.println("\n\nArray Index:::" +
                "\nArrayIndexOutOfBoundsException mean that we have incorrectly indexed an array" +
                " using an index value that does not exist.\n" +
                "For example, if the length of an array is 4, and we use an index value of 5,\nwe would" +
                " be moving beyond the bounds of that array, hence an IndexOutOfBoundsException.");
        int[] numbers = {10, 20, 30};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
