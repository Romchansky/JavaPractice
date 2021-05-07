package factory.human;

import factory.Wizard;

public class HumanWizard implements Wizard {
    private int protection = 9;
    private int resistance = 11;
    private int speed = 28;
    private int health = 36;
    private int strength = 30;

    @Override
    public void saveWizard() {
        System.out.println("Hello I'm Human Wizard, my characteristics: " +
                "health=" + health +
                ", resistance=" + resistance +
                ", speed=" + speed +
                ", protection=" + protection +
                ", strength=" + strength);
    }
}
