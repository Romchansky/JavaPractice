package factory;

public class Main {

    public final static String SELECTED_RACE = "Elf";

    public static void main(String[] args) {

        RaceFactory factory = RaceFactory.of();

        factory.createArcher().saveArcher();
        factory.createRider().saveRider();
        factory.createWarrior().saveWarrior();
        factory.createWizard().saveWizard();

    }

}
