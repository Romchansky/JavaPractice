package factory;

public class OrkWizard implements Wizard{
    private int health;
    private String magicAbility;
    private int reloadMagicAbility;
    private String armor;

    public OrkWizard() {
        this.health = health;
        this.magicAbility = magicAbility;
        this.reloadMagicAbility = reloadMagicAbility;
        this.armor = armor;
    }
    @Override
    public void saveWizard() {
        System.out.println("Create new OrkWizard"+
                "health"+health+
                "magicAbility"+magicAbility +
                "reloadMagicAbility"+reloadMagicAbility+
                "armor"+armor);
    }
}
