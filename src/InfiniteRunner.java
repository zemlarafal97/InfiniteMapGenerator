import java.awt.*;
import java.awt.image.BufferStrategy;

class InfiniteRunner {
    private MapDisplay display;
    private MapGenerator generator;
    BufferStrategy bufferStrategy;
    Graphics graphics;


    public InfiniteRunner(MapDisplay display, MapGenerator generator) {
        Assets.initialize();
        this.display = display;
        this.generator = generator;

    }

    public void start() {
        generator.initializeMap();
        generator.getMap().print();

        display.getCanvas().createBufferStrategy(3);
        boolean running = true;

        while (running) {
            bufferStrategy = display.getCanvas().getBufferStrategy();
            graphics = bufferStrategy.getDrawGraphics();
            graphics.clearRect(0, 0, display.getWidth(),display.getHeight());

            //graphics.setColor(Color.GREEN);
            //graphics.drawString("This is some text placed in the top left corner.", 5, 15);

            graphics.drawImage(Assets.grass,0,0,null);


            bufferStrategy.show();
            graphics.dispose();
        }


    }


}
