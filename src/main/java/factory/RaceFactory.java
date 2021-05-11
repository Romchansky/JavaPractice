package factory;

import factory.dwarf.DwarfFactory;
import factory.elf.ElfFactory;
import factory.human.HumanFactory;
import factory.ork.OrkFactory;

public abstract class RaceFactory {

    private static RaceFactory race;

    protected RaceFactory() {};

    public static RaceFactory of() {
        if(race == null ) race = selectCharacter();
        return race;
    }

    private static RaceFactory selectCharacter() {
        return switch (Main.SELECTED_RACE) {
            case "Ork" -> new OrkFactory();
            case "Elf" -> new ElfFactory();
            case "Dwarf" -> new DwarfFactory();
            case "Human" -> new HumanFactory();
            default -> throw new RuntimeException("This race is not found");
        };
    }

    public abstract Archer createArcher();
    public abstract Rider createRider();
    public abstract Warrior createWarrior();
    public abstract Wizard createWizard();

}
