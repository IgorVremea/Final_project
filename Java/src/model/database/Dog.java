package src.model.database;

import java.time.LocalDate;
import java.util.ArrayList;

public class Dog extends Pets{
    public Dog(String name, LocalDate birthDate, ArrayList<String> commands, String animalFamilyType) {
        super(name, birthDate, commands, "Dog");
    }
}
