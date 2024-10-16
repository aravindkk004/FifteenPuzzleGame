import java.util.*;
public class Main {
    public static void main(String[] args) {
        Puzzle puzzle = new Puzzle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to 15 puzzle Game!!!");
        while (true) {
            System.out.println("Current Puzzle State:");
            puzzle.display();

            if (puzzle.isSolved()) {
                System.out.println("Congratulations! You've solved the puzzle!");
                break; 
            }

            System.out.print("Enter your move (u->up, d->down, l->left, r->right) or 'exit' to quit: ");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("exit")) {
                System.out.println("Exiting the game.");
                break; 
            }

            puzzle.move(input);
        }

        scanner.close(); 
    }
}
