package org.example;
/*
Exercise 6.1: Incorrect String comparison
Explain why the following code may print Different text,
then correct it to compare String contents.

String first = new String("Java");
String second = new String("Java");

if (first == second) {
    System.out.println("Same text");
} else {
    System.out.println("Different text");
}
 */
public class StringComparison {
    static void main(String[] args){
        System.out.println("\n\nIncorrect String Comparison:::" +
                "\nThe provided code sample will print a different text because it used" +
                " the equality operator to compare the values of string variables.\n" +
                "The rightful way is to use the .equals() String method to compare the 2 texts\n");

        String first = new String("Java");
        String second = new String("Java");

        if (first.equals(second)) {
            System.out.println("Same text");
        } else {
            System.out.println("Different text");
        }
    }
}
