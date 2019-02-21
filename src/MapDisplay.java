import javax.swing.*;
import java.awt.*;

public class MapDisplay {
    private JFrame frame;
    private Canvas canvas;
    private String title;
    private int width;
    private int height;


    public MapDisplay(String title,int dimension) {
        this.title = title;
        this.width = 50*dimension;
        this.height = 50*dimension;
        createDisplay();
    }

    void createDisplay() {
        frame = new JFrame(title);
        frame.setSize(width,height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(width,height));
        canvas.setMaximumSize(new Dimension(width,height));
        canvas.setMinimumSize(new Dimension(width,height));
        canvas.setFocusable(false);

        frame.add(canvas);
        frame.pack();
    }

    public Canvas getCanvas() {
        return canvas;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public JFrame getFrame() {
        return frame;
    }

}


