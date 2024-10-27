package src.model;

import src.model.database.Animal;
import src.model.database.Animals;

public class Service {
    public Animals animals;
    public Service(){
        animals = new Animals();
    }
    public void addAnimalInList(Animal animal){
        animals.addAnimal(animal);
    }
    public String getAnimalList(){
        return animals.toString();
    }
    public String getAnimalCommands(int animalId) throws Exception{
        return animals.getAnimal(animalId).getCommands().toString();
    }
}
