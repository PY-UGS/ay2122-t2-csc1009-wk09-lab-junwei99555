package com.lab;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

public class RandomCharacterTest {
    RandomCharacter randChar;

    // Intitiaze the RandomCharacter class before the test
    @BeforeEach
    public void setUp() {
        randChar = new RandomCharacter();
    }

    @RepeatedTest(100) // Test would be reapeated 100 time
    @DisplayName("Test for the getRandomLowerCaseLetter() method")
    public void testLowerCaseLetter() {
        // Check that the generated letter is lower case by checking if the ascii value is between 97('a') to 122('z')
        char lowerCaseLetter = randChar.getRandomLowerCaseLetter();
        assertTrue(lowerCaseLetter >= 97 && lowerCaseLetter <= 122);
    }

    @RepeatedTest(100) // Test would be reapeated 100 time
    @DisplayName("Test for the getRandomUpperCaseLetter() method")
    public void testUpperCaseLetter() {
        // Check that the generated letter is upper case by checking if the ascii value is between 65('A') to 90('Z')
        char upperCaseLetter = randChar.getRandomUpperCaseLetter();
        assertTrue(upperCaseLetter >= 65 && upperCaseLetter <= 90);
    }

    @RepeatedTest(100) // Test would be reapeated 100 time
    @DisplayName("Test for the getRandomDigitCharacter() method")
    public void testDigitCharacter() {
        // Check that the generated character is a digit by checking if the ascii value is between 48('0') to 57('9')
        char digitChar = randChar.getRandomDigitCharacter();
        assertTrue(digitChar >= 48 && digitChar <= 57);
    }

    @RepeatedTest(100) // Test would be reapeated 100 time
    @DisplayName("Test for the getRandomCharacter() method")
    public void testCharacter() {
        // Check that the generated character is a valid character by checking if the ascii value is between 33('!') to 126('~')
        char character = randChar.getRandomCharacter();
        assertTrue(character >= 33 && character <= 126);
    }
}
