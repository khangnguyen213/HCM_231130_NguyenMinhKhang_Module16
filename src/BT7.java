import java.util.Arrays;

public class BT7 {
    public static void main(String[] args) {
    Integer[] arr = Main.getReversedSortedArr();
        System.out.println(Arrays.toString(arr));
        System.out.println(findNumberByBinaryInReversedArr(arr, 5));
        System.out.println(findNumberByBinaryInReversedArr(arr, 10));
    }

    public static Integer findNumberByBinaryInReversedArr(Integer[] arr, Integer number) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == number) {
                return mid;
            }
            if (arr[mid] < number) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
