public class Map {
    private int dimension;
    private int map[][];

    Map(int dimension) {
        this.dimension = dimension;
        this.map = new int[dimension][dimension];

    }


    public int getAtPos(int row, int column) {
        return map[row][column];
    }

    public void setValueAtPosition(int row, int column, int value) {
        this.map[row][column] = value;
    }


    public void print() {

        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println("");
        }


    }


}
