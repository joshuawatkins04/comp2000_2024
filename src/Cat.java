import java.awt.*;

class Cat extends Actor {
    public Cat(Cell cell) {
        super(cell, Color.BLUE);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillOval(location.x, location.y, 35, 35);
    }
}