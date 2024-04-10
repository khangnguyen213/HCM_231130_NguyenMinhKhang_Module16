import java.util.Arrays;

public class BT1 {
    public static void main(String[] args) {
        int[] numbers = Main.getArr();
        int max = Main.linearMax(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(max);
    }

}
