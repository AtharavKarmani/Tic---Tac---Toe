import java.util.Scanner;

public class InputHandler {

    public static int getUserSlot() {
        Scanner scanner = new Scanner(System.in);
        int slot;

        while (true) {
            System.out.print("Enter a slot number (1-9): ");
            
            if (scanner.hasNextInt()) {
                slot = scanner.nextInt();
                
                if (slot >= 1 && slot <= 9) {
                    return slot;
                } else {
                    System.out.println("Invalid input! Please enter a number between 1 and 9.");
                }
            } else {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next(); // clear invalid input
            }
        }
    }
}