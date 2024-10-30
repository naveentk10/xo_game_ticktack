# Tic-Tac-Toe Game

This is a simple Java implementation of the classic Tic-Tac-Toe game for two players, "X" and "O". Players take turns to place their mark in a 3x3 grid, aiming to form a straight line of three marks (horizontally, vertically, or diagonally) to win the game.

## How to Run

1. Copy the code to a Java file named `TickTack.java`.
2. Open a terminal and navigate to the directory where `TickTack.java` is saved.
3. Compile the program with:
   ```bash
   javac TickTack.java
   ```
4. Run the compiled program:
   ```bash
   java TickTack
   ```

## How to Play

- Each player takes turns entering the row and column index (0, 1, or 2) where they want to place their mark.
- The game board is displayed after each move, and an announcement is made when a player wins or if a move is invalid.

### Rules

1. Players alternate turns, starting with player "X".
2. To place your mark, input the row and column index where you want to play.
3. If a cell is already occupied, you'll be prompted to make a different move.
4. The game ends when a player successfully aligns three marks in a row, column, or diagonal, or if all cells are filled without a winner (resulting in a draw).

### Example Playthrough

```
Player X enter: 0 0
X |   |   
-----------
  |   |   
-----------
  |   |   
Player O enter: 1 1
X |   |   
-----------
  | O |   
-----------
  |   |   
```

## Code Structure

- **`printBoard(char[][] board)`**: Prints the current game board.
- **`HaveWon(char[][] board, char player)`**: Checks if the specified player has won.

## Requirements

- Java Runtime Environment (JRE) to run the code.

