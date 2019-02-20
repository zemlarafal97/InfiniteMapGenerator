import javax.swing.*;
import java.awt.*;

public class Application {

    public static void main(String[] args) {



        InfiniteRunnerMapGenerator infiniteRunnerMapGenerator = new InfiniteRunnerMapGenerator(500,500,"Infinite Runner Map Generator");
        infiniteRunnerMapGenerator.start();





        JFrame window = new JFrame("Infinite Runner Map Generator");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(new Dimension(400,400));
        window.setVisible(true);
        window.setResizable(false);




        MapGenerator mapGenerator = new MapGenerator(10, 2, 4);
        mapGenerator.initialize();





    }
}
