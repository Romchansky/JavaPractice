package factory;

public class OrkWarrior implements Warrior{
    private int health;
    private int brunt;
    private String weapon;
    private String armor;

    public OrkWarrior() {
        this.health = health;
        this.brunt = brunt;
        this.weapon = weapon;
        this.armor = armor;
    }

    @Override
    public void saveWarrior() {
        System.out.println("Create new OrkWarrior"+
                "health"+health+
                "brunt"+brunt+
                "weapon"+weapon+
                "armor"+armor);


    }
}
