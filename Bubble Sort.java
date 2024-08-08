public class BubbleSort {

    // Method to perform bubble sort
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;

        // Traverse through all array elements
        for (int i = 0; i < n - 1; i++) {
           for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent elements
                if (array[j] > array[j + 1]) {
                    // Swap if elements are in the wrong order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    
                }
            }


        }
    }

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90}; // Example array

        System.out.println("Original array:");
        printArray(array);

        bubbleSort(array);

        System.out.println("Sorted array:");
        printArray(array);
    }

    // Utility method to print the array
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
