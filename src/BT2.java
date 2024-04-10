import java.util.Arrays;

public class BT2 {

    public static void main(String[] args) {
        int[][] array2d = Main.get2dArr();
        System.out.println(Arrays.deepToString(array2d));
        System.out.println(Main.existNumberIn2DArr(array2d,10));
        System.out.println(Main.existNumberIn2DArr(array2d,20));
        System.out.println(Main.existNumberIn2DArr(array2d,12));
        System.out.println(Main.existNumberIn2DArr(array2d,15));
    }




}
