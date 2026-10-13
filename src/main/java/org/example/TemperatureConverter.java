package org.example;

/*
Exercise 1.3: Temperature conversion
Create TemperatureConverter. Convert Celsius to Fahrenheit using:

fahrenheit = (celsius * 9 / 5) + 32

Display both values. Challenge: Convert Fahrenheit back to Celsius.
 */

public class TemperatureConverter {
    private double tempCelsius;
    private double tempFahrenheit;
    private boolean convertToFahrenheit;

    public TemperatureConverter(double _temp, boolean toFahrenheit){
        convertToFahrenheit = toFahrenheit;
        if (convertToFahrenheit){
            tempCelsius = _temp;
        } else {
            tempFahrenheit = _temp;
        }
    }

    public void convert(){
        if (convertToFahrenheit){
            tempFahrenheit = ((tempCelsius * 9) / 5) + 32;
        }
        tempCelsius = ((tempFahrenheit - 32) * 5) / 9;
        if (convertToFahrenheit){
            System.out.println("\nTemperature in Celsius: "+tempCelsius+"\n" +
                    "Temperature in Fahrenheit: "+tempFahrenheit+".");
        } else {
            System.out.println("\nTemperature in Fahrenheit: "+tempFahrenheit+"\n" +
                    "Temperature in Celsius: "+tempCelsius+".");
        }
    }

//    @Override
//    public String toString(){
//        convert();
//        if (convertToFahrenheit){
//            return "\nTemperature in Celsius: "+tempCelsius+"\n" +
//                    "Temperature in Fahrenheit: "+tempFahrenheit+".";
//        }
//        return "\nTemperature in Fahrenheit: "+tempFahrenheit+"\n" +
//                "Temperature in Celsius: "+tempCelsius+".";
//    }
}
