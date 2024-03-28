import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public int runIterativeSearch(int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;
        if(key > 0 && key < 10){
            while (low <= high) {
                int mid = low + ((high - low) / 2);

                if (sortedArray[mid] < key) {
                    low = mid + 1;

                } else if (sortedArray[mid] > key) {
                    high = mid - 1;

                } else if (sortedArray[mid] == key) {
                    index = mid;
                    break;
                }
            }
        } else {
            System.out.println("Wrong input!");
        }
        return index;
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("Binary index search!");
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int low = 0;
        int high = sortedArray.length - 1;

        System.out.println(Arrays.toString(sortedArray));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int key = scanner.nextInt();
        scanner.close();

        int result = main.runIterativeSearch(sortedArray, key, low, high);
        System.out.println("Index of " + key + " is: " + result);
    }
}