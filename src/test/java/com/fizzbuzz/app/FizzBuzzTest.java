package com.fizzbuzz.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class FizzBuzzTest extends TestCase {

    public void testAMultipleOf3ShouldItSuccessfullyReturnFizz() {
        int input = 3;
        String expected = "Fizz";
        String result = FizzBuzz.main(input);

        assertEquals(expected, result);
    }

    public void testAMultipleOf5ShouldItSuccessfullyReturnBuzz() {}

    public void testAMultipleOf3AndOf5ItShouldSuccessfullyReturnFizzBuzz() {}

    public void testIfNotAMultipleOfThreeOrFiveItShouldReturnTheNumber() {}
}
