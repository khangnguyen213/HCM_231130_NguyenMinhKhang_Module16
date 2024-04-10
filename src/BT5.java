import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] sortedArr = Main.getSortedArr();
        ArrayList<Integer> matchedArr = new ArrayList<>();
        System.out.println("Min limit :");
        int min = Integer.parseInt(scanner.nextLine());
        System.out.println("Max limit :");
        int max = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < sortedArr.length; i++){
            if(sortedArr[i] >= min && sortedArr[i] <= max){
                matchedArr.add(sortedArr[i]);
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(sortedArr));
        System.out.println("Number of matched elements: " + matchedArr.size());
        System.out.println("Matched array: " + matchedArr);
    }
}
