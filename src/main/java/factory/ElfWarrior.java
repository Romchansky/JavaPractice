package factory;

public class ElfWarrior implements Warrior {

    private int health = 43;
    private int resistance = 9;
    private int speed = 28;
    private int defense = 11;
    private int strength = 17;


    @Override
    public void saveWarrior() {
        System.out.println("Hello I'm Elf Warrior, my characteristics: " +
                "health=" + health +
                ", resistance=" + resistance +
                ", speed=" + speed +
                ", defense=" + defense +
                ", strength=" + strength);
    }
}
