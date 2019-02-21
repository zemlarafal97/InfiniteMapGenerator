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

    public void start() throws InterruptedException {
        generator.initializeMap();
        generator.getMap().print();

        while (true) {
            drawMap();
            generator.moveMapLeft();

            Thread.sleep(500);
        }


        /*
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

*/
    }

    private void drawMap() {

        for (int i = 0; i < generator.getMap().getDimension(); i++) {
            for (int j = 0; j < generator.getMap().getDimension(); j++) {
                switch (generator.getMap().getAtPos(i, j)) {
                    case 0:
                        display.getCanvas().getGraphics().drawImage(Assets.soil, j * 50, i * 50, null);
                        break;
                    case 1:
                        display.getCanvas().getGraphics().drawImage(Assets.grass, j * 50, i * 50, null);
                        break;
                    case 2:
                        display.getCanvas().getGraphics().drawImage(Assets.lava, j * 50, i * 50, null);
                        break;
                    case 3:
                        display.getCanvas().getGraphics().drawImage(Assets.water, j * 50, i * 50, null);
                        break;
                    default:
                        break;


                }


            }
        }


    }


}
