package src.model.database;

import java.time.LocalDate;
import java.util.ArrayList;

public class Horse extends PackAnimals{
    public Horse(String name, LocalDate birthDate, ArrayList<String> commands) {
        super(name, birthDate, commands, "Horse");
    }
}
