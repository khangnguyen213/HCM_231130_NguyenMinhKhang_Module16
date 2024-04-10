import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class BT8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao 1 chuoi bat ky");
        String str = scanner.nextLine();
        String[] stringArr= str.split("");
        ArrayList<Integer> codePoints = new ArrayList<>();
        str.codePoints().forEach(codePoints::add);
        AtomicInteger current = new AtomicInteger(codePoints.get(0));
        System.out.println(codePoints);
        int maxLength = codePoints.stream().reduce(1,(count,codePoint) -> {
            if (current.get() < codePoint) {
                current.set(codePoint);
                count++;
            }
            return count;
        });
        System.out.println("Do dai chuoi dai nhat la: " + maxLength);
    }
}
