package factory.dwarf;

import factory.Warrior;

public class DwarfWarrior implements Warrior {
    private int protection = 6;
    private int resistance = 5;
    private int speed = 20;
    private int health = 12;
    private int strength = 8;

    @Override
    public void saveWarrior() {
        System.out.println("Hello I'm Dwarf Warrior, my characteristics: " +
                "health=" + health +
                ", resistance=" + resistance +
                ", speed=" + speed +
                ", protection=" + protection +
                ", strength=" + strength);
    }
}
