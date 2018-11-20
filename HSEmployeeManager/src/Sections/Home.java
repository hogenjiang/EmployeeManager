package Sections;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.chart.PieChart;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;


import java.util.ArrayList;
import java.util.List;


public class Home extends Pane {
    private static Home home;
    private Home(){
//1
        FlowPane flow = new FlowPane();
        TableView table = new TableView();
        TableColumn firstNameCol = new TableColumn("First Name");
        TableColumn lastNameCol = new TableColumn("Last Name");
        TableColumn titleCol = new TableColumn("Job Title");
        table.getColumns().addAll(firstNameCol, lastNameCol, titleCol);

//        final ObservableList<Employ_home> data = FXCollections.observableArrayList(
//                new Employ_home("Hello", "Kitty", "Cook"),
//                new Employ_home("Hello", "Kitty", "Cook"),
//                new Employ_home("Hello", "Kitty", "Cook"),
//                new Employ_home("Hello", "Kitty", "Cook"),
//                new Employ_home("Hello", "Kitty", "Cook"),
//                new Employ_home("Hello", "Kitty", "Cook"),
//                new Employ_home("Hello", "Kitty", "Cook"),
//                new Employ_home("Hello", "Kitty", "Cook"),
//                new Employ_home("Hello", "Kitty", "Cook"),
//                new Employ_home("Hello", "Kitty", "Cook"),
//                new Employ_home("Hello", "Kitty", "Cook"),
//                new Employ_home("Hello", "Kitty", "Cook"),
//                new Employ_home("Hello", "Kitty", "Cook"),
//                new Employ_home("Hello", "Kitty", "Cook"),
//                new Employ_home("Hello", "Kitty", "Cook"),
//                new Employ_home("Hello", "Kitty", "Cook"),
//                new Employ_home("Hello", "Kitty", "Cook"),
//                new Employ_home("Hello", "Kitty", "Cook"),
//                new Employ_home("Hello", "Kitty", "Cook"),
//                new Employ_home("Hello", "Kitty", "Cook"),
//                new Employ_home("Hello", "Kitty", "Cook"),
//                new Employ_home("Hello", "Kitty", "Cook"),
//                new Employ_home("Hello", "Kitty", "Cook"),
//                new Employ_home("Hello", "Kitty", "Cook"),
//                new Employ_home("Hello", "Kitty", "Cook"),
//                new Employ_home("Hello", "Kitty", "Cook"),
//                new Employ_home("Hello", "Kitty", "Cook"),
//                new Employ_home("Hello", "Kitty", "Cook"),
//                new Employ_home("Hello", "Kitty", "Cook"),
//                new Employ_home("Hello", "Kitty", "Cook"),
//                new Employ_home("Hello", "Kitty", "Cook"),
//                new Employ_home("Hello", "Kitty", "Cook"),
//                new Employ_home("Hello", "Kitty", "Cook"),
//                new Employ_home("Hello", "Kitty", "Cook"),
//                new Employ_home("Hello", "Kitty", "Cook"),
//                new Employ_home("Hello", "Kitty", "Cook"),
//                new Employ_home("Hello", "Kitty", "Cook"),
//                new Employ_home("Hello", "Kitty", "Cook")
//
//
//        );

        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<>("FirstName")
        );
        lastNameCol.setCellValueFactory(
                new PropertyValueFactory<>("LastName")
        );
        titleCol.setCellValueFactory(
                new PropertyValueFactory<>("Title")
        );

//        table.setItems(data);
        table.setEditable(false);
        table.setMinWidth(259);
        table.setMinHeight(700);

        VBox vBox = new VBox();
        vBox.setPadding(new Insets(10,0,0,6));

        List<TableView> list = new ArrayList<TableView>();
        flow.setHgap(5);
        flow.getChildren().addAll(list);
        vBox.relocate(10,10);



 //2
        ObservableList<PieChart.Data> PieData =
                FXCollections.observableArrayList(
                        new PieChart.Data("Salary Employee", 64),
                        new PieChart.Data("Hourly Employee", 36));
        PieChart chart = new PieChart(PieData);
//        chart.setLabelLineLength(7);
//        chart.setPrefSize(400,400);

        VBox vBox1 = new VBox(chart);
        vBox1.setPadding(new Insets(10,0,0,30));
        vBox1.relocate(240,0);
        this.getChildren().addAll(vBox, vBox1);
        this.getStylesheets().add("CSS/table.css");
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


}
