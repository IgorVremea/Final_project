package src.model.database;

import java.util.ArrayList;

public class Animals {
    private ArrayList<Animal> animalList;
    public Animals(){
        animalList = new ArrayList<>();
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if(animalList.isEmpty()){
            stringBuilder.append("There's no animals in the list");
        } else {
            stringBuilder.append("Animals:\n\t");
            int id = 1;
            for(Animal animal : animalList) {
                stringBuilder.append(id++);
                stringBuilder.append(". ");
                stringBuilder.append(animal);
                stringBuilder.append("\n\t");
            }
            stringBuilder.delete(stringBuilder.length()-2,stringBuilder.length()-1);
        }
        return stringBuilder.toString();
    }

    public void addAnimal(Animal animal){
        animalList.add(animal);
    }
    public Animal getAnimal(int id) throws Exception{
        return animalList.get(id);
    }

}
