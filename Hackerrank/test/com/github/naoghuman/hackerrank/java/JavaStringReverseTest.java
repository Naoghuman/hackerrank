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
public class JavaStringReverseTest {
    
    public JavaStringReverseTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    /*
    https://www.hackerrank.com/challenges/java-string-reverse/problem
    */
    
    private static boolean isPalindrome(String s) {
        if (s.length() == 0) {
            return false;
        }
        if (s.length() == 1) {
            return true;
        }
        
        boolean isPalindrome = true;
        for(int i = 0; i < s.length() / 2; ++i) {
            char first  = s.charAt(i);
            char second = s.charAt(s.length() - 1 - i);
            if (first != second) {
                isPalindrome = false;
                break;
            }
        }
        
        return isPalindrome;
    }
    
    @Test
    public void test01() {
        String a = "hello";
        
        boolean result = isPalindrome(a);
        assertFalse(result);
    }
    
    @Test
    public void test02() {
        String a = "madam";
        
        boolean result = isPalindrome(a);
        assertTrue(result);
    }
    
    @Test
    public void test03() {
        String a = "";
        
        boolean result = isPalindrome(a);
        assertFalse(result);
    }
    
    @Test
    public void test04() {
        String a = "a";
        
        boolean result = isPalindrome(a);
        assertTrue(result);
    }
    
}
