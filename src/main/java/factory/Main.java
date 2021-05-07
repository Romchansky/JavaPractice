package factory;

public class Main {

    public final static String SELECTED_RACE = "Dwarf";

    public static void main(String[] args) {

        RaceFactory raceFactory = RaceFactory.of();

        raceFactory.createWarrior().saveWarrior();
        raceFactory.createRider().saveRider();
        raceFactory.createArcher().saveArcher();
        raceFactory.createWizard().saveWizard();
    }


}
