package src.model.database;

import java.util.ArrayList;

public class Animals {
    private ArrayList<Animal> animalList;
    public Animals(){
        animalList = new ArrayList<>();
    }
    public void addAnimal(Animal animal){
        animalList.add(animal);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Animals:\n\t");
        for(Animal animal : animalList){
            stringBuilder.append(animal);
            stringBuilder.append("\n\t");
        }
        stringBuilder.delete(stringBuilder.length()-2,stringBuilder.length()-1);
        return stringBuilder.toString();
    }
}
