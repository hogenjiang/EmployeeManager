package Tabs;

import javafx.scene.layout.BorderPane;

public class Statistics extends BorderPane {
    private static Statistics tab;
    private Statistics(){

//        this.setLeft();
//        this.setCenter();
    }

    public static Statistics getInstance(){
        tab = new Statistics();
        return tab;
    }
}
