package src.view.menuConsoleUI;

import src.view.ConsoleUI;
import src.view.menuConsoleUI.commands.*;

import java.util.ArrayList;

public class MainMenu extends Menu{
    private ConsoleUI consoleUI;
    public MainMenu(ConsoleUI consoleUI){
        this.consoleUI = consoleUI;
        commands = new ArrayList<>();
        commands.add(new ShowAnimalListCommand(consoleUI));
        commands.add(new AddAnimalCommand(consoleUI));
        commands.add(new ShowAnimalsCommandsCommand(consoleUI));
        commands.add(new TeachAnimalCommandCommand(consoleUI));
        commands.add(new AddTestAnimalsCommand(consoleUI));

        commands.add(new StopCommand(consoleUI));
    }

    @Override
    public String menu() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n|||||||| MAIN MENU ||||||||\n");
        stringBuilder.append("Choose an option:\n");
        for(int i = 0; i < commands.size(); i++){
            stringBuilder.append(i+1);
            stringBuilder.append(". ");
            stringBuilder.append(commands.get(i).getDescription());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    @Override
    public void execute(int choice) {
        commands.get(choice-1).execute();
    }
}
