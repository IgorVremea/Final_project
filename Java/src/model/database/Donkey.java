package src.model.database;

import java.time.LocalDate;
import java.util.ArrayList;

public class Donkey extends PackAnimals{
    public Donkey(String name, LocalDate birthDate, ArrayList<String> commands) {
        super(name, birthDate, commands, "Donkey");
    }
}
