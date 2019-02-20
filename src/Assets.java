import java.awt.image.BufferedImage;

public class Assets {
    public static BufferedImage grass;
    public static BufferedImage soil;
    public static BufferedImage lava;
    public static BufferedImage water;

    public static void initialize() {
        grass = ImageLoader.loadImage("/grass.png");
        soil = ImageLoader.loadImage("/soil.png");
        lava = ImageLoader.loadImage("/lava.png");
        water = ImageLoader.loadImage("/water.png");
    }




}
