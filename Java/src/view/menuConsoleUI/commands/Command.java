package src.view.menuConsoleUI.commands;

import src.view.ConsoleUI;

public abstract class Command {
    private String description;
    private ConsoleUI consoleUI;
    Command(String description, ConsoleUI consoleUI){
        this.description = description;
        this.consoleUI = consoleUI;
    }
    public abstract void execute();
    public String getDescription() {return description;}
    public ConsoleUI getConsoleUI(){ return consoleUI; }
}
