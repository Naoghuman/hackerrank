/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.naoghuman.hackerrank.java;

import static org.junit.Assert.*;

import java.text.NumberFormat;
import java.util.Locale;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JavaCurrencyFormatterTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
    /*
     * https://www.hackerrank.com/challenges/java-currency-formatter/problem
     *
     * Input Format
     * A single double-precision number denoting 'payment'.
     *
     * Output Format
     * On the first line, print US: u where u is 'payment' formatted for US currency.
     * On the second line, print India: i where i is 'payment' formatted for Indian currency.
     * On the third line, print China: c where c is 'payment' formatted for Chinese currency.
     * On the fourth line, print France: f, where f is 'payment' formatted for French currency.
     *
     * Constraints
     *  - 0 <= payment <= 10^9
     *  
     * Sample Input
     *  - 12324.134
     *
     * Sample Output
     * US: $12,324.13
     * India: Rs.12,324.13
     * China: ￥12,324.13
     * France: 12 324,13 €
     */
    
    public static String format(double payment, String prefix, Locale locale) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        return prefix + nf.format(payment);
    }


    @Test
    public void test01() {
        double payment = 12324.134d;
        String prefix  = "US: ";
        
        String u = format(payment, prefix, Locale.US);
        
        assertEquals("US: $12,324.13", u);
    }
    
    @Test
    public void test02() {
        double payment = 12324.134d;
        String prefix  = "India: ";
        Locale india   = new Locale("en", "IN");
        
        String i = format(payment, prefix, india);
        
        assertEquals("India: Rs.12,324.13", i);
    }
    
    @Test
    public void test03() {
        double payment = 12324.134d;
        String prefix  = "China: ";
        
        String c = format(payment, prefix, Locale.CHINA);
        
        assertEquals("China: ￥12,324.13", c);
    }
    
    @Test
    public void test04() {
        double payment = 12324.134d;
        String prefix  = "France: ";
        
        String f = format(payment, prefix, Locale.FRANCE);
        
        assertEquals("France: 12 324,13 €", f);
    }
}
