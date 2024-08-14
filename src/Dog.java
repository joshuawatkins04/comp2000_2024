import java.awt.Color;
import java.awt.Polygon;

class Dog extends Actor{
    
    Dog(Cell cell) {
        super(cell, Color.YELLOW);

        Polygon ear1 = new Polygon();
        ear1.addPoint(location.x + 5, location.y + 5);
        ear1.addPoint(location.x + 15, location.y + 5);
        ear1.addPoint(location.x + 5, location.y + 15);
        Polygon ear2 = new Polygon();
        ear2.addPoint(location.x + 20, location.y + 5);
        ear2.addPoint(location.x + 30, location.y + 5);
        ear2.addPoint(location.x + 30, location.y + 15);
        Polygon face = new Polygon();
        face.addPoint(location.x + 8, location.y + 7);
        face.addPoint(location.x + 27, location.y + 7);
        face.addPoint(location.x + 27, location.y + 25);
        face.addPoint(location.x + 8, location.y + 25);
    
        polygons.add(ear1);
        polygons.add(ear2);
        polygons.add(face);
    }
}