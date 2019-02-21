import enums.OptionType;

public class Application {

    public static void main(String[] args) {

        MapDisplay mapDisplay = new MapDisplay("Infinite Runner Map Generator", 15);

        Options options = new Options();
        options.add(new SingleOption(OptionType.RIVER,0.15));

        MapGenerator generator = new MapGenerator(15, 5, 5,options);

        InfiniteRunner infiniteRunner = new InfiniteRunner(mapDisplay, generator);
        try {
            infiniteRunner.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
