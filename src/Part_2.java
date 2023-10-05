public class Part_2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5 , 6 , 7 , 8 , 9};
        int sum = arraySum(array, 0);
        System.out.println("Sum of array elements: " + sum);
    }

    public static int arraySum(int[] array, int i) {
        if (i >= array.length) {
            return 0;
        }

        int currentElement = array[i];
        int restOfTheArraySum = arraySum(array, i + 1);
        return currentElement + restOfTheArraySum;
    }
}

