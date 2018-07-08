/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.naoghuman.hackerrank.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PRo
 */
public class JavaSubstringTest {
    
    public JavaSubstringTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    /*
    https://www.hackerrank.com/challenges/java-substring/problem
    
    Input Format
     - The first line contains a single string denoting 's'.
     - The second line contains two space-separated integers denoting the 
       respective values of 'start' and 'end'.
    
    Output Format
     - Print the substring in the inclusive range from 'start' to 'end - 1'.
    
    Constraints
     - 1 <= |s| <= 100
     - 0 <= start < end <= n
     - String 's' consists of English alphabetic letters (i.e. [a-zA-Z]) only.
    */
    
    public static void printSolution(String s, int start, int end) {
        System.out.println(subString(s, start, end));
    }
    
    private static String subString(String s, int start, int end) {
        return s.substring(start, end);
    }
    
    @Test
    public void test01() {
        String s  = "Helloworld";
        int start = 3;
        int end   = 7;
        
        String result = subString(s, start, end);
        assertEquals("lowo", result);
    }
    
}
