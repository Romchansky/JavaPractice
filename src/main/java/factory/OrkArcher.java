package factory;

public class OrkArcher implements Archer {
    private int health;
    private int shotRange;
    private String bowType;
    private String arrowType;
    private String armor;

    public OrkArcher() {
        this.health = health;
        this.shotRange = shotRange;
        this.bowType = bowType;
        this.arrowType = arrowType;
        this.armor = armor;
    }

    @Override
    public void saveArcher() {
        System.out.println("Create new OrkArcher"+
                "health"+health+
                "shotRange"+shotRange+
                "bowType"+bowType+
                "arrowType"+arrowType+
                "armor"+armor);
    }
}
