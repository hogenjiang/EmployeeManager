package Sections;


import Models.Employee;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.chart.PieChart;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;


import java.util.ArrayList;
import java.util.List;


public class Home extends BorderPane {
    private static Home home;
    private Home(){
//1
        FlowPane flow = new FlowPane();
        TableView table = new TableView();
        TableColumn firstNameCol = new TableColumn("First Name");
        TableColumn lastNameCol = new TableColumn("Last Name");
        TableColumn titleCol = new TableColumn("Job Title");
        table.getColumns().addAll(firstNameCol, lastNameCol, titleCol);

        final ObservableList<Employee> data = FXCollections.observableArrayList(

        );

        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<>("FirstName")
        );
        lastNameCol.setCellValueFactory(
                new PropertyValueFactory<>("LastName")
        );
        titleCol.setCellValueFactory(
                new PropertyValueFactory<>("Title")
        );

        table.setItems(data);
        table.setEditable(false);
        table.setPrefSize(255,50);



        List<String> list = new ArrayList<String>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
        flow.setHgap(5);
//        for (int i = 0;i<90){
//            flow.getChildren().add(list)
//        }




 //2
        ObservableList<PieChart.Data> PieData =
                FXCollections.observableArrayList(
                        new PieChart.Data("Salary Employee", 64),
                        new PieChart.Data("Hourly Employee", 36));
        PieChart chart = new PieChart(PieData);

        VBox vBox = new VBox(chart,flow);
        vBox.setSpacing(5);


        HBox hBox = new HBox();
        hBox.getChildren().addAll(table,chart);
        hBox.setPadding(new Insets(10,0,0,10));


        this.setCenter(hBox);
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
