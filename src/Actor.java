import java.awt.*;

class Actor {
    Cell location;
    Color color;
    
    public Actor(Cell location, Color color) {
        this.location = location;
        this.color = color;
    }

    public void paint(Graphics g) {
        g.setColor(this.color);
        g.fillOval(location.x, location.y, 35, 35);
    }
}