import java.util.Scanner;
import java.lang.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Reversing a string!");
        System.out.println("Please input Your string: ");

        String userInput = scanner.nextLine();

        StringBuilder userInputReversed = new StringBuilder();

        userInputReversed.append(userInput);

        userInputReversed.reverse();

        System.out.println("Original: " + userInput);
        System.out.println("Reversed: " + userInputReversed);

    }
}