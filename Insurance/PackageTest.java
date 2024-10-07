/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rextine
 */
public class PackageTest {
    public static void main(String args[]){
        Package p1 = new Package(17, 'A');
        Package p2 = new Package(9, 'T');
        Package p3 = new Package(5, 'M');
        
        InsuredPackage ip1 = new InsuredPackage(17, 'A');
        InsuredPackage ip2 = new InsuredPackage(9, 'T');
        InsuredPackage ip3 = new InsuredPackage(5, 'M');
        
        
        System.out.println(p1.toString());
        System.out.println(ip1.toString());
        
        System.out.println(p2.toString());
        System.out.println(ip2.toString());
        
        System.out.println(p3.toString());
        System.out.println(ip3.toString());
        
    }
}
