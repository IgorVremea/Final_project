package src.model.database;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Animal {
    private String name;
    private LocalDate birthDate;
    private ArrayList<String> commands;
    private String animalFamilyType;
    private String animalType;

    public Animal(String name, LocalDate birthDate, ArrayList<String> commands, String animalFamilyType, String animalType) {
        this.name = name;
        this.birthDate = birthDate;
        this.commands = commands;
        this.animalFamilyType = animalFamilyType;
        this.animalType = animalType;
    }

    public ArrayList<String> getCommands() {
        return commands;
    }
}
