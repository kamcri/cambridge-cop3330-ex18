/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kameryn Cambridge
 */
package org.example;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Press C to convert from Fahrenheit to Celsius.\n" +
                "Press F to convert from Celsius to Fahrenheit.");
        String input = sc.nextLine();
        if (input.equals("C") || input.equals("c"))
        {
            Scanner tempSc = new Scanner(System.in);
            System.out.println("Your choice: " + input);
            System.out.println("Please enter the temperature in Fahrenheit: ");
            float farenTemp = tempSc.nextFloat();

            float temp = (farenTemp - 32) * 5 / 9;
            System.out.printf("The temperature in Celsius is %.1f" ,temp);
        }
        if (input.equals("F") || input.equals("f"))
        {
            Scanner tempSc = new Scanner(System.in);
            System.out.println("Your choice: " + input);
            System.out.println("Please enter the temperature in Celsius: ");
            float celTemp = tempSc.nextFloat();

            float temp = (celTemp * 9 / 5) + 32;
            System.out.printf("The temperature in Fahrenheit is %.1f", temp);
        }
    }
}
