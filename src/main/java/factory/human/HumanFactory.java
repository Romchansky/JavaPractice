package factory.human;

import factory.*;

public class HumanFactory extends RaceFactory {
    @Override
    public Archer createArcher() {


        return new HumanArcher();

    }

    @Override
    public Rider createRider() {

        return new HumanRider();

    }

    @Override
    public Warrior createWarrior() {


        return new HumanWarrior();

    }

    @Override
    public Wizard createWizard() {


        return new HumanWizard();

    }
}
