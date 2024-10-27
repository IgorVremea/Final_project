package src.model.database;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Pets extends Animal {
    private String animalType;
    public Pets(String name, LocalDate birthDate, ArrayList<String> commands, String animalFamilyType) {
        super(name, birthDate, commands, animalFamilyType, "Pet");
    }
}
