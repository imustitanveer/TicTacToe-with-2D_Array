// This code makes a basic TicTacToe game using 2 dimensional arrays
import java.util.Scanner;

// TicTacToe Game Class
public class TicTacToe {
    private static char[][] board = new char[3][3];
    private static char currentPlayer = 'X';

    // Main Method
    public static void main(String[] args) {
        // initializing board
        initializeBoard();
        // displaying initial board
        displayBoard();

        // initializing scanner
        Scanner scanner = new Scanner(System.in);
        while (!isGameFinished()) {
            // getting input for moves
            // example input: Player X, enter your move (row column): 1 2
            System.out.print("Player " + currentPlayer + ", enter your move (row column): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (isValidMove(row, col)) {
                makeMove(row, col);
                displayBoard();
                // if player wins, end the game
                if (checkForWin()) {
                    //print out winner
                    System.out.println("Player " + currentPlayer + " wins!");
                    return;
                }
                // switch player if the game is still going
                switchPlayer();
            } else {
                // print invalid move if the cell is already filled
                System.out.println("Invalid move. Try again.");
            }
        }
        // print draw if game is a draw
        System.out.println("It's a draw!");
    }

    // method to initialize board
    private static void initializeBoard() {
        // iteratively initialize the board with dashes
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    // method to display the board with dashes and bars
    private static void displayBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    // method to check if the move is valid
    private static boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-';
    }

    // method to make move
    private static void makeMove(int row, int col) {
        board[row][col] = currentPlayer;
    }

    //method to switch player
    private static void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    private static boolean checkForWin() {
        // Checking rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != '-' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return true;
            }
        }
        // Checking columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] != '-' && board[0][j] == board[1][j] && board[1][j] == board[2][j]) {
                return true;
            }
        }
        // Checking diagonals
        if (board[0][0] != '-' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return true;
        }
        if (board[0][2] != '-' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return true;
        }
        return false;
    }

    private static boolean isGameFinished() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}

// example input: Player X, enter your move (row column): 1 2


/* Maintaining state and logic control in a tic-tac-toe 
game involves tracking player moves, enforcing game rules, 
handling user input validation, and detecting win conditions, 
all while ensuring smooth progression of the game. 
Coordinating these elements while keeping the code modular 
and readable requires careful design and 
error handling to handle various edge cases efficiently. */
