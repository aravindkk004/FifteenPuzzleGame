# Fifteen Puzzle Game

A classic sliding puzzle game where the goal is to arrange numbered tiles in order by making sliding moves. The game features a 4x4 board with one empty space that allows players to move tiles into that space to achieve the correct order.

## Table of Contents

- [Features](#features)
- [Technologies Used](#technologies-used)
- [How to Run the Game](#how-to-run-the-game)
- [Gameplay Instructions](#gameplay-instructions)
- [Contributing](#contributing)
- [License](#license)

## Features

- 4x4 sliding puzzle board
- Randomized initial state
- Check for win condition
- Player movement through console input
- Displays current board state

## Technologies Used

- Java

## How to Run the Game

1. Clone the repository to your local machine:
   ```bash
   git clone https://github.com/aravindkk004/FifteenPuzzleGame.git


## File Descriptions

### Main.java

The `Main` class serves as the entry point for the Fifteen Puzzle Game. This file handles the following:

- **Game Initialization**: It creates an instance of the `Puzzle` class to set up the game board and shuffle the tiles.
- **Game Loop**: It contains the main loop that continuously prompts the player for input to move tiles until the game is solved.
- **User Input Handling**: It captures user commands (such as "up," "down," "left," "right") and calls the appropriate methods in the `Puzzle` class to update the game state.
- **Display**: It manages the display of the current state of the game board after each move, allowing the player to visualize their progress.

### Puzzle.java

The `Puzzle` class contains the core logic for the Fifteen Puzzle Game. This file handles the following:

- **Board Management**: It initializes a 4x4 grid and populates it with numbers 1 to 15 and an empty space (represented by 0).
- **Tile Movement**: It defines the methods for moving tiles in response to player commands, ensuring that only valid moves are allowed.
- **Shuffling**: It includes a method to shuffle the tiles at the beginning of the game to create a random starting position.
- **Game Logic**: It contains logic to check whether the puzzle is solved by verifying the arrangement of tiles on the board.
- **Display Functionality**: It provides methods for displaying the board to the console, showing the current state of the game.

Together, these files create a complete implementation of the Fifteen Puzzle Game, allowing players to enjoy this classic challenge through a console interface.
