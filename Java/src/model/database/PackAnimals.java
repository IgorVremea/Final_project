package src.model.database;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class PackAnimals extends Animal {
    public PackAnimals(String name, LocalDate birthDate, ArrayList<String> commands, String animalType) {
        super(name, birthDate, commands, animalType);
    }
}
