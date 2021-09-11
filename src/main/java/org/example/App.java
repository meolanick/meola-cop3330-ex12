/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Meola
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        double principal;
        double rateOfInterest;
        int years;
        int worth;

        System.out.println("Enter the principal:");
        principal = scan.nextDouble();

        System.out.println("Enter the rate of interest:");
        rateOfInterest = scan.nextDouble();

        System.out.println("Enter the number of years:");
        years = scan.nextInt();

        worth = (int)Math.round( principal * ( 1 + rateOfInterest * years *0.01 ) );

        System.out.println("After " + years + " years at " + rateOfInterest + "%, the investment will be worth $" + worth + "." );

    }
}
