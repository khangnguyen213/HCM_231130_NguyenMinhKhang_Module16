import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int[] arr = Main.getIntegerArrayFromInput(scanner);
       int[] sortedArr = Main.sortIntArray(arr);
        System.out.println(Main.findNumberInSortedArray(sortedArr, 5));
    }
}
