package factory.human;

import factory.Rider;

public class HumanRider implements Rider {
    private int protection = 12;
    private int resistance = 9;
    private int speed = 36;
    private int health = 55;
    private int strength = 50;

    @Override
    public void saveRider() {
        System.out.println("Hello I'm Human Rider, my characteristics: " +
                "health=" + health +
                ", resistance=" + resistance +
                ", speed=" + speed +
                ", protection=" + protection +
                ", strength=" + strength);
    }
}
