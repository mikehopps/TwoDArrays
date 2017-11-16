import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by michael_hopps on 11/14/17.
 */
public class GridGraphics extends JPanel{

    private int[][] gr;

    public GridGraphics(int w, int h){
        setSize(w, h);
        gr = new int[8][8];

        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();

                int w = getWidth()/gr[0].length;
                int h = getHeight()/gr.length;

                int r = y/h;
                int c = x/w;

                gr[r][c] = 1;
                repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;

        int w = getWidth()/gr[0].length;
        int h = getHeight()/gr.length;

        for (int r = 0; r < gr.length; r++) {
            for (int c = 0; c < gr[0].length; c++) {
                if(gr[r][c] == 0){
                    g2.drawRect(c*w, r*h, w, h);
                }else{
                    g2.fillRect(c*w, r*h, w, h);
                }
            }
        }

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
