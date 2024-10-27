package src.presenter;

import src.model.Service;
import src.model.database.Cat;
import src.model.database.Dog;
import src.view.View;

import java.time.LocalDate;
import java.util.ArrayList;

public class Presenter {
    View view;
    Service service;
    public Presenter(View view){
        this.view = view;
        this.service = new Service();
    }
    public String getAnimalList(){
        return service.getAnimalList();
    }
    public String getAnimalCommands(int animalId) throws Exception{
        return service.getAnimalCommands(animalId);
    }
    public void teachAnimalCommand(int animalId, String cmd) throws Exception{
        service.teachAnimalCommand(animalId, cmd);
    }
    public void addAnimal(String str) throws Exception{
        service.addAnimalInList(str);
    }
    public void addTestAnimals(){
        service.addTestAnimals();
    }
    public int getCounterVariable(){
        return service.getCounterVariable();
    }
}
