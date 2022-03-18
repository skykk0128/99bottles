package com.steven.utils;

import com.steven.bottles.utils.BottlesIterator;
import org.junit.jupiter.api.Test;

public class BottlesIteratorTest {

    private BottlesIterator bottlesIterator = new BottlesIterator();

    @Test
    void noBottlesTest() throws Exception {
        String actualPoem = bottlesIterator.getBottles(10, 9);
    }
}
