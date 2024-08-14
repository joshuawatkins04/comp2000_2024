import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;

class Cell extends Rectangle {
    
    static int SIZE = 35;
    
    Cell(int x, int y) {
        super(x, y, SIZE, SIZE);
    }

    void paint(Graphics g, Point mousePos) {
        if (contains(mousePos)) {
            g.setColor(Color.GRAY);
        } else {
            g.setColor(Color.WHITE);
        }
        g.drawRect(x, y, SIZE, SIZE);
        g.setColor(Color.BLACK);
        g.drawRect(x, y, SIZE, SIZE);
    }

    @Override
    public boolean contains(Point p) {
        if (p != null) {
            return super.contains(p);
        } else {
            return false;
        }
    }
}