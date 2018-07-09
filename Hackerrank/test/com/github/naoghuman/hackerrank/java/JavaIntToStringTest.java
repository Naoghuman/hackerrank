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
public class JavaIntToStringTest {
    
    public JavaIntToStringTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    /*
    https://www.hackerrank.com/challenges/java-int-to-string/problem
    */
    
    @Test
    public void test01() {
        int n = 5;
        String s = "" + n;
        
        String result = msg(n, s);
        assertEquals("Good job", result);
    }
    
    private String msg(int n, String s) {
        String msg = "";
        if (n == Integer.parseInt(s)) {
            System.out.println("Good job");
            msg = "Good job";
        }
        else {
            msg = "Wrong answer";
        }
        
        return msg;
    }
    
}
