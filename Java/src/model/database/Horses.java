package src.model.database;

import java.time.LocalDate;
import java.util.ArrayList;

public class Horses extends PackAnimals{
    public Horses(String name, LocalDate birthDate, ArrayList<String> commands, String animalFamilyType) {
        super(name, birthDate, commands, "Horse");
    }
}
