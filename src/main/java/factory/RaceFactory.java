package factory;

import static factory.Main.SELECTED_RACE;

public abstract class RaceFactory {

    private static RaceFactory race;

    protected RaceFactory() {};

    public static RaceFactory of() {
        if(race == null ) race = selectCharacter(SELECTED_RACE);
        return race;
    }

    private static RaceFactory selectCharacter(String race) {
        switch (race) {
            case "Ork": return new OrkFactory();
            case "Elf": return new ElfFactory();
            case "Dwarf": return new DwarfFactory();
            case "Human": return  new HumanFactory();
            default: throw new RuntimeException("This race is not found");
        }
    }

    public abstract Archer createArcher();
    public abstract Rider createRider();
    public abstract Warrior createWarrior();
    public abstract Wizard createWizard();

}
