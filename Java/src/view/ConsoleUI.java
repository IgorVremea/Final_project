package src.view;

import src.presenter.Presenter;

public class ConsoleUI implements View {
    private Presenter presenter;
    public ConsoleUI(){
        this.presenter = new Presenter(this);
    }

    @Override
    public void start() {

    }
}
