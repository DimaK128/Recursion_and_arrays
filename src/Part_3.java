public class Part_3 {
    public static void main(String[] args) {
        int[] array = {1, 7, 9, 4, 5, 2, 2, 6 , 8, 9, 2};
        int target = 9;
        int count = findValueInArray(array, target, 0);
        System.out.println("The number of elements equal to " + target + " is: " + count);
    }

    static int findValueInArray(int[] array, int value, int i) {
        if (i >= array.length) {
            return 0;
        }

        int count = (array[i] == value) ? 1 : 0;
        // If array[i] is equal to what, then count will be set to 1.
        // If array[i] is not equal to what, count will be set to 0.
        return count + findValueInArray(array, value, i + 1);
    }
}
