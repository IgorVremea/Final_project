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
    public void showAnimalList(){
        System.out.println(animals);
    }
}
