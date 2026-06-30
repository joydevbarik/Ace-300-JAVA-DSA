import java.util.HashSet;

public class Main {


    public static boolean isValidSudoku(char[][] board) {

        for(int r = 0; r < 9; r++) {

            HashSet<Character> set = new HashSet<>();

            for(int c = 0; c < 9; c++) {

                char ch = board[r][c];

                if(ch == '.')
                    continue;

                if(set.contains(ch))
                    return false;

                set.add(ch);
            }
        }
        for(int c = 0; c < 9; c++) {

            HashSet<Character> set = new HashSet<>();

            for(int r = 0; r < 9; r++) {

                char ch = board[r][c];

                if(ch == '.')
                    continue;

                if(set.contains(ch))
                    return false;

                set.add(ch);
            }
        }
        for(int row = 0; row < 9; row += 3) {

            for(int col = 0; col < 9; col += 3) {


                HashSet<Character> set = new HashSet<>();


                for(int i = row; i < row + 3; i++) {

                    for(int j = col; j < col + 3; j++) {


                        char ch = board[i][j];


                        if(ch == '.')
                            continue;


                        if(set.contains(ch))
                            return false;


                        set.add(ch);
                    }
                }
            }
        }


        return true;
    }




    public static void main(String[] args) {


        char[][] board = {

                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},

                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},

                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}

        };



        System.out.println(
                "Valid Sudoku = " + isValidSudoku(board)
        );
    }
}