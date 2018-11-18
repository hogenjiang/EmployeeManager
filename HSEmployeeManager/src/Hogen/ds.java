package Hogen;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ds extends Tab {

    private static ds tab;

    private ImageView profile = new ImageView();

  private ds(){
        Image img = new Image("icon/profile.jpg");
        profile.setImage(img);


        BorderPane tabPane = new BorderPane();
        tabPane.setRotate(90.0);
        tabPane.setMaxWidth(15);
        tabPane.setCenter(profile);




        this.setContent(tabPane);

    }


    public static ds getInstance() {
        if(tab == null) {
            tab = new ds();
        }
        return tab;
    }
}
