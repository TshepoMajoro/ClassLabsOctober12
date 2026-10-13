package org.example;
/*
Exercise 2.4: Login check
Create LoginCheck. Compare a username and password stored in String variables with expected values.
Display Login successful or Invalid credentials.

Important: Use .equals() to compare String contents rather than ==.
 */

public class LoginCheck {
    private String username;
    private String password;

    public LoginCheck(String _username, String _password){
        username = _username;
        password = _password;
    }

    public void validateCredentials(String _username_, String _password_){
        if (!username.equals(_username_)){
            System.out.println("\nInvalid username. Please try again!!!");
        } else if (!password.equals(_password_)){
            System.out.println("\nInvalid password. Please try again!!!");
        } else {
            System.out.println("\nusername and password matched!!! Welcome aboard "+username+".");
        }
    }
}
