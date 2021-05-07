package factory.elf;

import factory.Warrior;

public class ElfWarrior implements Warrior {

    private int health = 43;
    private int resistance = 9;
    private int speed = 28;
    private int protection = 11;
    private int strength = 17;


    @Override
    public void saveWarrior() {
        System.out.println("Hello I'm Elf Warrior, my characteristics: " +
                "health=" + health +
                ", resistance=" + resistance +
                ", speed=" + speed +
                ", defense=" + protection +
                ", strength=" + strength);
    }
}
