package advanced_tasks;

import java.util.Scanner;

public class letterCounter {

    /*

        Write program that returns true if the total number of uppercase
        characters are equal to total number of lowercase characters of a
        string

        Ex:
            str = "JAVA java";

        output:

            true
     */
    public static void main(String[] args) { // main method is used here in order to check and confirm if my caseCounter method works

        Scanner input = new Scanner(System.in); // I began with a String first before I used scanner to test if it works properly with the example provided above, once I confirmed it worked I updated the method in order to accept any form of String

        System.out.println("Please enter your words");
        System.out.println(caseCounter(input.nextLine())); // the case counter is implemented here with the input given on line 22
    }

    public static boolean caseCounter (String str) {


        int upperCase = 0; // I added a counter for uppercase letters to keep track of how many letters are upper case
        int lowerCase = 0; // I added a counter for lowercase letters to keep track of how many letters are lower case

        for (int i = 0; i < str.length(); i++) { // using a loop to check for both upper and lower case letters in the given string input
            char letters = str.charAt(i); // this line checks each letter in the given string input
            if (letters >= 'A' && letters <= 'Z') { // if there are any letters that are between capital A and capital Z this if statement will count them
                upperCase++; // and this will increase the uppercase counter
            } else if (letters >= 'a' && letters <= 'z') { // if there are any letters that are between lowercase a and lowercase z this else if statement will count them
                lowerCase++; // and this will increase the lowercase counter
            }

        }

        return upperCase == lowerCase; // before I attempted to use an if uppercase == lowercase statement but after some trial and error it seemed more efficient and effective to utilize a ternary for the return clause of the method. this line says that if the uppercase counter is equal to the lowercase counter return true, if the uppercase counter is not equal to the lowercase counter it will return false.

    }

}
