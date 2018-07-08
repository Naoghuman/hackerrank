/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.naoghuman.hackerrank.daysofcode;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PRo
 */
public class Day01DataTypesTest {
    
    public Day01DataTypesTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    /*
    https://www.hackerrank.com/challenges/30-data-types/problem
    */
    
    public static void printSolution(int i2, double d2, String s2) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        
        plus(i, i2);
        plus(d, d2);
        concatenate(s, s2);
    }

    private static void plus(int i, int i2) {
        int sum = i + i2;
        System.out.println(sum);
    }

    private static void plus(double d, double d2) {
        double sum = d + d2;
        System.out.println(sum);
    }

    private static void concatenate(String s, String s2) {
        String concatenate = s + s2;
        System.out.println(concatenate);
    }
    
    @Test
    public void test01() {
        int i2 = 8;
        double d2 = 4.0d;
        String s2 = "is the best place to learn and practice coding!";
        
        printSolution(i2, d2, s2);
    }
    
}
