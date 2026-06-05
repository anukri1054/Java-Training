public class NQueen {

    public static void NQueen(int[][] board, int row, int n) {

        if (row == n) {
            printBoard(board, n);
            return;
        }

        for (int col = 0; col < n; col++) {

            if (isSafe(board, row, col, n)) {

                board[row][col] = 1;

                NQueen(board, row + 1, n);

                board[row][col] = 0; // Backtracking
            }
        }
    }

    public static boolean isSafe(int[][] board, int row, int col, int n) {

        // Check column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0;
             i--, j--) {

            if (board[i][j] == 1) {
                return false;
            }
        }

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1;
             i >= 0 && j < n;
             i--, j++) {

            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    public static void printBoard(int[][] board, int n) {

        System.out.println("Solution:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (board[i][j] == 1) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int n = 4; 

        int[][] board = new int[n][n];

        NQueen(board, 0, n);
    }
}
