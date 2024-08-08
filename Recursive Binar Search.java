public class RecursiveBinarySearch {

    // Recursive method to perform binary search
    public static int binarySearch(int[] array, int target, int left, int right) {
        if (left > right) {
            return -1; // Base case: target not found
        }

        int mid = left + (right - left) / 2;

        if (array[mid] == target) {
            return mid; // Base case: target found
        }

        if (array[mid] < target) {
            // Recursive case: search the right half
            return binarySearch(array, target, mid + 1, right);
        } else {
            // Recursive case: search the left half
            return binarySearch(array, target, left, mid - 1);
        }
    }

    // Helper method to call the recursive binary search
    public static int binarySearch(int[] array, int target) {
        return binarySearch(array, target, 0, array.length - 1);
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50}; // The array must be sorted for binary search
        int target = 30;

        int result = binarySearch(array, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
