import java.awt.Graphics;
import java.awt.Point;

public class Grid {
    
    Cell[][] cells = new Cell[20][20];

    public Grid() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                cells[i][j] = new Cell(10 + 35 * i, j * 35);
            }
        }
    }

    public void paint(Graphics g, Point mousePos) {
        for (Cell[] cell : cells) {
            for (Cell cell1 : cell) {
                if (cell1.contains(mousePos)) {
                    cell1.paint(g, mousePos);
                }
            }
        }
    }

}