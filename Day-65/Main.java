public class Main {

    public static void setZeroes(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean[] row = new boolean[rows];
        boolean[] col = new boolean[cols];


        // Find zero positions
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }


        // Convert rows and columns to zero
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                if (row[i] || col[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }


    public static void main(String[] args) {

        int[][] matrix = {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };


        setZeroes(matrix);


        for (int[] r : matrix) {

            for (int x : r) {
                System.out.print(x + " ");
            }

            System.out.println();
        }
    }
}
