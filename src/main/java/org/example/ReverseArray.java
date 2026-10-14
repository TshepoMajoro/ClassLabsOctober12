package org.example;
/*
Exercise 3.5: Reverse an array
Create ReverseArray. Display the array in reverse order without changing the original array.

Challenge: Reverse the array in place by swapping elements.
 */
public class ReverseArray {
    private int[] numbers;

    public ReverseArray(int[] _numbers){
        numbers = _numbers;
    }

//    private void doReversal(){
//        int firstNum = numbers[0];
//        int lastNum = numbers[numbers.length - 1];
//        int nextNum;
//        int i = 0;
//        int[] initialIndexes = new int[numbers.length];
//        int turningPoint = -1;
//
//        while (true){
//            try{
//                nextNum = numbers[i+1];
//                numbers[i + 1] = numbers[i];
//                numbers[i] = nextNum;
//                if ((numbers.length - 1) - turningPoint == i){
//                    continue;
//                }
//                i ++;
//            } catch (IndexOutOfBoundsException e){
//                i = 0;
//            }
//            if (numbers[0] == lastNum && numbers[numbers.length - 1] == firstNum){
//                break;
//            }
//            turningPoint += 1;
//        }
//
//    }

    public void performReversal(){
        int[] numbersReversed = new int[numbers.length];
        int j = -1;
        for (int i = numbers.length - 1; i >= 0; i--){
            j++;
            numbersReversed[j] = numbers[i];
        }

        System.out.println("\n\nHere are the preReversalResults:");
        for (int num : numbers){
            System.out.println(num);
        }
        System.out.println("\nHere are the post reversal results:");
        for (int num : numbersReversed){
            System.out.println(num);
        }
    }
}
