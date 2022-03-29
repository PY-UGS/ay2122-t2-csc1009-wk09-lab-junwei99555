package com.lab;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PrimeNumberTest {
    RandomCharacter randChar;

    // Intitiaze the RandomCharacter class before the test
    @BeforeEach
    public void setUp() {
        randChar = new RandomCharacter();
    }

    @Test
    @DisplayName("Test for the checkPrime() method")
    public void testPrimeNumber() {
        // Check that the checkPrime() method returns true when passing in a character with the ascii value being a prime number: /(47), G(71), a(97)
        assertTrue(randChar.checkPrime('/') && randChar.checkPrime('G') && randChar.checkPrime('a'));

        // Check that the checkPrime() method returns false when passing in a character with the ascii value not being a prime number: &(38), P(80), x(120)
        assertFalse(randChar.checkPrime('&') && randChar.checkPrime('P') && randChar.checkPrime('x'));
    }
}