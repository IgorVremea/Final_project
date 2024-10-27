package src.model.database;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Animal {
    private String name;
    private LocalDate birthDate;
    private ArrayList<String> Commands;
    private String AnimalType;

    public Animal(String name, LocalDate birthDate, ArrayList<String> commands, String animalType) {
        this.name = name;
        this.birthDate = birthDate;
        Commands = commands;
        AnimalType = animalType;
    }
}
