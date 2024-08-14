import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame {
    class Canvas extends JPanel {

        Stage stage;

        public Canvas() {
            setPreferredSize(new Dimension(720, 720));

            Grid grid = new Grid();

            ArrayList<Actor> actors = new ArrayList<>();
            actors.add(new Cat(new Cell(50, 200)));
            actors.add(new Dog(new Cell(200, 200)));
            actors.add(new Bird(new Cell(400, 200)));

            stage = new Stage(grid, actors);
        }
        
        @Override
        public void paint(Graphics g) {
            stage.paint(g, getMousePosition());
        }
    }

    public static void main(String[] args) throws Exception {
        Main window = new Main();
        window.run();
    }

    private Main() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new Canvas();
        this.setContentPane(canvas);
        this.pack();
        this.setVisible(true);
    }

    public void run() {
        while (true) { 
            repaint();
        }
    }
}