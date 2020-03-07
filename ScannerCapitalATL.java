/* This program gets user input on what is the capital of Georgia.
The user is only allowed to answer the question three times (the program
will count how many attempts the user has left).
 */

import java.util.*;

public class ScannerCapitalATL {
    public static void main(String[] args) {
        Scanner capital = new Scanner(System.in);
        System.out.print("What is the capital of Georgia?: ");
        String userInput;
        String ans1 = "Atlanta";
        String ans2 = "atlanta";

        for (int i = 1; i <= 3; i++) {
            userInput = capital.nextLine();
            if (userInput.equals(ans1) || userInput.equals(ans2)) {
                System.out.print("Correct! Good Job.");
                break;
            } else if (i == 3) {
                System.out.print("You've used your max attempts. The answer is Atlanta.");
                break;
            } else {
                System.out.print("Wrong! You have " + (3-i) + " more tries. Please try again: ");
            }
        }
    }
}