package org.example;
/*
Exercise 3.3: Search an array
Create ArraySearch. Search an integer array for a target value. Display its index if found,
or Value not found otherwise.

Challenge: Report every matching index if the target appears more than once.
 */

public class ArraySearch {
    private int[] numbers;
    private int[] targetNumbersIndex;
    private boolean wasTargetNumberFound;

    public ArraySearch(int[] _numbers){
        numbers = _numbers;
        targetNumbersIndex = new int[numbers.length];
        wasTargetNumberFound = false;
    }

    private void find(int number){
        int index = 0;
        int i = -1;
        for (int num : numbers){
            i += 1;
            if (num == number){
                targetNumbersIndex[index] = i;
                index += 1;
                wasTargetNumberFound = true;
            }
        }
    }

    public void showIndex(int number){
        find(number);
        System.out.println("\n\nArray Search:::\n");
        if (!wasTargetNumberFound){
            System.out.println(number+" not found.");
        } else {
            System.out.println(number+" is found on index/es:");
            int indexPositionTracker = -1;
            for (int indx : targetNumbersIndex){
                indexPositionTracker += 1;
                if ((indx == 0 && indexPositionTracker == 0) || (numbers[indx] == number && indx != 0)){
                    System.out.println(indx);
                }
            }
        }
    }
}
