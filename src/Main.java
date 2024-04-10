import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static int linearMax(int[] numbers) {
        int max = numbers[0];
        int len = numbers.length;
        for (int number : numbers) {
            if (max < number) {
                max = number;
            }
        }
        return max;
    }
    public static int[] getArr(){
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }
    public static int[][] get2dArr(){
        int[][] arr = new int[20][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }

        }
        return arr;
    }
    public static boolean existNumberIn2DArr(int[][] arr, int number){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == number) {
                    return true;
                }
            }
        }
        return false;
    }
    public static int[] getIntegerArrayFromInput(Scanner scanner) {
        System.out.println("Enter the length of the array: ");
        int length = scanner.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter the element at index " + i + ": ");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
    public static int[] sortIntArray(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static int findNumberInSortedArray(int[] arr, int number) {
        int len = arr.length;
        int left = 0;
        int right = len - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == number) {
                return mid;
            }
            if (arr[mid] < number) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    public static Integer[] getSortedArr(){
        Integer[] arr = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr);
        return arr;
    }
    public static Integer[] getReversedSortedArr(){
        Integer[] arr = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        return arr;
    }
}