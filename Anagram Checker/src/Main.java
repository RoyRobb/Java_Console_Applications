import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Anagram Checker");
        System.out.println("_________________");
        Scanner input = new Scanner(System.in);
        System.out.println("Please input first word: ");
        String userInput1 = input.nextLine();
        System.out.println("Please input second word: ");
        String userInput2 = input.nextLine();
        System.out.println("_________________");
        //Convert strings to lowercase to avoid errors
        userInput1 = userInput1.toLowerCase();
        userInput2 = userInput2.toLowerCase();
        //Check for length of words, anagram words can not have different lengths
        if (userInput1.length() == userInput2.length()){
            //Convert strings to array
            char[] charArray1 = userInput1.toCharArray();
            char[] charArray2 = userInput2.toCharArray();
            //Sort the array so we can compare them
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            //Compare the arrays and have a boolean variable to store the result
            boolean isAnagram = Arrays.equals(charArray1, charArray2);
            if (isAnagram) {
                //The words are anagram
                System.out.println(userInput1 + " and " + userInput2 + " are anagram!");
            } else {
                //Both words are same length but are not anagram
                System.out.println(userInput1 + " and " + userInput2 + " are not anagram!");
            }
        } else {
            //The words are not the same length hence they are not anagram
            System.out.println(userInput1 + " and " + userInput2 + " are not anagram!");
        }
    }
}