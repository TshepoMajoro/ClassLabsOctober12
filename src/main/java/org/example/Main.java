package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        StudentDetails naledi = new StudentDetails(
                "Naledi",
                20,
                76.5,
                true
        );
        System.out.println(naledi);

        ShoppingTotal shoppingTotal = new ShoppingTotal(
                "HP Pavillion Gaming 15",
                15000.00,
                1
        );
        System.out.println(shoppingTotal);
    }
}
