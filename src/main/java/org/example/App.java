/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Eric Gass
 */

package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a noun: ");
        String noun = scan.nextLine();
        System.out.print("Enter a verb: ");
        String verb = scan.nextLine();
        System.out.print("Enter an adjective: ");
        String adjective = scan.nextLine();
        System.out.print("Enter an adverb: ");
        String adverb = scan.nextLine();
        System.out.println(String.format("Do you %s your %s %s %s? That's hilarious!",verb,adjective,noun,adverb));
    }
}