public class diagonalSum {
    public int sumMatrix(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                        { 5, 6, 7, 8 },
                        { 9, 10, 11, 12 },
                        { 13, 14, 15, 16 } };
        diagonalSum mat = new diagonalSum();
        int result = mat.sumMatrix(matrix);
        System.out.println(result);
    }
}
