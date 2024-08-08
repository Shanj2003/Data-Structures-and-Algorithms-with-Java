public class SelectionSort {

    
    public static void selectionSort(int[] array) {
        int n = array.length;
        int minInd=-1;

        
        for (int i = 0; i < n - 1; i++) 
        {
           minInd=i;

            
            for (int j = i+1; j < n- 1; j++) {
                
             if(array[minInd]>array[j])
             {
                 minInd=j;
             }
            }
           int temp = array[minInd];
            array[minInd] = array[i];
            array[i] = temp;

        }
    }

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90}; // Example array

        System.out.println("Original array:");
        printArray(array);

        selectionSort(array);

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
