package poo;
import java.lang.Math;

public class Retangle {

    public double width;
    public double height;

    public double calcArea(double width, double height) {
        double area = width * height;
        return area;
    }

    public double calcPerimeter(double width, double height) {
        double perimeter = (width * 2) + (height * 2);
        return perimeter;
    }

    public double calcDiagonal(double width, double height) {
        double diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
        return diagonal;
    }

}