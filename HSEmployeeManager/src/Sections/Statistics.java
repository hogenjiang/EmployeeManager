package Sections;

import javafx.scene.layout.BorderPane;

public class Statistics extends BorderPane {
    private static Statistics tab;
    private Statistics(){


    }

    public static Statistics getInstance(){
        tab = new Statistics();
        return tab;
    }
}
