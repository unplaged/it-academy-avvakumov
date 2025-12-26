import java.util.Random;

public class Player {
    private int points;
    private final String userName;
    private final int powerPlayer;
    private boolean isAlive;
    private int count_of_fishes;

    public Player(String userName) {
        this.points = 0;
        this.userName = userName;
        this.powerPlayer = createPowerPlayer();
        this.isAlive = true;
        this.count_of_fishes = 0;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public int getPoints() {
        return points;
    }

    public String getUserName() {
        return userName;
    }

    private int createPowerPlayer() {
        Random random = new Random();
        return random.nextInt(1, 20);
    }

    public void catchFish(Fish fish){
        String fishName = fish.getNameFish();
        int powerFish = fish.getPowerFish();

        if (powerPlayer > powerFish){
            System.out.println("%s поймана".formatted(fishName));
            points += powerFish;
            count_of_fishes += 1;
        } else {
            isAlive = false; // Просто умираем
            System.out.println("Игрока утащила %s".formatted(fishName));
        }
    }
    public int getCount_of_fishes() {
        return count_of_fishes;
    }
}
