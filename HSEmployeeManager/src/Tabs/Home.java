package Tabs;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Home extends BorderPane {
    private static Home home;
    private Home(){
        FlowPane flow = new FlowPane();

        ImageView image = new ImageView("icon/female.png");
        ImageView image1 = new ImageView("icon/female.png");
        ImageView image2 = new ImageView("icon/female.png");
        Text t1 = new Text("Helly");
        Text t2 = new Text("Doll");
        Text t3 = new Text("Sam");

        VBox e1 = new VBox();
        e1.getChildren().addAll(image,t1);
        e1.setSpacing(5);

        VBox e2 = new VBox();
        e2.getChildren().addAll(image1,t2);
        e2.setSpacing(5);

        VBox e3 = new VBox();
        e3.getChildren().addAll(image2,t3);
        e3.setSpacing(5);

        List<VBox> list = new ArrayList<VBox>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        flow.setHgap(5);
        flow.getChildren().addAll(list);
        this.setCenter(flow);
    }

    public static Home getInstance() {
        home = new Home();

        return home;
    }
}
