package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    static Pattern firstName = Pattern.compile("^([A-Z]{1}+)([a-z]{2,}+)$");
    static Pattern lastName = Pattern.compile("^([A-Z]{1}+)([a-z]{2,}+)$");
    static Pattern emailId = Pattern.compile("^([a-z\\.]+)([a-z]*)@([a-z]{2,}+)\\.([a-z\\.]{2,}+)([a-z]*)$");
    static Pattern mobileNumber = Pattern.compile("^(91)( )[6-9]{1,}[0-9]{9,}$");
    static Pattern passwordRule1 = Pattern.compile("^([A-za-z]{8,}+)$");
    static Pattern passwordRule2 = Pattern.compile("^(((?=.*?[A-Z])[A-Za-z]{8,}+))$");

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Name : ");
        Matcher matcher1 = firstName.matcher(scanner.next());

        if (matcher1.matches()){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

        System.out.println();
        System.out.println("Enter Last name :");
        Matcher matcher2 = lastName.matcher(scanner.next());
        if (matcher2.matches()){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

        System.out.println();
        System.out.println("Enter Email name : ");
        Matcher matcher3 = emailId.matcher(scanner.next());
        if(matcher3.matches()){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

        System.out.println();
        System.out.println("Set a password with minimum 8 characters : ");
        Matcher matcher5 = passwordRule1.matcher(scanner.next());
        if(matcher5.matches()){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }


        System.out.println();
        System.out.println("Set a password with minimum 8 characters and having at least one capital letter  : ");
        Matcher matcher6 = passwordRule2.matcher(scanner.next());
        if(matcher6.matches()){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

        System.out.println();
        System.out.println("Enter Mobile number With country code : ");
        Matcher matcher4 = mobileNumber.matcher(scanner.next());
        if(matcher4.matches()){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }


    }
}
