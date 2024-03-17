import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Fibonacci Sequence Generator!");
        System.out.println("Please enter the number to generate the sequence up to: ");
        int maxSeqNum = scanner.nextInt();

        int num1;
        int num2 = 1;
        int sumOfNum = 1;
        int count = 0;

        while(sumOfNum <= maxSeqNum) {
            System.out.println(sumOfNum);
            count++;
            num1 = num2;
            num2 = sumOfNum;
            sumOfNum = num1 + num2;
        }
        System.out.println("Sequence number " + count);
    }
}