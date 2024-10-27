package src.view.menuConsoleUI.commands;

import src.view.ConsoleUI;

public class AddAnimalCommand extends Command{
    public AddAnimalCommand(ConsoleUI consoleUI){
        super("Add an animal in list", consoleUI);
    }
    @Override
    public void execute() {
        getConsoleUI().addAnimal();
    }
}
