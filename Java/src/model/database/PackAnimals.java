package src.model.database;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class PackAnimals extends Animal {
    public PackAnimals(String name, LocalDate birthDate, ArrayList<String> commands, String animalFamilyType) {
        super(name, birthDate, commands, animalFamilyType, "PackAnimal");
    }
}
