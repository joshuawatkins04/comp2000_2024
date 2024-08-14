import java.awt.*;

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
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                if (cells[i][j].contains(mousePos)) {
                    cells[i][j].paint(g, mousePos);
                }
            }
        }
    }

}