package Sections;

import Models.Employee;
import Tables.EmployeeTable;
import javafx.geometry.Orientation;
import javafx.scene.Node;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;


import java.util.ArrayList;
import java.util.List;


public class ViewAll extends BorderPane {

    EmployeeTable table = new EmployeeTable();


    private static ViewAll tab;
    public ViewAll(){
        addFlow();

        this.setCenter(addFlow());

    }

    public static ViewAll getInstance() {
        tab = new ViewAll();
        return tab;
    }

    private FlowPane addFlow(){







        ArrayList<Employee> employee = table.getAllEmployees();


        FlowPane flowPane = new FlowPane();

            for(int i=0; i<employee.size();i++){
                ArrayList<VBox> list = new ArrayList<VBox>();
                Text t1 = new Text();
                VBox vbox = new VBox();
//                ImageView pages[] = new ImageView[8];
//                pages[i] = new ImageView(
//                        new Image(""));



                t1.setText(employee.get(i).toString());
                vbox.getChildren().addAll(t1);
                list.add(vbox);
                flowPane.getChildren().addAll(list);
            }









        flowPane.setOrientation(Orientation.VERTICAL);
        return flowPane;
    }
}
