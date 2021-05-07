package factory.human;

import factory.Archer;

public class HumanArcher implements Archer {
    private int protection = 9;
    private int resistance = 8;
    private int speed = 28;
    private int health = 35;
    private int strength = 30;


    @Override
    public void saveArcher() {
        System.out.println("Hello I'm Human Archer, my characteristics: " +
                "health=" + health +
                ", resistance=" + resistance +
                ", speed=" + speed +
                ", protection=" + protection +
                ", strength=" + strength);
    }
}
