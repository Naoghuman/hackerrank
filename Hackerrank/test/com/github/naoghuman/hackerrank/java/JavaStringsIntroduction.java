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
public class JavaStringsIntroduction {
    
    public JavaStringsIntroduction() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    /*
    https://www.hackerrank.com/challenges/java-strings-introduction/problem
    
    Output Format
    There are three lines of output:
     - For the first line, sum the lengths of A and B.
     - For the second line, write 'Yes' if A is lexicographically greater than B 
       otherwise print 'No' instead.
     - For the third line, capitalize the first letter in both A and B and print 
       them on a single line, separated by a space.
    
    Sample Input 0
     - hello
     - java
    
    Sample Output 0
     - 9
     - No
     - Hello Java
    */
    private static void printSolution(String a, String b) {
        System.out.println(count(a, b));
        System.out.println(sorted(a, b));
        System.out.println(capitalize(a) + " " + capitalize(b));
    }
    
    private static int count(String a, String b) {
        return a.length() + b.length();
    }
    
    private static String sorted(String a, String b) {
        return a.compareTo(b) >= 1 ? "Yes" : "No";
    }
    
    private static String capitalize(String s) {
        return String.valueOf(s.charAt(0)).toUpperCase() + s.substring(1);
    }
    
    @Test
    public void test01() {
        String a = "hello";
        String b = "java";
        
        int result = count(a, b);
        assertEquals(9, result);
    }
    
    @Test
    public void test02_Yes() {
        String a = "hello";
        String b = "java";
        
        String result = sorted(b, a);
        assertEquals("Yes", result);
    }
    
    @Test
    public void test02_No() {
        String a = "hello";
        String b = "java";
        
        String result = sorted(a, b);
        assertEquals("No", result);
    }
    
    @Test
    public void test03() {
        String a = "hello";
        String b = "java";
        
        String result = capitalize(a);
        assertEquals("Hello", result);
        
        result = capitalize(b);
        assertEquals("Java", result);
    }
    
}
