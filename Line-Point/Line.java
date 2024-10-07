/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity2Package;

/**
 *
 * @author Rextine
 */
public class Line extends Point{
    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public Line(double x1, double y1, double x2, double y2){
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
    }
    
    public double getLength(){
        double dx = p2.getX() - p1.getX();
        double dy = p2.getY() - p1.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
    
    public double getSlope(){
    return (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
  }

  public boolean longerLine(Line line2){
    return this.getLength() > line2.getLength();
  }  
}
