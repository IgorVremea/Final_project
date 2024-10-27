package src.model.database;

import java.time.LocalDate;
import java.util.ArrayList;

public class Camel extends PackAnimals{
    public Camel(String name, LocalDate birthDate, ArrayList<String> commands, String animalFamilyType) {
        super(name, birthDate, commands, "Camel");
    }
}
