package src.view.menuConsoleUI.commands;

import src.view.ConsoleUI;

public class AddTestAnimalsCommand extends Command{

    public AddTestAnimalsCommand(ConsoleUI consoleUI) {
        super("Add test animals", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().addTestAnimals();
    }
}
