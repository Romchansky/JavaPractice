package factory.human;

import factory.Warrior;

public class HumanWarrior implements Warrior {
    private int protection = 13;
    private int resistance = 11;
    private int speed = 36;
    private int health = 70;
    private int strength = 65;

    @Override
    public void saveWarrior() {
        System.out.println("Hello I'm Human Warrior, my characteristics: " +
                "health=" + health +
                ", resistance=" + resistance +
                ", speed=" + speed +
                ", protection=" + protection +
                ", strength=" + strength);
    }
}
