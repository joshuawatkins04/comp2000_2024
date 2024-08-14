import java.awt.*;

class Bird extends Actor {
    public Bird(Cell cell) {
        super(cell, Color.GREEN);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillOval(location.x, location.y, 35, 35);
    }
}