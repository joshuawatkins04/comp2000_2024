import java.awt.*;

class Stage {
    Grid grid;
    Cell cell1, cell2, cell3;
    Cat cat;
    Dog dog;
    Bird bird;

    public Stage() {
        grid = new Grid();
        cell1 = new Cell(5, 5);
        cell2 = new Cell(100, 100);
        cell3 = new Cell(300, 300);
        cat = new Cat(cell1);
        dog = new Dog(cell2);
        bird = new Bird(cell3);
    }

    public void paint(Graphics g, Point mousePos) {
        grid.paint(g, mousePos);
        cat.paint(g);
        dog.paint(g);
        bird.paint(g);
    }
}