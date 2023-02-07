package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationEmail {

    static Pattern emailIdSample = Pattern.compile("^([A-Za-z0-9]{3,}+)((?:[\\.\\+\\-][a-zA-Z0-9]+)*)@([a-z0-9]{1,}+)\\.([a-z]{2,}+)((?:\\.[a-zA-Z]+)?)$");
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter proper Email ID : ");
        Matcher matcher1 = emailIdSample.matcher(scanner.next());
        if(matcher1.matches()){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

    }
}
