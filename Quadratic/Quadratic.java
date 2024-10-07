/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quadraticpackage;

/**
 *
 * @author Rextine
 */
import java.util.*;
public class Quadratic {
    Scanner sc = new Scanner(System.in);
    public int a;
    public int b;
    public int c;
    
    
    public Quadratic(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Quadratic() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    public void inputValues(){
        System.out.print("Input A: ");
        a = sc.nextInt();
        System.out.print("Input B: ");
        b = sc.nextInt();
        System.out.print("Input C: ");
        c = sc.nextInt();
        
    }
    public int evaluateInt(int x) {
        return a * x * x + b * x + c;
    }

    public int getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public boolean isImaginary() {
        return getDiscriminant() < 0;
    }
    
    public float getFirstRoot() {
        return (float)((-b + Math.sqrt(getDiscriminant())) / (2.0F * a));
    }
    
    public float getSecondRoot() {
        return (float) ((-b - Math.sqrt(getDiscriminant())) / (2.0 * a));
    }

    public boolean isPerfectSquare() {
        int discrim = getDiscriminant();
        int sqrtDiscrim = (int) Math.sqrt(Math.abs(discrim));
        
        return sqrtDiscrim * sqrtDiscrim == Math.abs(discrim);
    }

    public Quadratic add(Quadratic other) {
        Quadratic sum = new Quadratic(this.a + other.getA(), this.b + other.getB(), this.c + other.getC());
        System.out.printf("\nSum of equations: %dx^2 + %dx + %d = 0\n", sum.getA(), sum.getB(), sum.getC());
        return sum;
    }

    public void displayQuadratic() {
        System.out.printf("%dx^2 + %dx + %d = 0\n", a, b, c);
        System.out.println("Discriminant: " + getDiscriminant());
         
         if(isImaginary()){
            System.out.println("Roots are imaginary");
        }else{
            System.out.println("First Root: " + getFirstRoot());
            System.out.println("Second Root: " + getSecondRoot());
        }
        
        if(isPerfectSquare()){
            System.out.println("Perfect square");
        }else{
            System.out.println("Not a perfect square");
        }
    }
}
