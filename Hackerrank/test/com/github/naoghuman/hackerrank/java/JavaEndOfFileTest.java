/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.naoghuman.hackerrank.java;

import java.util.Scanner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PRo
 */
public class JavaEndOfFileTest {
    
    public JavaEndOfFileTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    /*
    https://www.hackerrank.com/challenges/java-end-of-file/problem
    
    Input Format
    Read some unknown lines of input from stdin(System.in) until you reach EOF;
    each line of input contains a non-empty String.

    Output Format
    For each line, print the line number, followed by a single space, and then 
    the line content received as input.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int i = 1;
        while(scanner.hasNext()) {
            System.out.println(i + " " + scanner.nextLine());
            ++i;
        }
        
        scanner.close();
    }
    
}
