package factory.dwarf;

import factory.Wizard;

public class DwarfWizard implements Wizard {
    @Override
    public void saveWizard() {
        System.out.println("High! A'm a DwarfWizard");
    }
}
