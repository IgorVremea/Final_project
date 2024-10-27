package src.model.database;

import src.model.exceptions.AddAnimalErrorException;

public class CounterAnimal implements AutoCloseable{
    int count;
    public CounterAnimal(){
        count = 0;
    }
    public void add(){
        count++;
    }
    @Override
    public void close() throws Exception {
    }
    public int getCount(){
        return count;
    }
}
