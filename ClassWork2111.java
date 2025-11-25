import java.util.Scanner;

public class ClassWork2111 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int fact = 1;
        for (int i = 1; i <= N; i++){
            fact = fact * i;
            System.out.println(i);
        }
        System.out.println(fact);
    }

}
