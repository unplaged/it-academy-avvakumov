import java.util.Scanner;

public class homework_04_12 {
    public static int getNumbFromUser() {
        System.out.println("numb :");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static void main(String[] args) {
        int result = factorial(getNumbFromUser());
        System.out.println("res: " + result);
    }

    public static int factorial(int x) {
        int result = 1;
        for (int i = 1; i <= x; i++){
            result *= i;
        }
        return result;
    }
}
