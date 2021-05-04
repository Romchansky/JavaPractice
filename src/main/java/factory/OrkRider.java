package factory;

public class OrkRider implements Rider {
    private int health;
    private int brunt;
    private String weapon;
    private String armor;
    private String mount;

    public OrkRider() {
        this.health = health;
        this.brunt = brunt;
        this.weapon = weapon;
        this.armor = armor;
        this.mount = mount;
    }

    @Override
    public void saveRider() {
        System.out.println("Create new Ork Rider"+
                "health"+health+
                "brunt"+brunt+
                "weapon"+weapon+
                "armor"+armor+
                "mount"+mount);

    }
}
