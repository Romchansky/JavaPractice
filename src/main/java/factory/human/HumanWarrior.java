package factory.human;

import factory.Warrior;

public class HumanWarrior implements Warrior {
    private int protection = 13;
    private int resistance = 11;
    private int steps = 36;
    private int health = 70;

    @Override
    public void saveWarrior() {
        System.out.println("Save Human Warrior");
    }
}
