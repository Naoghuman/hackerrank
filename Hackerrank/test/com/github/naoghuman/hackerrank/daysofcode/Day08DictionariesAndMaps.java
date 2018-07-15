/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.naoghuman.hackerrank.daysofcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
public class Day08DictionariesAndMaps {
    
    public Day08DictionariesAndMaps() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    /*
    https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem
    */
    
    private static String getPhoneData(String key, Map<String, Integer> phones) {
        if (!phones.containsKey(key)) {
            return "Not found";
        }
        
        return key + "=" + phones.get(key);
    }
    
    @Test
    public void test01() {
        Map<String, Integer> phones = new HashMap();
        phones.put("sam", 99912222);
        phones.put("tom", 11122222);
        phones.put("harry", 12299933);
        
        String phoneData = getPhoneData("sam", phones);
        assertEquals("sam=99912222", phoneData);
    }
    
    @Test
    public void test02() {
        Map<String, Integer> phones = new HashMap();
        phones.put("sam", 99912222);
        phones.put("tom", 11122222);
        phones.put("harry", 12299933);
        
        String phoneData = getPhoneData("edward", phones);
        assertEquals("Not found", phoneData);
    }
    
    @Test
    public void test03() {
        Map<String, Integer> phones = new HashMap();
        phones.put("sam", 99912222);
        phones.put("tom", 11122222);
        phones.put("harry", 12299933);
        
        String phoneData = getPhoneData("harry", phones);
        assertEquals("harry=12299933", phoneData);
    }
    
}
