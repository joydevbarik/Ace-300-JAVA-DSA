public class Main {


    public static void gameOfLife(int[][] board) {

        int rows = board.length;
        int cols = board[0].length;
        int[][] copy = new int[rows][cols];

        for(int i = 0; i < rows; i++) {

            for(int j = 0; j < cols; j++) {

                copy[i][j] = board[i][j];
            }
        }


        int[] x = {-1,-1,-1,0,0,1,1,1};
        int[] y = {-1,0,1,-1,1,-1,0,1};



        for(int i = 0; i < rows; i++) {

            for(int j = 0; j < cols; j++) {


                int live = 0;
                for(int k = 0; k < 8; k++) {

                    int r = i + x[k];
                    int c = j + y[k];


                    if(r >= 0 && r < rows &&
                       c >= 0 && c < cols &&
                       copy[r][c] == 1) {

                        live++;
                    }
                }
                if(copy[i][j] == 1) {

                    if(live < 2 || live > 3)
                        board[i][j] = 0;

                }
                else {

                    if(live == 3)
                        board[i][j] = 1;
                }
            }
        }
    }

    public static void main(String[] args) {


        int[][] board = {

                {0,1,0},
                {0,0,1},
                {1,1,1},
                {0,0,0}

        };


        gameOfLife(board);
        for(int[] row : board) {

            for(int value : row) {

                System.out.print(value + " ");
            }

            System.out.println();
        }
    }
}