package src.view.menuConsoleUI.commands;

import src.view.ConsoleUI;

public class ShowAnimalListCommand extends Command{
    public ShowAnimalListCommand(ConsoleUI consoleUI){
        super("Show animals list", consoleUI);
    }
    @Override
    public void execute() {
        getConsoleUI().showAnimalList();
    }
}
