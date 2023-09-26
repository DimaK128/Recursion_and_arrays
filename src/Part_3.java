public class Part_3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 2, 4, 2, 5 , 4 , 8 , 9 , 5 , 4 , 1 , 7 , 3};
        int target = 3; // The value of number which we are searching for
        int count = findCountInArray(array, target, 0); // Start searching from the first element with index 0
        System.out.println("Count of " + target + " in the array: " + count);
    }

    public static int findCountInArray(int[] array, int what, int i) {
        //  If the index i is equal to the array length, return 0
        if (i == array.length) {
            return 0;
        }

        // Check if the current element at index i is equal to the given value
        if (array[i] == what) {
            // If equal, increment count and continue searching in the rest of the array
            return 1 + findCountInArray(array, what, i + 1);
        } else {
            // If not equal, continue searching in the rest of the array
            return findCountInArray(array, what, i + 1);
        }
    }
}

