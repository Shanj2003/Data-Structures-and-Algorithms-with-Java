public class BinarySearch {

    // Method to perform binary search
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid; // Return the index if the target is found
            }

            if (array[mid] < target) {
                left = mid + 1; // Narrow the search to the right half
            } else {
                right = mid - 1; // Narrow the search to the left half
            }
        }

        return -1; // Return -1 if the target is not found
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
