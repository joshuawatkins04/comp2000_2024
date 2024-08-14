import java.awt.*;
import javax.swing.*;

public class Main extends JFrame {
    class Canvas extends JPanel {

        // For assignment part 2, use a queue or could use array of size 100
        
        Stage stage;

        public Canvas() {
            setPreferredSize(new Dimension(720, 720));
            stage = new Stage();
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