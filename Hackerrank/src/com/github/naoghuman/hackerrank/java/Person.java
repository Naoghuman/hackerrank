/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.naoghuman.hackerrank.java;

/**
 * https://www.hackerrank.com/challenges/30-class-vs-instance/problem
 *
 * @author PRo
 */
public class Person {
    
    private int age;
    
    public Person(int initialAge) {
        if (initialAge < 0) {
            initialAge = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
        
        age = initialAge;
    }
    
    public void yearPasses() {
        age += 1;
    }
    
    public void amIOld() {
        if (age < 13) {
            System.out.println("You are young.");
        }
        else if (age >= 13 && age < 18) {
            System.out.println("You are a teenager.");
        }
        else {
            System.out.println("You are old.");
        }
    }
    
}
