import java.util.Random;

public class MapGenerator {
    private int dimension;
    private Map map;
    private int pathMinWidth;
    private int pathMaxWidth;

    public MapGenerator(int dimension,int pathMinWidth, int pathMaxWidth) {
        this.dimension = dimension;
        this.pathMinWidth = pathMinWidth;
        this.pathMaxWidth = pathMaxWidth;
        map = new Map(dimension);
    }


    void initialize() {
        Random generator = new Random();
        int rand = 0;
        int tmpPathWidth;
        int upIndex = -1;
        int bottomIndex = -1;


        //Set first map column
        rand = generator.nextInt(dimension);    //Get random value in range 0 to dimension
        System.out.println(rand);
        tmpPathWidth = generator.nextInt(pathMaxWidth-pathMinWidth+1)+pathMinWidth;
        map.setValueAtPosition(rand,0,1);
        upIndex = rand - 1;
        bottomIndex = rand + 1;
        tmpPathWidth--;

        while(tmpPathWidth > 0) {
            rand = generator.nextInt(2);

            if(rand == 0) {     //Add at upIndex
                if(upIndex >=0 ) {
                    map.setValueAtPosition(upIndex,0,1);
                    upIndex--;
                } else {
                    map.setValueAtPosition(bottomIndex,0,1);
                    bottomIndex++;
                }

            } else if(rand == 1) {            //Add at bottomIndex
                if(bottomIndex < dimension) {
                    map.setValueAtPosition(bottomIndex,0,1);
                    bottomIndex++;
                } else {
                    map.setValueAtPosition(upIndex,0,1);
                    upIndex--;
                }

            }

            tmpPathWidth--;
        }


        //Set other map columns
        for(int column=1; column<dimension; column++) {
            tmpPathWidth = generator.nextInt(pathMaxWidth-pathMinWidth+1)+pathMinWidth;

            //na podstawie upIndex i bottomIndex losuje wartosc z kolumny poprzedniej
            rand = generator.nextInt(bottomIndex - upIndex - 2 + 1) + (upIndex + 1);

            map.setValueAtPosition(rand,column,1);
            upIndex = rand - 1;
            bottomIndex = rand + 1;
            tmpPathWidth--;

            while(tmpPathWidth > 0) {
                rand = generator.nextInt(2);

                if(rand == 0) {     //Add at upIndex
                    if(upIndex >=0 ) {
                        map.setValueAtPosition(upIndex,column,1);
                        upIndex--;
                    } else {
                        map.setValueAtPosition(bottomIndex,column,1);
                        bottomIndex++;
                    }

                } else if(rand == 1) {            //Add at bottomIndex
                    if(bottomIndex < dimension) {
                        map.setValueAtPosition(bottomIndex,column,1);
                        bottomIndex++;
                    } else {
                        map.setValueAtPosition(upIndex,column,1);
                        upIndex--;
                    }

                }

                tmpPathWidth--;
            }


        }

        map.print();

    }







}
