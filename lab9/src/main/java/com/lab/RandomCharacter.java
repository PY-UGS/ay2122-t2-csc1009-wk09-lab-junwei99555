package com.lab;

import java.util.Random;

public class RandomCharacter {

    public static void main(String[] args) {
        // Strings to store the generated random values
        String lowerCaseLetters = "";
        String upperCaseLetters = "";
        String digitChars = "";
        String characters = "";
        // Initialize the RandomCharacter class
        RandomCharacter rc = new RandomCharacter();

        // For loop to generate 15 random character for each category and check if the ascii value is prime and adds it to the string
        for(int i = 0; i < 15; i++) {
            char lcLetter = rc.getRandomLowerCaseLetter();
            if(rc.checkPrime(lcLetter)) {
                lowerCaseLetters += lcLetter+"(p) ";
            } else {
                lowerCaseLetters += lcLetter+"(np) ";
            }
            
            char ucLetter = rc.getRandomUpperCaseLetter();
            if(rc.checkPrime(ucLetter)) {
                upperCaseLetters += ucLetter+"(p) ";
            } else {
                upperCaseLetters += ucLetter+"(np) ";
            }

            char digit = rc.getRandomDigitCharacter();
            if(rc.checkPrime(digit)) {
                digitChars += digit+"(p) ";
            } else {
                digitChars += digit+"(np) ";
            }

            char character = rc.getRandomCharacter();
            if(rc.checkPrime(character)) {
                characters += character+"(p) ";
            } else {
                characters += character+"(np) ";
            }
        }

        // Prints out the generated random characters
        System.out.println("Random lower case letters: " + lowerCaseLetters);
        System.out.println("Random upper case letters: " + upperCaseLetters);
        System.out.println("Random digit characters: " + digitChars);
        System.out.println("Random characters: " + characters);
    }

    // Function to get a random lower case letter using the ascii value of 97('a') to 122('z')
    public char getRandomLowerCaseLetter() {
        Random r = new Random();
        return (char)(r.nextInt(122-97) + 97);
    }

    // Function to get a random upper case letter using the ascii value of 65('A') to 90('Z')
    public char getRandomUpperCaseLetter() {
        Random r = new Random();
        return (char)(r.nextInt(90-65) + 65);
    }

    // Function to get a random digit character using the ascii value of 48('0') to 57('9')
    public char getRandomDigitCharacter() {
        Random r = new Random();
        return (char)(r.nextInt(57-48) + 48);
    }

    // Function to get a random character using the ascii value of 33('!') to 126('~')
    public char getRandomCharacter() {
        Random r = new Random();
        return (char)(r.nextInt(126-33) + 33);
    }

    // Function to check if the ascii value of a character is a prime number
    public boolean checkPrime(char c) {
        // Get the ascii value of the character
        int asciiValue = (int)c;
        // For loop to check if it is a prime number
        for (int i = 2; i <= asciiValue / 2; i++) {
            if (asciiValue % i == 0) {
                // Return false if the ascii value is divisible, which means it is not prime
                return false;
            }
        }
        // Return true if the ascii value is not divisible by any number, which means it is prime
        return true;
    }
}