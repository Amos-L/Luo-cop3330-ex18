/*
 *  UCF COP3330 Fall 2021 Assignment 1.18 Solution
 *  Copyright 2021 Amos Luo
 */

package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {

        Scanner x = new Scanner(System.in);
        System.out.print("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.\nYour choice: "); //Asking for user input
        String temp_letter = x.nextLine(); //Storing user input

        if(temp_letter.equals("C") || temp_letter.equals("c")){ //If it is equal to C or c, does conversion math for F to C
            System.out.printf("Please enter the temperature in Fahrenheit: ");
            Scanner y = new Scanner(System.in);
            double num = y.nextDouble();
            double result = (num - 32) * 5 / 9;
            System.out.printf("The temperature in Celsius is %.0f.", result);
        }
        if(temp_letter.equals("F") || temp_letter.equals("f")){ //If it is equal to F or f, does conversion math for C to F
            System.out.printf("Please enter the temperature in Celsius: ");
            Scanner y = new Scanner(System.in);
            double num = y.nextDouble();
            double result = (num * 9 / 5) + 32;
            System.out.printf("The temperature in Fahrenheit is %.0f.", result);
        }
    }
}