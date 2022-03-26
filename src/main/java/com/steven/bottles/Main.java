package com.steven.bottles;

import com.steven.bottles.utils.BottlesIterator;

public class Main {

    private static BottlesIterator bottlesIterator = new BottlesIterator();

    public static void main(String[] args) throws Exception {
        System.out.println(bottlesIterator.getBottles(9,0));
    }
}
