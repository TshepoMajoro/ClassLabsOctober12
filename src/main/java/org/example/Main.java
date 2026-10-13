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
        naledi.displayStudentDetails();

        //Without discount
        ShoppingTotal shoppingTotal = new ShoppingTotal(
                "HP Pavillion Gaming 15",
                15000.00,
                1
        );
        shoppingTotal.calculateTotalCost();

        //With a 10% discount
        ShoppingTotal shoppingTotal2 = new ShoppingTotal(
                "HP Pavillion Gaming 15",
                15000.00,
                1,
                0.10
        );
        shoppingTotal2.calculateTotalCost();

        TemperatureConverter convertedTemp = new TemperatureConverter(
                32,
                true
        );
        convertedTemp.convert();

        TemperatureConverter convertedTemp2 = new TemperatureConverter(
                60,
                false
        );
        convertedTemp2.convert();
    }
}
