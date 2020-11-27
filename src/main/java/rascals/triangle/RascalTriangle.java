package rascals.triangle;

public class RascalTriangle {

    public int calcRascalTriangleValue(int row, int index) {
        if (index == 0 || index == row + 1 || row == 0) {
            return 1;
        } else if (index == 1 || index == row) {
            return row;
        }else{
            if (index > row / 2) {
                index = row - index;
            }
            int val = row;
            int additive = row - 3;
            for (int i = 2; i <= index; i++) {
                val += additive;
                additive -= 2;
            }
            return val;
        }
    }

}
