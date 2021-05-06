package factory;

public class HumanWizard implements Wizard {
    private int protection = 9;
    private int resistance = 11;
    private int steps = 28;
    private int health = 36;

    @Override
    public void saveWizard() {
        System.out.println("Save Human Wizard");
    }
}
