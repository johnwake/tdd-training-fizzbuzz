package com.fizzbuzz.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class FizzBuzzTest extends TestCase {

    public void testAMultipleOf3ShouldSuccessfullyReturnFizz() {
        int input = 3;
        String expected = "Fizz";
        String result = FizzBuzz.main(input);

        assertEquals(expected, result);
    }
}
