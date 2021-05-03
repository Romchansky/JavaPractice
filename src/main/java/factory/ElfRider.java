package factory;

public class ElfRider implements Rider {

    private int health = 65;
    private int resistance = 12;
    private int speed = 30;
    private int defense = 12;
    private int strength = 15;



    @Override
    public void saveRider() {
        System.out.println("Hello I'm Elf Rider, my characteristics: " +
                "health=" + health +
                ", resistance=" + resistance +
                ", speed=" + speed +
                ", defense=" + defense +
                ", strength=" + strength );
    }
}
