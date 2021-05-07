package factory.dwarf;

import factory.Archer;

public class DwarfArcher implements Archer {
    private int protection = 6;
    private int resistance = 5;
    private int speed = 20;
    private int health = 10;
    private int strength = 5;

    @Override
    public void saveArcher() {
        System.out.println("Hello I'm Dwarf Archer, my characteristics: " +
                "health=" + health +
                ", resistance=" + resistance +
                ", speed=" + speed +
                ", protection=" + protection +
                ", strength=" + strength);
    }
}
