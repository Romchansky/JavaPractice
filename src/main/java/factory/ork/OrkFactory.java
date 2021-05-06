package factory.ork;

import factory.*;

public class OrkFactory extends RaceFactory {
    @Override
    public Archer createArcher() {
        return new OrkArcher();
    }
    @Override
    public Rider createRider() {
        return new OrkRider ();
    }
    @Override
    public Warrior createWarrior() {
        return new OrkWarrior();
    }
    @Override
    public Wizard createWizard() {
        return new OrkWizard();
    }
}
