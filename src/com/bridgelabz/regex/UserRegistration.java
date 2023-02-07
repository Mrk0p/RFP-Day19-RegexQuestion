package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    static Pattern firstName = Pattern.compile("^([A-Z]{1}+)([a-z]{2,}+)$");
    static Pattern lastName = Pattern.compile("^([A-Z]{1}+)([a-z]{2,}+)$");
    static Pattern emailId = Pattern.compile("^([a-z\\.]+)([a-z]*)@([a-z]{2,}+)\\.([a-z\\.]{2,}+)([a-z]*)$");

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
    }
}
