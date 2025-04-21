package runner;

import com.example.external.Triangle;
import com.example.external.Rectangle;
import com.example.internal.Polygon;

public class PolygonRunner {
    public static void main(String[] args) {
        Polygon polygon1 = new Triangle();
        Polygon polygon2 = new Rectangle();

        System.out.println("=== Triangle ===");
        polygon1.define();
        polygon1.calculateArea();
        polygon1.calculatePerimeter();
        polygon1.draw();
        polygon1.properties();

        System.out.println("\n=== Rectangle ===");
        polygon2.define();
        polygon2.calculateArea();
        polygon2.calculatePerimeter();
        polygon2.draw();
        polygon2.properties();
    }
}
