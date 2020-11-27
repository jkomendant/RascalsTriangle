package rascals.triangle;

public class Main {

    public static void main(String[] args) {
        InputReader inputReader = new InputReader(args[0]);
        RascalTriangle rascalTriangle = new RascalTriangle();
        int[] row = inputReader.getRow();
        int[] index = inputReader.getIndex();

        for (int i = 0; i < row.length; i++) {
            System.out.println((i + 1) + " " + rascalTriangle.calcRascalTriangleValue(row[i], index[i]));
        }
    }
}
