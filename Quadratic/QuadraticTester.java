/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quadraticpackage;

/**
 *
 * @author Rextine
 */
public class QuadraticTester {
    public static void main(String[] args) {
        Quadratic q1 = new Quadratic(4, 2, 6);
        Quadratic q2 = new Quadratic(1, 6, 9);

        System.out.println("Equation 1:");
        q1.displayQuadratic();
        
        System.out.println();
 
        System.out.println("Equation 2:");
        q2.displayQuadratic();

        q1.add(q2);
        
    }
}

