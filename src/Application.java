import javax.swing.*;
import java.awt.*;

public class Application {

    public static void main(String[] args) throws InterruptedException {


        Assets.initialize();

        JFrame window = new JFrame("Infinite Runner Map Generator");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(new Dimension(400,400));
        window.setVisible(true);
        window.setResizable(false);



        /*
        MapGenerator mapGenerator = new MapGenerator(10, 3, 3);
        mapGenerator.initialize();
        */




    }
}
