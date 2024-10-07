/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fractionpackage;

/**
 *
 * @author Rextine
 */
import java.util.*;
public class FractionPackage {
    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction();
        Scanner sc = new Scanner(System.in);
        int choice;
        
        f1.inputFraction();
        f2.inputFraction();
        do{
            //Menu
            System.out.println("1 - Add");
            System.out.println("2 - Subtract");
            System.out.println("3 - Multiply");
            System.out.println("4 - Divide");
            System.out.println("5 - Input another set of fraction");
            System.out.println("0 - Exit");
            
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            switch(choice){ 
                case 1: 
                    f1.add(f2);
                    System.out.println("(" +f1.getNumerator()+ "/" +f1.getDenom()+ ")" +"+"+ "(" +f2.getNumerator()+ "/" +f2.getDenom()+ ")");
                    Fraction add = f1.add(f2);
                    add.displayFractiontion();
                    add.reciprocal();
                    break;
                case 2:
                    f1.subtract(f2);
                    System.out.println("(" +f1.getNumerator()+ "/" +f1.getDenom()+ ")" +"-"+ "(" +f2.getNumerator()+ "/" +f2.getDenom()+ ")");
                    Fraction sub = f1.subtract(f2);
                    sub.displayFractiontion();
                    sub.reciprocal();
                    break;
                case 3:
                    f1.multiply(f2);
                    System.out.println("(" +f1.getNumerator()+ "/" +f1.getDenom()+ ")" +"*"+ "(" +f2.getNumerator()+ "/" +f2.getDenom()+ ")");
                    Fraction mult = f1.multiply(f2);
                    mult.displayFractiontion();
                    mult.reciprocal();
                    break;
                case 4:
                    f1.divide(f2);
                    System.out.println("(" +f1.getNumerator()+ "/" +f1.getDenom()+ ")" +"/"+ "(" +f2.getNumerator()+ "/" +f2.getDenom()+ ")");
                    Fraction div = f1.divide(f2);
                    div.displayFractiontion();
                    div.reciprocal();
                    break;
                case 5:
                    f1.inputFraction();
                    f2.inputFraction();
                    System.out.println("First Fracion: " +f1.getNumerator()+ "/" +f1.getDenom());
                    System.out.println("Second Fracion: " +f2.getNumerator()+ "/" +f2.getDenom());
                    continue;
                case 0:
                    System.exit(0); 
                default:
                    System.out.println("Invalid choice");
                 }
        }while(choice!=0);
    }
}

