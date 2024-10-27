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
        ///////////////// TEST /////////////////
//        ArrayList<String> temp = new ArrayList<>();
//        temp.add("Ty-gy-tyk");
//        temp.add("Pleasati");
//        service.addAnimalInList(new Cat("Kisa", LocalDate.of(2000, 1, 1), temp));
//        ArrayList<String> temp1 = new ArrayList<>(temp);
//        temp1.add("Sal'to");
//        service.addAnimalInList(new Dog("Doggy", LocalDate.of(2015, 9, 6), temp1));
        ///////////////// TEST /////////////////
    }
    public String getAnimalList(){
        return service.getAnimalList();
    }
    public String getAnimalCommands(int animalId) throws Exception{
        return service.getAnimalCommands(animalId);
    }
    public void teachAnimalCommand(int animalId, String cmd)throws Exception{
        service.teachAnimalCommand(animalId, cmd);
    }
}
