package src.view.menuConsoleUI.commands;

import src.view.ConsoleUI;

public class StopCommand extends Command{
    public StopCommand(ConsoleUI consoleUI){
        super("Stop", consoleUI);
    }
    @Override
    public void execute() {
        getConsoleUI().stop();
    }
}
