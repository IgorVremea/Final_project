package src.view.menuConsoleUI.commands;

import src.view.ConsoleUI;

public class TeachAnimalCommandCommand extends Command{
    public TeachAnimalCommandCommand(ConsoleUI consoleUI){
        super("Teach animal a new command", consoleUI);
    }
    @Override
    public void execute() {
        getConsoleUI().teachAnimalCommand();
    }
}
