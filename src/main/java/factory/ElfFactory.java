package factory;

public class ElfFactory extends RaceFactory {

    @Override
    public Archer createArcher() {
        return new ElfArcher();
    }

    @Override
    public Rider createRider() {
        return new ElfRider();
    }

    @Override
    public Warrior createWarrior() {
        return new ElfWarrior();
    }

    @Override
    public Wizard createWizard() {
        return new ElfWizard();
    }
}
