/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.naoghuman.hackerrank.daysofcode;

import java.util.Scanner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PRo
 */
public class Day06LetsReview {
    
    public Day06LetsReview() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    /*
    https://www.hackerrank.com/challenges/30-review-loop/problem
    */
    
//    private static final Scanner scanner = new Scanner(System.in);
//    
//    public static void main(String[] args) {
//        int t = scanner.nextInt();
//        for (int i = 0; i < t; ++i) {
//            String str  = scanner.next();
//            String even = extractEvenCharacters(str);
//            String odd  = extractOddCharacters(str);
//            
//            System.out.println(even + " " + odd);
//        }
//        
//        scanner.close();
//    }
    
    private static String extractEvenCharacters(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); ++i) {
            if (i % 2 == 0) {
                sb.append(s.charAt(i));
            }
        }
        
        return sb.toString();
    }
    
    private static String extractOddCharacters(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); ++i) {
            if (i % 2 != 0) {
                sb.append(s.charAt(i));
            }
        }
        
        return sb.toString();
    }
    
    @Test
    public void test01() {
        String s = "hello";
        String even = extractEvenCharacters(s);
        
        assertEquals("hlo", even);
    }
    
    @Test
    public void test02() {
        String s = "hello";
        String odd = extractOddCharacters(s);
        
        assertEquals("el", odd);
    }
    
}
