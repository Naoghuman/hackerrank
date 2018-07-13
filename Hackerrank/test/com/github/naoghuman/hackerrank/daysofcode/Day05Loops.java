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
public class Day05Loops {
    
    public Day05Loops() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    /*
    https://www.hackerrank.com/challenges/30-loops/problem
    */
    
    private static void print10times(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(String.format("%d x %d = %d", n, i, (n * i)));
        }
    }
    
    @Test
    public void test01() {
        int n = 2;
        
        print10times(n);
    }
    
}
