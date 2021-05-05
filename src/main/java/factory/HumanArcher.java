package factory;

public class HumanArcher implements Archer{
    private int protection = 9;
    private int resistance = 8;
    private int steps = 28;
    private int health = 35;

    @Override
    public void saveArcher() {
        System.out.println("Save Human Archer");
    }

    
}
