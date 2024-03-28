import java.util.Arrays;

public class Main {

    void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        System.out.println("Insertion sort!");

        int[] arr = {128, 2, 4, 64, 32, 16, 8, 1, 64};

        System.out.println("Original array: ");
        System.out.println(Arrays.toString(arr));


        Main ob = new Main();
        ob.sort(arr);

        System.out.println("Sorted array: ");
        System.out.println(Arrays.toString(arr));


    }
}