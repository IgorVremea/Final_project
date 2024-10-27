package src.view.menuConsoleUI;

import src.view.menuConsoleUI.commands.Command;

import java.util.ArrayList;

public abstract class Menu {
    ArrayList<Command> commands;
    public abstract String menu();
    public abstract void execute(int choice);
    public int getSize(){
        return commands.size();
    }
}
