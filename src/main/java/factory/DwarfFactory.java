package factory;

public class DwarfFactory extends RaceFactory {
    @Override
    public Archer createArcher() {
        return new DwarfArcher();
    }

    @Override
    public Rider createRider() {return new DwarfRider();    }

    @Override
    public Warrior createWarrior() {
        return new DwarfWarrior();
    }

    @Override
    public Wizard createWizard() {
        return new DwarfWizard();
    }
}
