import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Nhap 5 so");
        System.out.println("So thu 1: ");
        numbers[0] = Integer.parseInt(scanner.nextLine());
        System.out.println("So thu 2: ");
        numbers[1] = Integer.parseInt(scanner.nextLine());
        System.out.println("So thu 3: ");
        numbers[2] = Integer.parseInt(scanner.nextLine());
        System.out.println("So thu 4: ");
        numbers[3] = Integer.parseInt(scanner.nextLine());
        System.out.println("So thu 5: ");
        numbers[4] = Integer.parseInt(scanner.nextLine());
        System.out.println(Main.linearMax(numbers));

    }


}
