import java.util.Random;
import java.util.Scanner;

public class homework_04_12_array {
    public static void main(String[] args) {
        System.out.println("Размера массива = :");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Диапазон рандомных чисел= :");
        array(n);
    }
    public static void array (int n) {
        Scanner scanner = new Scanner(System.in);
        Random rn = new Random();
        System.out.println("min = :");
        int min = scanner.nextInt();
        System.out.println("max = :");
        int max = scanner.nextInt();
        int[] arr = new int[n];
        for (int x = 0; x < n; x++) {
            int num = rn.nextInt(max - min + 1) + min;
            arr[x] = num;
        }
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
