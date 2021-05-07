package factory.dwarf;

import factory.Rider;

public class DwarfRider implements Rider {
    private int protection = 8;
    private int resistance = 7;
    private int speed = 32;
    private int health = 17;
    private int strength = 12;

    @Override
    public void saveRider() {
        System.out.println("Hello I'm Dwarf Rider, my characteristics: " +
                "health=" + health +
                ", resistance=" + resistance +
                ", speed=" + speed +
                ", protection=" + protection +
                ", strength=" + strength);
    }
}
