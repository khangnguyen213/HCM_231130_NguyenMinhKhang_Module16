import java.util.ArrayList;
import java.util.Arrays;

public class BT6 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 4, 6, 1, 3));
        insertionSortInDetail(numbers);
    }
    public static ArrayList<Integer> insertionSortInDetail(ArrayList<Integer> numbers) {
        ArrayList<Integer> sortedNumbers = new ArrayList<>(numbers);
        int len = sortedNumbers.size();
        for (int i = 1; i < len; i++) {
            int key = sortedNumbers.get(i);
            int j = i - 1;
            while (j >= 0 && sortedNumbers.get(j) > key) {
                sortedNumbers.set(j + 1, sortedNumbers.get(j));
                j--;
            }
            sortedNumbers.set(j + 1, key);
            System.out.println(sortedNumbers);
        }
        return sortedNumbers;

    }
}
