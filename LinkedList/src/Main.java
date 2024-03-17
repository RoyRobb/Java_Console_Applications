import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    //Create a LinkedList
    static LinkedList<String> list = new LinkedList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void addElement(){
        System.out.println("Please type what You would like to add:");
        list.add(scanner.next());//A check for duplicates should be added, then question if another one should be added
        System.out.println("_______________");
    }
    public static void deleteElement(){
        System.out.println("Please type what You would like to remove:");
        list.remove(scanner.next());//A check for the existing element should be added

        System.out.println("_______________");
    }

    public static void main(String[] args){

        int userChoice;
        //Using Do-while loop to iterate program repeatedly until user chooses to stop
        do {
            System.out.println("Please select an action:");
            System.out.println("1. Add items to the list");
            System.out.println("2. Delete items from the list");
            System.out.println("3. View the list");
            System.out.println("4. Stop the application");
            userChoice = scanner.nextInt();
            if (userChoice == 1){
                addElement();
            } else if (userChoice == 2) {
                deleteElement();
            } else if (userChoice == 3) {
                System.out.println(list);
            }
        } while(userChoice != 4);
    }
}