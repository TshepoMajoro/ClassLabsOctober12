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

        PassOrFail pass = new PassOrFail(65.0);
        pass.verdict();
        PassOrFail fail = new PassOrFail(45.0);
        fail.verdict();
        PassOrFail invalidInput = new PassOrFail(135);
        invalidInput.verdict();

        GradeCalculator invalidMark = new GradeCalculator(-76);
        invalidMark.outcome();
        GradeCalculator distinction = new GradeCalculator(94);
        distinction.outcome();
        GradeCalculator merit = new GradeCalculator(70);
        merit.outcome();
        GradeCalculator passs = new GradeCalculator(55);
        passs.outcome();
        GradeCalculator faill = new GradeCalculator(34);
        faill.outcome();

        NumberAnalysis analyseNumber = new NumberAnalysis(8);
        analyseNumber.analyze();
        NumberAnalysis analyseNumber2 = new NumberAnalysis(0);
        analyseNumber2.analyze();
        NumberAnalysis analyseNumber3 = new NumberAnalysis(-24);
        analyseNumber3.analyze();
        NumberAnalysis analyseNumber4 = new NumberAnalysis(7);
        analyseNumber4.analyze();
        NumberAnalysis analyseNumber5 = new NumberAnalysis(-11);
        analyseNumber5.analyze();

        LoginCheck credentialsPass = new LoginCheck("John@Doe","IamJohnDoe");
        credentialsPass.validateCredentials("John@Doe","IamJohnDoe");

        LoginCheck credentialsFailUsername = new LoginCheck("Jane_Doe","I@mJaneDoe");
        credentialsFailUsername.validateCredentials("jane_doe","I@mJaneDoe");

        LoginCheck credentialsFailPassword = new LoginCheck("Jane_Doe","I@mJaneDoe");
        credentialsFailPassword.validateCredentials("Jane_Doe","!@mJaneDoe");
    }
}
