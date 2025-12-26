import java.util.Random;

public class Fish {
    private final String nameFish;
    private final int powerFish;

    public Fish(String nameFish) {
        this.nameFish = nameFish;
        this.powerFish = createPowerFish();
    }

    private int createPowerFish() {
        Random random = new Random();
        return random.nextInt(15);
    }

    public int getPowerFish() {
        return powerFish;
    }

    public String getNameFish() {
        return nameFish;
    }
}
