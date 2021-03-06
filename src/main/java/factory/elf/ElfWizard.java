package factory.elf;

import factory.Wizard;

public class ElfWizard implements Wizard {

    private int health = 36;
    private int resistance = 12;
    private int speed = 28;
    private int protection = 9;
    private int strength = 13;


    @Override
    public void saveWizard() {
        System.out.println("Hello I'm Elf Wizard, my characteristics: " +
                "health=" + health +
                ", resistance=" + resistance +
                ", speed=" + speed +
                ", defense=" + protection +
                ", strength=" + strength);
    }
}
