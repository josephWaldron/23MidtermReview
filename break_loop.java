package MidtermReview;

import java.util.Scanner;

public class break_loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) { // infinite loop
            System.out.println("Please enter a command ('stop' to quit): ");
            String input = scanner.nextLine();
            if (input.equals("stop")) { // break the loop if user inputs "exit"
                System.out.println("Exiting program...");
                break;
            }
            System.out.println("You entered: " + input);
        }
        scanner.close(); // close the scanner when done
    }
}
