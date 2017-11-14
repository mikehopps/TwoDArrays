import javax.swing.*;
import java.awt.*;

/**
 * Created by michael_hopps on 11/14/17.
 */
public class GridGraphics extends JPanel{




    public GridGraphics(int w, int h){
        setSize(w, h);

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Grid Graphics");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        int width = 800;
        int height = 800;
        frame.setPreferredSize(new Dimension(width, height + 24));


        JPanel panel = new GridGraphics(width, height);
        panel.setFocusable(true);
        panel.grabFocus();

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
