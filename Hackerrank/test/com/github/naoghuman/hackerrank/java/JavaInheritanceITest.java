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
public class JavaInheritanceITest {
    
    public JavaInheritanceITest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    /*
    https://www.hackerrank.com/challenges/java-inheritance-1/problem
    */
    
    public static void printSolution() {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
    }
    
    @Test
    public void test01() {
        printSolution();
    }
    
}
