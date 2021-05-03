package factory;

public class ElfArcher implements Archer {

    private int health = 32;
    private int resistance = 9;
    private int speed = 28;
    private int defense = 8;
    private int strength = 10;


    @Override
    public void saveArcher() {
        System.out.println("Hello I'm Elf Archer, my characteristics: " +
                "health=" + health +
                ", resistance=" + resistance +
                ", speed=" + speed +
                ", defense=" + defense +
                ", strength=" + strength);
    }
}
