package src.view.menuConsoleUI.commands;

import src.view.ConsoleUI;

public class ShowAnimalsCommandsCommand extends Command{
    public ShowAnimalsCommandsCommand(ConsoleUI consoleUI){
        super("Show animal's commands", consoleUI);
    }
    @Override
    public void execute() {
        getConsoleUI().showAnimalCommands();
    }
}
