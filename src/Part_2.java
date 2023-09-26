public class Part_2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5 , 6 , 7 , 8 , 9};
        int sum = arraySum(array, 0); // Starts to sum up from the first element with index 0
        System.out.println("Sum of array elements: " + sum);
    }

    public static int arraySum(int[] array, int i) {
        //  If the index i is equal to the array length, return 0
        if (i == array.length) {
            return 0;
        }

        // Calculate the sum of elements from index i to the end of the array
        int currentElement = array[i];
        int restOfTheArraySum = arraySum(array, i + 1);

        // Return the sum of the current element and the sum of the rest of the array
        return currentElement + restOfTheArraySum;
    }
}

