import java.awt.Color;
import java.awt.Polygon;

class Bird extends Actor {
    
    Bird(Cell cell) {
        super(cell, Color.GREEN);

        Polygon wing1 = new Polygon();
        wing1.addPoint(location.x + 5, location.y + 5);
        wing1.addPoint(location.x + 15, location.y + 17);
        wing1.addPoint(location.x + 5, location.y + 17);
        Polygon wing2 = new Polygon();
        wing2.addPoint(location.x + 30, location.y + 5);
        wing2.addPoint(location.x + 20, location.y + 17);
        wing2.addPoint(location.x + 30, location.y + 17);
        Polygon body = new Polygon();
        body.addPoint(location.x + 15, location.y + 10);
        body.addPoint(location.x + 20, location.y + 10);
        body.addPoint(location.x + 20, location.y + 25);
        body.addPoint(location.x + 15, location.y + 25);
    
        polygons.add(wing1);
        polygons.add(wing2);
        polygons.add(body);
    }
}