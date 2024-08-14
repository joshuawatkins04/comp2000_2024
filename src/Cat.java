import java.awt.Color;
import java.awt.Polygon;

class Cat extends Actor {

    Cat(Cell cell) {
        super(cell, Color.BLUE);

        Polygon ear1 = new Polygon();
        ear1.addPoint(location.x + 11, location.y + 5);
        ear1.addPoint(location.x + 15, location.y + 15);
        ear1.addPoint(location.x + 7, location.y + 15);
        Polygon ear2 = new Polygon();
        ear2.addPoint(location.x + 22, location.y + 5);
        ear2.addPoint(location.x + 26, location.y + 15);
        ear2.addPoint(location.x + 18, location.y + 15);
        Polygon face = new Polygon();
        face.addPoint(location.x + 5, location.y + 15);
        face.addPoint(location.x + 29, location.y + 15);
        face.addPoint(location.x + 17, location.y + 30);
    
        polygons.add(ear1);
        polygons.add(ear2);
        polygons.add(face);
    }
}