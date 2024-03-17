import java.util.Scanner; //importing the scanner


public class Main {
    public static void main(String[] args) {
        System.out.println("FizzBuzz Test");
        Scanner in = new Scanner(System.in); //Scans user input
        System.out.println("Please enter the number to check to!"); //User can choose the number up to which to go to
        int x = Integer.parseInt(in.nextLine()); //User input assigned to a variable
        int numbers = 0; //Numbers that can not be divided by 3 or 5 with no remainder
        int fizzes = 0; //Numbers that can be divided by 3 and not 5 with no remainder
        int buzzes = 0; //Numbers that can be divided by 5 and not 3 with no remainder
        int fizzbuzzes = 0; //Numbers that can be divided by 3 and 5 with no remainder
        System.out.println("Number chosen: " + x);
        System.out.println("_______________________________________________");//Separator

        for (int i = 1; i <= x; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                fizzes ++;
                System.out.println("Fizz");
            } else if (i % 5 == 0 && i % 3 != 0) {
                buzzes ++;
                System.out.println("Buzz");
            } else if (i % 3 == 0 && i % 5 == 0) {
                fizzbuzzes++;
                System.out.println("FizzBuzz");
            } else {
                numbers++;
                System.out.println(i);
            }
        }
        System.out.println("_______________________________________________");//Separator
        System.out.println("Fizzes: " + fizzes);
        System.out.println("Buzzes: " + buzzes);
        System.out.println("FizzBuzzes: " + fizzbuzzes);
        System.out.println("Numbers: " + numbers);
        System.out.println("_______________________________________________");//Separator
        if (fizzes + buzzes + fizzbuzzes + numbers == x) {
            System.out.println("No errors!");//Error check successful
        } else {
            System.out.println("Something is wrong!");//Error check unsuccessful
        }
    }
}