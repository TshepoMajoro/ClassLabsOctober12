package org.example;
/*
Exercise 6.3: Incorrect grade conditions
Rewrite the conditions so a mark of 85 displays Distinction.

int mark = 85;

if (mark >= 50) {
    System.out.println("Pass");
} else if (mark >= 80) {
    System.out.println("Distinction");
}
 */
public class GradeConditions {
    static void main(String[] args){
        int mark = 85;

        if (mark >= 85) {
            System.out.println("Distinction");
        } else if (mark >= 50) {
            System.out.println("Pass");
        }
    }
}
