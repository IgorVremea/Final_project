package src.model.database;

import java.time.LocalDate;
import java.util.ArrayList;

public class Hamster extends Pets{
    public Hamster(String name, LocalDate birthDate, ArrayList<String> commands, String animalFamilyType) {
        super(name, birthDate, commands, "Hamster");
    }
}
