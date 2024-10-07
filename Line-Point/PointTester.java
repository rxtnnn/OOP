/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity2Package;

/**
 *
 * @author Rextine
 */
public class PointTester {
    public static void main(String args[]){
        Point p1 = new Point(2,8);
        Point p2 = new Point(1,6);
        Line line1 = new Line(p1, p2);
        
        System.out.println("Point A: " + p1);
        System.out.println("Point B: " + p2);
        System.out.println("Length: " + line1.getLength());
        System.out.println("Slope: " + line1.getSlope());
        
        Point p3 = new Point(3, 5);
        Point p4 = new Point(7, 10);
        Line line2 = new Line(p3, p4);
        
        System.out.println("Point A: " + p3);
        System.out.println("Point B: " + p4);
        System.out.println("Length: " + line2.getLength());
        System.out.println("Slope: " + line2.getSlope());
        
        System.out.println("Is Line 1 longer than Line 2? " + line1.longerLine(line2));
    }
}
