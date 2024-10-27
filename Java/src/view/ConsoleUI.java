package src.view;

import src.presenter.Presenter;
import src.view.menuConsoleUI.MainMenu;

import java.util.Scanner;

public class ConsoleUI implements View {
    private boolean isInProcess;
    private Presenter presenter;
    private MainMenu mainMenu;
    private Scanner scanner;
    public ConsoleUI(){
        this.presenter = new Presenter(this);
        mainMenu = new MainMenu(this);
        isInProcess = false;
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void start() {
        System.out.println("*Welcome message*");
        isInProcess = true;
        while(isInProcess){
            System.out.println(mainMenu.menu());
            System.out.print("Your choice: ");
            String choiceStr = scanner.nextLine();
            if(checkChoice(choiceStr)){
                int choice = Integer.parseInt(choiceStr);
                mainMenu.execute(choice);
            }
        }
    }
    public void stop(){
        isInProcess = false;
    }
    public boolean checkChoice(String choiceStr){
        if(choiceStr.matches("[0-9]*")){
            int choice = Integer.parseInt(choiceStr);
            return choice >= 1 && choice <= mainMenu.getSize();
        }
        return false;
    }
    public void showAnimalList(){
        System.out.println(presenter.getAnimalList());
    }
    public void ShowAnimalCommands(){
        int animalId = -1;
        System.out.println("Choose an animal:");
        showAnimalList();
        System.out.println("Your choice: ");
        String choiceStr = scanner.nextLine();
        if(checkChoice(choiceStr)){
            animalId = Integer.parseInt(choiceStr);
        }
        try{
            System.out.println(presenter.getAnimalCommands(animalId-1));
        }catch (Exception e){
            System.out.println("You entered wrong data!");
        }
    }
}
