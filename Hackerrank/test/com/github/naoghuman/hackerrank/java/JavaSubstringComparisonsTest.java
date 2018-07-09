/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.naoghuman.hackerrank.java;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JavaSubstringComparisonsTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
    /*
     * https://www.hackerrank.com/challenges/java-string-compare/problem
     *
     * Input Format
     *  - The first line contains a string denoting 's'.
     *  - The second line contains an integer denoting 'k'.
     *  
     * Constraints
     *  - 1 <= |s| <= 1000
     *  - 's' consists of English alphabetic letters only ([a-zA-Z])
     *
     * Output Format
     * Return the respective lexicographically smallest and largest substrings as a single newline-separated string.
     */
//    public static String getSmallestAndLargest(String s, int k) {
//        String[] strings = new String[s.length() - k + 1];
//        
//        List<String> substrings = new ArrayList<>();
//        for (int i = 0; i <= s.length() - k; ++i) {
////            System.out.println("i:"+i+", i+k:"+(i+k));
////            System.out.println("  " + i + ": s("+i+"-"+(i+k)+"): " + s.substring(i, i + k));
//            substrings.add(s.substring(i, i + k));
//            strings[i] = s.substring(i, i + k);
//        }
//        
//        
//        Collections.sort(substrings);
//        System.out.println(" - [" + String.join(", ", substrings) + "]");
//        System.out.println(" - [" + String.join(", ", strings) + "]");
//        
//        String smallest = substrings.get(0);
//        String largest  = substrings.get(substrings.size() - 1);
//        
//        return smallest + "\n" + largest;
//    }
    
    // Can't change the import statements in hackerrank.com...
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest  = "";
        for (int i = 0; i <= s.length() - k; ++i) {
            String substr = s.substring(i,  i + k);
            if (substr.compareTo(smallest) < 0 || smallest.isEmpty()) {
                smallest = substr;
            }
            if (substr.compareTo(largest) > 0 || largest.isEmpty()) {
                largest = substr;
            }
        }
        
        return smallest + "\n" + largest;
    }

    @Test
    public void test01() {
        String s = "welcometojava";
        int    k = 3;
        
        String result = getSmallestAndLargest(s, k);
        assertEquals("ava\nwel", result);
    }

}