import java.awt.*;

class Dog extends Actor{
    public Dog(Cell cell) {
        super(cell, Color.YELLOW);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillOval(location.x, location.y, 35, 35);
    }
}