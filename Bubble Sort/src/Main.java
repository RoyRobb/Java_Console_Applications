public class Main {

    static void bubbleSort(int arr[], int n){
        int i;
        int j;
        int temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++){
            swapped = false;
            for (j = 0; j < n -1; j++){
                if (arr[j] > arr[j + 1]){
                    //Swap j and j+1
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
        }
    }

    static void printArray(int arr[], int size){
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println("Bubble sort array!");
        int arr[] = {8, 4, 2, 1, 32, 64, 16};
        int n = arr.length;
        System.out.println("Original array: ");
        printArray(arr, n);
        bubbleSort(arr, n);
        System.out.println("Sorted array: ");
        printArray(arr, n);

    }
}