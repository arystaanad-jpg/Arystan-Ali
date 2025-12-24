import models.Point;
import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/source.txt"); 
        Scanner sc = new Scanner(file);
        sc.useDelimiter(",|\\s+"); 
        
        Shape shape = new Shape();

        while (sc.hasNextDouble()) {
            double x = sc.nextDouble();
            if (sc.hasNextDouble()) {
                double y = sc.nextDouble();
                Point point = new Point(x, y);
                shape.addPoint(point);
            }
        }
        System.out.println("Perimeter: " + shape.calculatePerimeter());
        System.out.println("Average Side: " + shape.getAverageSide());
        System.out.println("Longest Side: " + shape.getLongestSide());
    }
}