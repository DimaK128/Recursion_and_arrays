public class Part_1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5 , 6 , 7 , 8 , 9};
        printArray(array, 0);     // Prints array with elements 1,2,3,4,5,6.... which is starting with index 0
    }

    public static void printArray(int[] array, int i) {
        // It checks if index i is equal to the length of the array.

        if (i == array.length) {
            return;
        }

        System.out.print(array[i] + " ");  // Prints current element with index i

        printArray(array, i + 1);        // Recursion to print the next element
    }
}
