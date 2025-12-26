import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = createPlayer(scanner);
        Fish[] fishes = checkFishes(scanner);

        startCatchFishes(player, fishes);
    }

    private static Player createPlayer(Scanner scanner) {
        System.out.println("Введите имя игрока: ");
        return new Player(scanner.nextLine());
    }

    private static Fish[] createFishes(int countOfFishes) {
        Fish[] fishes = new Fish[countOfFishes];
        for (int i = 0; i < fishes.length; i++) {
            fishes[i] = new Fish("Рыбка %d".formatted(i + 1));
        }

        System.out.println("Рыбки созданы");
        return fishes;
    }

    private static Fish[] checkFishes(Scanner scanner) {
        while (true) {
            System.out.println("Введите количество рыб:");
            int countOfFishes = scanner.nextInt();

            if (countOfFishes > 0) {
                return createFishes(countOfFishes);
            }
            System.out.println("Количество рыб не должно быть меньше нуля");
        }
    }

    private static void startCatchFishes(Player player, Fish[] fishes) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Чтобы начать ловить введите - 1");
        int start_fishing = scanner.nextInt();
        int count_fishing = 0;
        boolean isAlive = player.isAlive();
        if (start_fishing != 0) {
            while (isAlive && count < fishes.length && start_fishing == 1) {
                player.catchFish(fishes[count]);
                count++;
                isAlive = player.isAlive();
                if(player.isAlive()) {
                    System.out.println("Чтобы продолжить ловить введите - 1, чтобы остановиться - 0");
                    count_fishing = scanner.nextInt();
                }
                if (count_fishing == 0)
                {
                    System.out.println("Рыбалка окончена");
                    break;
                }
            }
        }
        if (player.isAlive()) {
            System.out.println("Игрок %s выловил %s рыб и заработал %d %s"
                    .formatted(player.getUserName(),player.getCount_of_fishes(),player.getPoints(), changePointName(player.getPoints())));
        } else {
            System.out.println("Игрок заработал %d %s"
                    .formatted(player.getPoints(), changePointName(player.getPoints())));
        }
    }

    private static String changePointName(int points) {
        String pointName;
        int numberOfPoints = points % 10;
        if (numberOfPoints == 1) {
            pointName = "очко";
        } else if (numberOfPoints < 5 && numberOfPoints != 0) {
            pointName = "очка";
        } else {
            pointName = "очков";
        }

        return pointName;
    }
}
