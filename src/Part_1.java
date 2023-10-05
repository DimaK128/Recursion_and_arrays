public class Part_1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5 , 6 , 7 , 8 , 9};
        printArray(array, 0);
    }

    public static void printArray(int[] array, int i) {
        //
        if (i >= array.length) {
            return;
        }
        System.out.print(array[i] + " ");
        printArray(array, i + 1);
    }
}
