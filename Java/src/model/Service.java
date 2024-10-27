package src.model;

import src.model.database.*;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Service {
    private Animals animals;
    private CounterAnimal counterAnimal;
    public Service(){
        animals = new Animals();
        counterAnimal = new CounterAnimal();
    }
    public void addAnimalInList(Animal animal){
        try(CounterAnimal temp = counterAnimal){
            animals.addAnimal(animal);
            temp.add();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void addAnimalInList(String str) throws Exception{
        String[] parsedStr = str.split(" ");
        if(parsedStr.length < 4 || parsedStr.length > 4) throw new IOException("Wrong data format");
        String[] cmds = parsedStr[3].split(",");
        ArrayList<String> tempCmds = new ArrayList<>();
        for(String temp : cmds){
            tempCmds.add(temp);
        }
        if(parsedStr[1].equals("Camel")){
            addAnimalInList(new Camel(parsedStr[0], LocalDate.parse(parsedStr[2]), tempCmds));
        } else if (parsedStr[1].equals("Cat")) {
            addAnimalInList(new Cat(parsedStr[0], LocalDate.parse(parsedStr[2]), tempCmds));
        } else if (parsedStr[1].equals("Dog")) {
            addAnimalInList(new Dog(parsedStr[0], LocalDate.parse(parsedStr[2]), tempCmds));
        } else if (parsedStr[1].equals("Hamster")) {
            addAnimalInList(new Hamster(parsedStr[0], LocalDate.parse(parsedStr[2]), tempCmds));
        } else if (parsedStr[1].equals("Horse")) {
            addAnimalInList(new Horse(parsedStr[0], LocalDate.parse(parsedStr[2]), tempCmds));
        } else if (parsedStr[1].equals("Donkey")) {
            addAnimalInList(new Donkey(parsedStr[0], LocalDate.parse(parsedStr[2]), tempCmds));
        } else  {
            throw new IOException("Wrong animal type");
        }
    }
    public void addTestAnimals(){
        try{
            addAnimalInList("Gosha Horse 2010-01-30 Prygat,Salto,Aport,No");
            addAnimalInList("Liosha Cat 2019-05-15 Prygat");
            addAnimalInList("Masha Camel 2018-05-15 Aport,No");
            addAnimalInList("Saha Donkey 2017-10-15 Salto,Aport,No");
            addAnimalInList("Daha Dog 2016-12-12 Salto,Aport");
            addAnimalInList("Pasha Hamster 2024-01-11 Aport");
        } catch (Exception e){

        }
    }
    public String getAnimalList(){
        return animals.toString();
    }
    public String getAnimalCommands(int animalId) throws Exception{
        return animals.getAnimal(animalId).getCommands().toString();
    }
    public void teachAnimalCommand(int animalId, String cmd) throws Exception {
        animals.getAnimal(animalId).addCommand(cmd);
    }
    public int getCounterVariable(){
        return counterAnimal.getCount();
    }

}
