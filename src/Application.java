

public class Application {

    public static void main(String[] args) {

        MapDisplay mapDisplay = new MapDisplay("Infinite Runner Map Generator", 500, 500);
        MapGenerator generator = new MapGenerator(10, 3, 5);

        InfiniteRunner infiniteRunner = new InfiniteRunner(mapDisplay, generator);
        infiniteRunner.start();


    }
}
