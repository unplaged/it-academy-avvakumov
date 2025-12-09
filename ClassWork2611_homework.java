import java.util.Scanner;
public class ClassWork2611_homework {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int z = 0;

        int[][] arr = new int[n][n];
        for (int k = 0; k < 2 * n - 1; k++) {
            int i, j;
            if (k < n) {
                i = 0;
                j = k;
            } else {
                i = k - n + 1;
                j = n - 1;
            }
            while (i < n && j >= 0) {
                z++;
                arr[i][j] = z;
                i++;
                j--;
            }
        }
        for (int[] a : arr) {
            for (int x : a) {
                if ( x / 10 < 1) {
                    System.out.print(x + "  ");
                }
                else {
                    System.out.print(x + " ");
                }
            }
            System.out.println(" ");
        }
    }
}
/***
1 2 4
3 5 7
6 8 9

00 01 02
10 11 12
20 21 22

00 01 10 02 11 20 12 21 22
*/