# Tic-Tac-Toe Game

This Java program implements a basic Tic-Tac-Toe game using a 2-dimensional array. Players take turns to mark spaces in a 3x3 grid, aiming to achieve a winning pattern of three marks in a row, column, or diagonal.

## How to Play
1. Compile the Java file `TicTacToe.java`.
2. Run the compiled Java class `TicTacToe`.
3. Players take turns to input their moves by specifying the row and column.
4. The game continues until one player achieves a winning pattern, or the board is filled resulting in a draw.

## Features
- **Display Board:** The current state of the game board is displayed after each move.
- **Validate Moves:** Checks if the player's move is valid and updates the board accordingly.
- **Switch Player:** Alternates between players (X and O) after each valid move.
- **Win Condition:** Detects if a player has achieved a winning pattern (three marks in a row, column, or diagonal).
- **Game Completion:** Determines if the game has ended either due to a win or a draw.

## Implementation Details
- The program utilizes a 2-dimensional array to represent the game board.
- Player moves are validated to ensure they are within the bounds of the board and on an empty space.
- Win conditions are checked by examining rows, columns, and diagonals for matching marks.
- The game continues until a player wins or the board is filled, resulting in a draw.

## Note
Maintaining state and logic control in a tic-tac-toe game involves tracking player moves, enforcing game rules, handling user input validation, and detecting win conditions, all while ensuring smooth progression of the game. Coordinating these elements while keeping the code modular and readable requires careful design and error handling to handle various edge cases efficiently.
