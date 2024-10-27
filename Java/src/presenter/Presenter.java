package src.presenter;

import src.model.Service;
import src.view.View;

public class Presenter {
    View view;
    Service service;
    public Presenter(View view){
        this.view = view;
        this.service = new Service();
    }
}
