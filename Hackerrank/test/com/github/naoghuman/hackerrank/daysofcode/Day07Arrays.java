/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.naoghuman.hackerrank.daysofcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PRo
 */
public class Day07Arrays {
    
    public Day07Arrays() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    /*
    https://www.hackerrank.com/challenges/30-arrays/problem
    */
    
    @Test
    public void test01() {
        int[] arr = {1, 3, 2, 5};
        
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        
        Collections.reverse(list);
        
        assertEquals(new Integer(5), list.get(0));
        assertEquals(new Integer(2), list.get(1));
        assertEquals(new Integer(3), list.get(2));
        assertEquals(new Integer(1), list.get(3));
    }
    
    @Test
    public void test02() {
        String[] arr = {"1", "3", "2", "5"};
        
        List<String> list = Arrays.asList(arr);
        
        Collections.reverse(list);
        
        assertEquals("5", list.get(0));
        assertEquals("2", list.get(1));
        assertEquals("3", list.get(2));
        assertEquals("1", list.get(3));
        
        String merge = list.stream().
                map(Object::toString).
                collect(Collectors.joining(" "));
        
        assertEquals("5 2 3 1", merge);
    }
    
}
