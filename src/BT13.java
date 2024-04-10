import java.util.Arrays;

public class BT13 {
    public static void main(String[] args) {
        int[] numbers = Main.getArr();
        System.out.println("Original array: " + Arrays.toString(numbers));
//        System.out.println("Sorted array: " + Arrays.toString(bubbleSort(numbers)));

//        System.out.println("Sorted array: " + Arrays.toString(selectionSort(numbers)));

        System.out.println("Sorted array: " + Arrays.toString(insertionSort(numbers)));
    }

    private static int[] bubbleSort(int[] numbers) {
        int n = numbers.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (numbers[j - 1] > numbers[j]) {
                    temp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers;
    }

    private static int[] selectionSort(int[] numbers) {
        int n = numbers.length;
        int minIndex = 0;
        int minInt = numbers[0];
        for (int i = 0; i < n; i++) {
            minIndex = i;
            minInt = numbers[i];
            for (int j = i + 1; j < n; j++) {
                if (numbers[j] < minInt) {
                    minInt = numbers[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                numbers[minIndex] = numbers[i];
                numbers[i] = minInt;
            }
        }
        return numbers;
    }

    private static int[] insertionSort(int[] numbers) {
        int n = numbers.length;
        for (int i = 1; i < n; i++) {
            int key = numbers[i];
            int j = i - 1;
            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j = j - 1;
            }
            numbers[j + 1] = key;
        }
        return numbers;
    }
}
