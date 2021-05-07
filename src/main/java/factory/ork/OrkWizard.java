package factory.ork;

import factory.Wizard;

public class OrkWizard implements Wizard {

    private int health = 13;
    private int resistance = 7;
    private int speed = 28;
    private int protection = 8;
    private int strength = 22;


        @Override
    public void saveWizard() {
            System.out.println("Hello I'm Ork Rider, my characteristics:" +
                    "health=" + health +
                    ", resistance=" + resistance +
                    ", speed=" + speed +
                    ", protection=" + protection +
                    ", strength=" + strength +
                    '}');
    }
}
