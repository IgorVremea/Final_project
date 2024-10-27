package src.model.database;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Pets extends Animal {

    public Pets(String name, LocalDate birthDate, ArrayList<String> commands, String animalType) {
        super(name, birthDate, commands, animalType);
    }
}
