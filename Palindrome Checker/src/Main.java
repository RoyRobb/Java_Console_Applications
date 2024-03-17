import java.util.Scanner;

public class Main {
    static boolean isPalindrome(String string){
        int i = 0;
        int j = string.length() - 1;
        //i and j variables are used as pointers to compare characters
        while (i < j) {
            if (string.charAt(i) != string.charAt(j))
                return false;
            i++;
            j--;
        } return true;
    }

    public static void main(String[] args) {

        System.out.println("Palindrome Checker");
        System.out.println("___________________");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter Your word!");
        String userInput = input.nextLine();
        userInput = userInput.toLowerCase();
        System.out.println("___________________");
        if(isPalindrome(userInput)){
            System.out.println(userInput + " is a palindrome!");
        } else {
            System.out.println(userInput + " is not a palindrome!");
        }
    }
}