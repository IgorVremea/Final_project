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
    public void showAnimalCommands(){
        int animalId = -1;
        System.out.println("Choose an animal:");
        showAnimalList();
        System.out.print("Your choice: ");
        String choiceStr = scanner.nextLine();
        if(checkChoice(choiceStr)) {
            animalId = Integer.parseInt(choiceStr);
            try {
                System.out.println(presenter.getAnimalCommands(animalId - 1));
            } catch (Exception e) {
                System.out.println("You entered wrong data!");
            }
        } else {
            System.out.println("You entered wrong data!");
        }
    }
    public void teachAnimalCommand(){
        System.out.println("Who do you want to teach a new command?");
        showAnimalList();
        System.out.print("Your choice: ");
        String choiceStr = scanner.nextLine();
        int animalId = -1;
        if(checkChoice(choiceStr)) {
            animalId = Integer.parseInt(choiceStr);
            System.out.println("What command should be added to the list?");
            String cmd = scanner.nextLine();
            try {
                presenter.teachAnimalCommand(animalId-1, cmd);
            } catch (Exception e){
                System.out.println("You entered wrong data!");
            }
        } else {
            System.out.println("You entered wrong data!");
        }
    }
    public void addAnimal(){
        System.out.println("\nEnter data according to this template:");
        System.out.println("Template:\tName\tAnimal's_Type\tBirth_date(YYYY-MM-DD)\tCommands(with ',')");
        System.out.println("Example:\tGosha\tHorse\t\t\t2019-05-15\t\t\t\tPrygat,Salto,Aport,No");
        System.out.print("Your data:");
        String data = scanner.nextLine();
        try{
            presenter.addAnimal(data);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void addTestAnimals(){
        presenter.addTestAnimals();
    }
}
