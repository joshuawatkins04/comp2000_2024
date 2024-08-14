import java.awt.*;
import java.util.*;

class Stage {
    Grid grid;
    ArrayList<Actor> actors;

    public Stage(Grid grid, ArrayList<Actor> actors) {
        this.grid = grid;
        this.actors = actors;
    }

    public void paint(Graphics g, Point mousePos) {
        grid.paint(g, mousePos);

        for (Actor a: actors) {
            a.paint(g);
        }
    }
}