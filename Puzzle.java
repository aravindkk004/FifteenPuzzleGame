import java.util.Random;

public class Puzzle {
    private int[][] board;
    private final int SIZE = 4;
    private int emptyRow;
    private int emptyCol;

    public Puzzle() {
        board = new int[SIZE][SIZE];
        initializeBoard();
    }

    //static board it will statically contains the numbers in that puzzle it wont channge

    // private void initializeBoard() {
    //     int[][] staticBoard = {
    //         {1, 2, 3, 4},
    //         {5, 6, 0, 8},
    //         {9, 10, 11, 12},
    //         {13, 14, 15, 7}
    //     };
    //     for (int i = 0; i < SIZE; i++) {
    //         System.arraycopy(staticBoard[i], 0, board[i], 0, SIZE);
    //     }
    //     emptyRow = 1;
    //     emptyCol = 2; 
    // }

    //dynamic board it will change the position of a number every game
    private void initializeBoard() {
        int num = 1;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = num++;
            }
        }
        board[SIZE - 1][SIZE - 1] = 0; 
        emptyRow = SIZE - 1;
        emptyCol = SIZE - 1;
        shuffle();
    }

    //shuffle all the numbers in the 4X4 grid to dynamically assign the numbers for every game
    private void shuffle() {
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            int direction = rand.nextInt(4);
            switch (direction) {
                case 0: move("u"); break;
                case 1: move("d"); break;
                case 2: move("l"); break;
                case 3: move("r"); break;
            }
        }
    }

    //print the board
    public void display() {
        System.out.println("Current Puzzle State:");
        System.out.println("---------------------");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("| ");
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == 0) {
                    System.out.print("   "); 
                } else {
                    System.out.printf("%-2d ", board[i][j]); 
                }
                System.out.print("| "); 
            }
            System.out.println();
            System.out.println("---------------------"); 
        }
        System.out.println(); 
    }

    //move the whitespace to either up or down or left or right. this will move only one step to their surroundings
    public void move(String direction) {
        switch (direction.toLowerCase()) {
            case "u":
                if (emptyRow > 0) { 
                    swap(emptyRow, emptyCol, emptyRow - 1, emptyCol);
                    emptyRow--; 
                }
                break;
            case "d":
                if (emptyRow < SIZE - 1) { 
                    swap(emptyRow, emptyCol, emptyRow + 1, emptyCol);
                    emptyRow++;
                }
                break;
            case "l":
                if (emptyCol > 0) { 
                    swap(emptyRow, emptyCol, emptyRow, emptyCol - 1);
                    emptyCol--; 
                }
                break;
            case "r":
                if (emptyCol < SIZE - 1) { 
                    swap(emptyRow, emptyCol, emptyRow, emptyCol + 1);
                    emptyCol++; 
                }
                break;
            default:
                System.out.println("Invalid move. Use up, down, left, or right.");
        }
    }

    //swapping the whitespace to left or right or top or down
    private void swap(int row1, int col1, int row2, int col2) {
        int temp = board[row1][col1];
        board[row1][col1] = board[row2][col2];
        board[row2][col2] = temp;
    }

    public int[][] getBoard() {
        return board;
    }

    //checking all the numbers are correctly positioned and declare whether the player won or not
    public boolean isSolved() {
        int num = 1;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (i == SIZE - 1 && j == SIZE - 1) {
                    if (board[i][j] != 0) return false; 
                } else {
                    if (board[i][j] != num++) return false;
                }
            }
        }
        return true;
    }
}
 