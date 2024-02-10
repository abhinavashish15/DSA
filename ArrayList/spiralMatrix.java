import java.util.ArrayList;
import java.util.List;

public class spiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;
        ArrayList<Integer> list = new ArrayList<>();
        while (startRow <= endRow && startCol <= endCol) {
            for (int i = startCol; i <= endCol; i++) {
                list.add(matrix[startRow][i]);
            }
            for (int j = startRow + 1; j <= endRow; j++) {
                list.add(matrix[j][endCol]);
            }
            for (int i = endCol - 1; i >= startCol; i--) {
                list.add(matrix[endRow][i]);
            }
            for (int j = endRow - 1; j >= startRow + 1; j--) {
                list.add(matrix[j][startCol]);
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        return list;
    }

    public static void main(String[] args) {

        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        spiralMatrix spiral = new spiralMatrix();
        List<Integer> result = spiral.spiralOrder(matrix);
        System.out.println(result);

    }
}
