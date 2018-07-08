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
public class JavaStaticInitializerBlockTest {
    
    static boolean flag = true;
    static int B = 0;
    static int H = 0;
    
    static {
        Scanner sc = new Scanner(System.in);
        
        B = sc.nextInt();
        H = sc.nextInt();
        
        sc.close();
        
        if (B <= 0 || H <= 0) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
    
    public JavaStaticInitializerBlockTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    /*
    https://www.hackerrank.com/challenges/java-static-initializer-block/problem
    */
    
    public static void main(String[] args) {
        if (flag){
            int area = B * H;
            System.out.println(area);
        }
    }
    
}
