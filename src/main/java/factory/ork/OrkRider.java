package factory.ork;

import factory.Rider;

public class OrkRider implements Rider {

    private int health = 17;
    private int resistance = 5;
    private int speed = 36;
    private int protection = 8;
    private int strength = 16;


    @Override
    public void saveRider() {
        System.out.println("Hello I'm Ork Rider, my characteristics:" +
                "health=" + health +
                ", resistance=" + resistance +
                ", speed=" + speed +
                ", protection=" + protection +
                ", strength=" + strength +
                '}');

    }
}
