package factory.dwarf;

import factory.Wizard;

public class DwarfWizard implements Wizard {
    private int protection = 6;
    private int resistance = 10;
    private int speed = 24;
    private int health = 12;
    private int strength = 6;

    @Override
    public void saveWizard() {
        System.out.println("Hello I'm Dwarf Wizard, my characteristics: " +
                "health=" + health +
                ", resistance=" + resistance +
                ", speed=" + speed +
                ", protection=" + protection +
                ", strength=" + strength);
    }
}
