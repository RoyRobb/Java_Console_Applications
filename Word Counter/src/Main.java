import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Word Counter!");

        System.out.println("Please enter Your text: ");
        String text = scanner.nextLine();

        int words = text.split("\\s").length;
        System.out.println("Number of words:" + words);
    }
}
