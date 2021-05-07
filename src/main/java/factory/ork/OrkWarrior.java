package factory.ork;

import factory.Warrior;

public class OrkWarrior implements Warrior {

    private int health = 12;
    private int resistance = 4;
    private int speed = 24;
    private int protection = 7;
    private int strength = 12;


    @Override
    public void saveWarrior() {
        System.out.println("Hello I'm Ork Warrior, my characteristics:" +
                "health=" + health +
                ", resistance=" + resistance +
                ", speed=" + speed +
                ", protection=" + protection +
                ", strength=" + strength +
                '}');

    }
}