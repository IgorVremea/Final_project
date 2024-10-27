package src.view.menuConsoleUI.commands;

import src.view.ConsoleUI;

public class ShowCounterVariableCommand extends Command {
    public ShowCounterVariableCommand(ConsoleUI consoleUI){
        super("Show counter variable", consoleUI);
    }
    @Override
    public void execute() {
        getConsoleUI().showCounterVariable();
    }
}
