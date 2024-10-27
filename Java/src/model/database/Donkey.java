package src.model.database;

import java.time.LocalDate;
import java.util.ArrayList;

public class Donkey extends PackAnimals{
    public Donkey(String name, LocalDate birthDate, ArrayList<String> commands, String animalFamilyType) {
        super(name, birthDate, commands, "Donkey");
    }
}
