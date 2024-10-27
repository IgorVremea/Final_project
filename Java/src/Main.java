package src;

import src.model.Service;
import src.model.database.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        ArrayList<String> temp = new ArrayList<>();
        temp.add("Ty-gy-tyk");
        temp.add("Pleasati");
        service.addAnimalInList(new Cat("Kisa", LocalDate.of(2000, 1, 1), temp));
        service.addAnimalInList(new Dog("Doggy", LocalDate.of(2015, 9, 6), temp));

        service.showAnimalList();
    }
}
