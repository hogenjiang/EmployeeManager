package Sections;


import Models.Employee;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;


import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class Home extends Pane {
    private static Home home;
    private Home(){


 //2
//        ObservableList<PieChart.Data> PieData =
//                FXCollections.observableArrayList(
//                        new PieChart.Data("Salary Employee", 64),
//                        new PieChart.Data("Hourly Employee", 36));
//        PieChart chart = new PieChart(PieData);
//
//        VBox vBox = new VBox(chart,flow);
//        vBox.setSpacing(5);

     ImageView employee = new ImageView();
     employee.setImage(new Image("icon/plus.png"));
        ImageView employee1 = new ImageView();
        employee1.setImage(new Image("icon/file.png"));

     VBox vBox = new VBox(employee);
     VBox vv = new VBox(employee1);


    List<VBox> list = new ArrayList<VBox>();
    list.add(vBox);
    list.add(vv);

this.setPadding(new Insets(10,10,10,10));

        this.getChildren().addAll(list);

    }

    public static Home getInstance() {
        home = new Home();
        return home;
    }

    private void applyCustomColorSequence(ObservableList<PieChart.Data> pieChartData, String... pieColors) {
        int i = 0;
        for (PieChart.Data data : pieChartData) {
            data.getNode().setStyle("-fx-pie-color: " + pieColors[i % pieColors.length] + ";");
            i++;
        }
    }

    private FlowPane addFlowPane(){
        FlowPane flow = new FlowPane();
        return flow;
    }

}
