import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Prime Number Generator!");
        System.out.println("Please enter the number to count prime numbers to: ");

        int maxPrime = scanner.nextInt();
        boolean isPrime;
        int x;
        int y;
        int primeCount = 0;

        for (x = 2; x <= maxPrime; x++) {
            isPrime = true;

            for (y = 2; y <= Math.sqrt(x); y++) {
                if (x % y == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(x + " ");
                primeCount++;
            }
        }
        System.out.println("Number of primes: " + primeCount);
    }
}
