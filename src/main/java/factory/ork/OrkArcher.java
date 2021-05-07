package factory.ork;

import factory.Archer;

public class OrkArcher implements Archer {

    private int health = 5;
    private int resistance = 3;
    private int speed = 26;
    private int protection = 2;
    private int strength = 4;



    @Override
    public void saveArcher() {
        System.out.println("Hello I'm Ork Archer, my characteristics:  " +
                "health=" + health +
                ", resistance=" + resistance +
                ", speed=" + speed +
                ", protection=" + protection +
                ", strength=" + strength +
                '}');
    }
}
