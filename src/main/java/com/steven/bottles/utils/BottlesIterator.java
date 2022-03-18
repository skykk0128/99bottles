package com.steven.bottles.utils;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BottlesIterator {

    private final String NO_BOTTLES = "No more bottles of beer on the wall, no more bottles of beer.\n" +
            "Go to the store and buy some more, 99 bottles of beer on the wall.";

    private final String ONE_BOTTLE = "1 bottle of beer on the wall, 1 bottle of beer.\n" +
            "Take it down and pass it around, no more bottles of beer on the wall.\n\n";

    private final String TWO_BOTTLES = "2 bottles of beer on the wall, 2 bottles of beer.\n" +
            "Take one down and pass it around, 1 bottle of beer on the wall.\n\n";

    private final String SIX_BOTTLES = "1 six-pack of beer on the wall, 1 six-pack of beer.\n" +
            "Take one down and pass it around, 5 bottles of beer on the wall.\n\n";

    private final String SEVEN_BOTTLES = "7 bottles of beer on the wall, 7 bottles of beer.\n" +
            "Take one down and pass it around, 1 six-pack of beer on the wall.\n\n";

    private final Logger LOGGER = Logger.getLogger(BottlesIterator.class.getName());

    public String getBottles(int high, int low) {
        StringBuffer sb = new StringBuffer();
        LOGGER.setLevel(Level.INFO);

        try {
            if (high <= 99 && high >= low && low >= 0) {
                for (int i = high; i >= low; i--) {
                    if (i == 0) {
                        sb.append(NO_BOTTLES);
                    } else if (i == 1) {
                        sb.append(ONE_BOTTLE);
                    } else if (i == 2) {
                        sb.append(TWO_BOTTLES);
                    } else if (i == 6) {
                        sb.append(SIX_BOTTLES);
                    } else if (i == 7) {
                        sb.append(SEVEN_BOTTLES);
                    } else {
                        sb.append(i).append(" bottles of beer on the wall, ")
                                .append(i).append(" bottles of beer.\n")
                                .append("Take one down and pass it around, ")
                                .append(i - 1).append(" bottles of beer on the wall.\n")
                                .append("\n");
                    }
                }
            } else if (high < low) {
                throw new Exception("Lower limit is higher than upper limit");
            } else {
                throw new Exception("Upper limit and lower limit exceed boundaries");
            }
        } catch (Exception e) {
            LOGGER.log(Level.INFO, "Limit exceptions occurred", e);
        }

        return sb.toString();
    }
}
