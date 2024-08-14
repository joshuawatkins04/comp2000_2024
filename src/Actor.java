import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.ArrayList;
import java.util.List;

class Actor {
    
    Cell location;
    Color color;
    List<Polygon> polygons;

    Actor(Cell location, Color color) {
        this.location = location;
        this.color = color;
        polygons = new ArrayList<>();
    }

    void paint(Graphics g) {
        g.setColor(this.color);
        for (Polygon p : polygons) {
            g.fillPolygon(p);
        }
    }
}