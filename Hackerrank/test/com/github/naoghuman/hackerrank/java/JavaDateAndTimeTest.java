/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.naoghuman.hackerrank.java;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JavaDateAndTimeTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
    /*
     * https://www.hackerrank.com/challenges/java-date-and-time/problem
     *
     * You are given a date. You just need to write the method, 'getDay', which returns the day on that date.
     * For example, if you are given the date 'August 14th 2017', the method should return 'MONDAY' as the day on that date.
     *
     * Input Format
     * A single line of input containing the space separated month, day and year, respectively, in 'MM DD YYYY' format.
     *
     * Constraints
     *  - 2000 < year < 3000
     *
     * Output Format
     * Output the correct day in capital letters.
     *
     * Sample Input
     * 08 05 2015
     *
     * Sample Output
     * WEDNESDAY
     */
    
    public static String getDay(String day, String month, String year) {
        
        String dayOfWeek = "";
        try {
            SimpleDateFormat dateFormatter = new SimpleDateFormat("MM dd yyyy");
            Date date = dateFormatter.parse(month + " " + day + " " + year);
            
            SimpleDateFormat dayOfWeekFormatter = new SimpleDateFormat("EEEE", Locale.ENGLISH);
            dayOfWeek = dayOfWeekFormatter.format(date).toUpperCase();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        return dayOfWeek;
    }
    
    @Test
    public void test01() {
        String day   = "11";
        String month = "07";
        String year  = "2018";
        
        String result = getDay(day, month, year);
        assertEquals("WEDNESDAY", result);
    }

}
