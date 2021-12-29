package com.code.arlw87;

import java.util.Scanner;

public class Main {

    static Scanner in;

    public static void main(String[] args) {
	// write your code here
        System.out.println("This is a program for practicing String methods");
        //First i want to create a menu system in the text console
        //then i want to set an option to try a string method
        //each method will have some information on how it works
        //and there maybe additional information on string as week

        //initialise the scanner input
        in = new Scanner(System.in);

        boolean exit;

        //run the program unit the user exits
        do{
            int choice = menuSystem();
            exit = runOption(choice);
        } while (!exit);

        in.close();
    }

    private static boolean runOption(int optionSelected){
        //run a switch statement with the options

        switch(optionSelected){
            case 1: printLine("Creating a new String....");
                    return false;
            case 2: printLine("Concatenating Strings....");
                return false;
            case 3: printLine("Learn about string immutability...");
                return false;
            case 4: printLine("Get the length of a String");
                System.out.println("");
                getWordLength();
                return false;
            case 5: printLine("Using the CharAt method...");
                return false;
            case 6: printLine("Using the indexOf method...");
                return false;
            default: printLine("Exit the program");
                return true;
        }

    }

    static int menuSystem(){
        System.out.println("Welcome to the String practice program");
        System.out.println("Please select an option");
        printLine("1 - Create new Strings");
        printLine("2 - Concatenate Strings");
        printLine("3 - Learn about String Immutability");
        printLine("4 - Get the length of a String");
        printLine("5 - Use the CharAt method");
        printLine("6 - Use the IndexOf Method");
        printLine("99 - exit the program");

        //Wait for user input
        String optionSelectedString = in.nextLine();

        int numSelected;

        try{
            numSelected = Integer.parseInt(optionSelectedString.trim());
        } catch (Exception e) {
            //if an invalid number is added then exit
            numSelected = 99;
        }


        return numSelected;
    }

    static void printLine(String input){
        System.out.println(input);
    }

    private static void getWordLength(){
        printLine("Please enter a string....");
        String inputtedString = in.nextLine();
        String output = "The length of the inputed string was " + inputtedString.trim().length();
        printLine(output);
    }

}
