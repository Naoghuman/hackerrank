/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.naoghuman.hackerrank.java;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PRo
 */
public class JavaDatatypesTest {
    
    public JavaDatatypesTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    /*
    https://www.hackerrank.com/challenges/java-datatypes/problem
    
    Java has 8 primitive data types; char, boolean, byte, short, int, long, float, 
    and double. For this exercise, we'll work with the primitives used to hold 
    integer values (byte, short, int, and long):
     - A byte is an  8-bit signed integer.
     - A short is a 16-bit signed integer.
     - An int is a  32-bit signed integer.
     - A long is a  64-bit signed integer.

    Given an input integer, you must determine which primitive data types are 
    capable of properly storing that input.
    To get you started, a portion of the solution is provided for you in the editor.
    Reference: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
    
    Input Format
     - The first line contains an integer, 'T', denoting the number of test cases.
     - Each test case, 'T', is comprised of a single line with an integer, 'n', 
       which can be arbitrarily large or small.
    
    Output Format
     - For each input variable 'n' and appropriate primitive 'dataType', you must 
       determine if the given primitives are capable of storing it. If yes, then print: 
         n can be fitted in:
         * dataType
    
    If there is more than one appropriate data type, print each one on its own line 
    and order them by size (i.e.: 'byte < short < int < long').

    If the number cannot be stored in one of the four aforementioned primitives, 
    print the line:
         n can't be fitted anywhere.
    */
    
    public static void printSolution(String s) {
        List<String> list = compute(s);
        list.stream().forEach(line -> System.out.println(line));
    }
    
    private static List<String> compute(String s) {
        List<String> list = new ArrayList();
        
        try {
            long x = Long.parseLong(s);
            list.add(String.format("%d can be fitted in:", x));
            
            if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) {
                list.add("* byte");
            }
            if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
                list.add("* short");
            }
            if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
                list.add("* int");
            }
            if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) {
                list.add("* long");
            }
        } catch (NumberFormatException e) {
            list.add(String.format("%s can't be fitted anywhere.", s));
        }
        
        return list;
    }
    
    @Test
    public void test01() {
        String s = "-150";
        List<String> list = compute(s);
        
        assertEquals(4, list.size());
        assertEquals("-150 can be fitted in:", list.get(0));
        assertEquals("* short", list.get(1));
        assertEquals("* int", list.get(2));
        assertEquals("* long", list.get(3));
    }
    
    @Test
    public void test02() {
        String s = "213333333333333333333333333333333333";
        List<String> list = compute(s);
        
        assertEquals(1, list.size());
        assertEquals("213333333333333333333333333333333333 can't be fitted anywhere.", list.get(0));
    }
    
}
