package Tabs;

import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.effect.Shadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;


import java.util.ArrayList;
import java.util.List;


public class Home extends BorderPane {
    private static Home home;
    private Home(){
        FlowPane flow = new FlowPane();

        ImageView image = new ImageView("icon/profile.jpg");

        ImageView image1 = new ImageView("icon/profile1.png");

        ImageView image2 = new ImageView("icon/profile2.png");


        Text t1 = new Text("Holly");
        Text t2 = new Text("Doll");
        Text t3 = new Text("Sam");

        VBox e1 = new VBox();
        e1.getChildren().addAll(image,t1);
        e1.setSpacing(7);
        e1.setPadding(new Insets(20,0,0,20));
//        e1.setBackground(new Background(new BackgroundFill(Color.BLUE,
//                CornerRadii.EMPTY, null)));
//        e1.addEventHandler(MouseEvent.MOUSE_ENTERED,
//                new EventHandler<MouseEvent>() {
//                    @Override public void handle(MouseEvent e) {
//                        e1.setScaleX(1.2);
//                        e1.setScaleY(1.2);
//
//                    }
//                });
//        e1.addEventHandler(MouseEvent.MOUSE_EXITED,
//                new EventHandler<MouseEvent>() {
//
//                    @Override public void handle(MouseEvent e) {
//                        e1.setScaleX(1);
//                        e1.setScaleY(1);
//                    }
//                });

        VBox e2 = new VBox();
        e2.getChildren().addAll(image1,t2);
        e2.setSpacing(7);
        e2.setPadding(new Insets(20,0,0,20));

        VBox e3 = new VBox();
        e3.getChildren().addAll(image2,t3);
        e3.setSpacing(7);
        e3.setPadding(new Insets(20,0,0,20));

        List<VBox> list = new ArrayList<VBox>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        flow.setHgap(5);
        flow.setBorder(Border.EMPTY);
        flow.getChildren().addAll(list);
        this.setCenter(flow);
    }

    public static Home getInstance() {
        home = new Home();

        return home;
    }


}
