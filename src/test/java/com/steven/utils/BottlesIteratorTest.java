package com.steven.utils;

import com.steven.bottles.utils.BottlesIterator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BottlesIteratorTest {

    private BottlesIterator bottlesIterator = new BottlesIterator();

    @Test
    void noBottlesTest() {
        String expectedResult = "No more bottles of beer on the wall, no more bottles of beer.\n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.";
        String actualResult = bottlesIterator.getBottles(0, 0);

        assertTrue(expectedResult.equals(actualResult));
    }

    @Test
    void oneBottlesTest() {
        String expectedResult = "1 bottle of beer on the wall, 1 bottle of beer.\n" +
                "Take it down and pass it around, no more bottles of beer on the wall.\n\n";
        String actualResult = bottlesIterator.getBottles(1,1);

        assertTrue(expectedResult.equals(actualResult));
    }

    @Test
    void twoBottlesTest() {
        String expectedResult = "2 bottles of beer on the wall, 2 bottles of beer.\n" +
                "Take one down and pass it around, 1 bottle of beer on the wall.\n\n";
        String actualResult = bottlesIterator.getBottles(2, 2);

        assertTrue(expectedResult.equals(actualResult));
    }

    @Test
    void sevenBottlesTest() {
        String expectedResult = "7 bottles of beer on the wall, 7 bottles of beer.\n" +
                "Take one down and pass it around, 1 six-pack of beer on the wall.\n\n";
        String actualResult = bottlesIterator.getBottles(7, 7);

        assertTrue(expectedResult.equals(actualResult));
    }

    @Test
    void getBottlesTest() {
        String expectedResult = "8 bottles of beer on the wall, 8 bottles of beer.\n" +
                "Take one down and pass it around, 7 bottles of beer on the wall.\n\n" +
                "7 bottles of beer on the wall, 7 bottles of beer.\n" +
                "Take one down and pass it around, 1 six-pack of beer on the wall.\n\n" +
                "1 six-pack of beer on the wall, 1 six-pack of beer.\n" +
                "Take one down and pass it around, 5 bottles of beer on the wall.\n\n" +
                "5 bottles of beer on the wall, 5 bottles of beer.\n" +
                "Take one down and pass it around, 4 bottles of beer on the wall.\n\n" +
                "4 bottles of beer on the wall, 4 bottles of beer.\n" +
                "Take one down and pass it around, 3 bottles of beer on the wall.\n\n" +
                "3 bottles of beer on the wall, 3 bottles of beer.\n" +
                "Take one down and pass it around, 2 bottles of beer on the wall.\n\n" +
                "2 bottles of beer on the wall, 2 bottles of beer.\n" +
                "Take one down and pass it around, 1 bottle of beer on the wall.\n\n" +
                "1 bottle of beer on the wall, 1 bottle of beer.\n" +
                "Take it down and pass it around, no more bottles of beer on the wall.\n\n" +
                "No more bottles of beer on the wall, no more bottles of beer.\n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.";
        String actualResult = bottlesIterator.getBottles(8,0);

        assertTrue(expectedResult.equals(actualResult));
    }

    @Test
    void getBottlesException() {
        Exception exception = assertThrows(Exception.class, () -> {
           bottlesIterator.getBottles(9, 19);
        });

        String expectedExceptionMessage = "Limit exceptions occurred";
        String actualExceptionMessage = exception.getMessage();

        assertTrue(expectedExceptionMessage.equals(actualExceptionMessage));
    }
}
