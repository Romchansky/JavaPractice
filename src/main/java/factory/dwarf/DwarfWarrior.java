package factory.dwarf;

import factory.Warrior;

public class DwarfWarrior implements Warrior {
    @Override
    public void saveWarrior() {
        System.out.println("High! A'm a DwarfWarrior");
    }
}
