package rascals.triangle;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputReader {

    private int[] row;
    private int[] index;

    public InputReader(String file) {
        try {
            Scanner inputFile = new Scanner(new File(file));
            int dataSet = inputFile.nextInt();
            row = new int[dataSet];
            index = new int[dataSet];
            for (int i = 0; i < dataSet; i++) {
                inputFile.nextInt();
                row[i] = inputFile.nextInt();
                index[i] = inputFile.nextInt();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public int[] getRow() {
        return row;
    }

    public int[] getIndex() {
        return index;
    }
}
