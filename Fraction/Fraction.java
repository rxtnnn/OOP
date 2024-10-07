/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fractionpackage;

/**
 *
 * @author Rextine
 */
import java.util.*;
public class Fraction {
    Scanner input = new Scanner(System.in);
    public int numerator;
    public int denom;

    public Fraction() {
    }

    
    public Fraction(int numerator, int denom) {
        this.numerator = numerator;
        this.denom = denom;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenom() {
        return denom;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenom(int denom) {
        this.denom = denom;
    }

    public Fraction add(Fraction f2){ 
        int resNum, resDenom;
        if(this.denom != f2.denom){
            resNum = (this.numerator * f2.denom) + (f2.numerator * this.denom);
            resDenom = this.denom * f2.denom;
        }else{
            resNum =  this.numerator + f2.numerator;
            resDenom = this.denom;
        }
        return new Fraction(resNum, resDenom);
    }
    
    public Fraction subtract(Fraction f2){
        int resNum, resDenom;
        if(this.denom != f2.denom){
            resNum = (this.numerator * f2.denom) - (f2.numerator * this.denom);
            resDenom = this.denom * f2.denom;
        }else{
            resNum =  this.numerator - f2.numerator;
            resDenom = this.denom;
        }
        return new Fraction(resNum, resDenom);
    }
    
    public Fraction multiply(Fraction f2){
        int resNum, resDenom;
        resNum = this.numerator * f2.numerator;
        resDenom = this.denom * f2.denom;
        
        return new Fraction(resNum, resDenom);
    }
    
    public Fraction divide(Fraction f2){
        int resNum, resDenom;
        resNum = this.numerator * f2.denom;
        resDenom = this.denom * f2.numerator;
        
        return new Fraction(resNum, resDenom);
    } 
    
    public void inputFraction() {
        System.out.print("Numerator: ");
        numerator = input.nextInt();
        System.out.print("Denominator: ");
        denom = input.nextInt();
    }
   
    public boolean isAProperFraction(){
        return this.numerator < this.denom;
        
    }
    public boolean isAnImproperFraction(){
        return this.numerator > this.denom;
    }
    
    public void reciprocal(){
        System.out.println("Reciprocal: " +denom+ "/" +numerator);
    }
    
     public void displayFractiontion(){
        System.out.println("Result: " +this.numerator+ "/" +this.denom);
        if(isAProperFraction())
            System.out.println("Proper fraction");
        
        if(isAnImproperFraction())
            System.out.println("Improper fraction");
    }
    
}
