package src.model.database;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cat extends Pets{
    public Cat(String name, LocalDate birthDate, ArrayList<String> commands, String animalType) {
        super(name, birthDate, commands, animalType);
    }
}
