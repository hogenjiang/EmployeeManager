package Sections;


import Models.Employee;
import Tables.EmployeeTable;
import Tables.ProvinceTable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;


import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static Sections.ViewAll.tableView2;


public class Home extends BorderPane {
    private static Home home;
    EmployeeTable table = new EmployeeTable();
    public static TableView tableView1 = new TableView();
    public static Add addSection = Add.getInstance();
    public static HBox hBox2 =new HBox();
    private Home(){

        ImageView imageView = new ImageView("icon/i1.png");
        imageView.setFitWidth(100);
        imageView.setFitHeight(100);

        ImageView imageView2 = new ImageView("icon/i2.png");
        imageView2.setFitWidth(100);
        imageView2.setFitHeight(100);

        ImageView imageView3 = new ImageView("icon/i3.png");
        imageView3.setFitWidth(100);
        imageView3.setFitHeight(100);



        FlowPane ff = new FlowPane();
        ff.setOrientation(Orientation.HORIZONTAL);
        ff.getChildren().addAll(imageView,imageView2,imageView3);
        ff.setHgap(8);



        
        TableColumn idCol = new TableColumn("ID");
        TableColumn firstNameCol = new TableColumn("First Name");
        TableColumn lastNameCol = new TableColumn("Last Name");

        tableView1.getColumns().addAll(idCol,firstNameCol,lastNameCol);

        idCol.setCellValueFactory(
                new PropertyValueFactory<Employee,String>("EmployeeId")
        );

        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<Employee,String>("FirstName")
        );

        lastNameCol.setCellValueFactory(
                new PropertyValueFactory<Employee,String>("LastName")
        );


        tableView1.setItems(FXCollections.observableArrayList(table.getAllEmployees()));
        tableView1.setMaxWidth(218);

            HBox root = new HBox();
            root.getChildren().add(ff);
            root.setAlignment(Pos.CENTER);

            VBox vv = new VBox(root);
            vv.setAlignment(Pos.CENTER);
            tableView1.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);


            Button delete = new Button();
            delete.getStyleClass().remove("button");
            delete.setGraphic(new ImageView("icon/minus.png"));
            delete.setOnAction(e-> {
                Stage newWindow = new Stage();
                    Label label = new Label("Are you sure delete the employees you selected?");

                    Button yes = new Button("Yes");
                    yes.setOnAction(e1->{
                        Employee employee = (Employee) tableView1.getSelectionModel().getSelectedItem();
                        table.deleteEmployee(employee);
                        tableView1.setItems(FXCollections.observableArrayList(table.getAllEmployees()));
                        newWindow.close();
                    });
                    Button no = new Button("No");
                    no.setOnAction(e2->{
                        newWindow.close();
                    });


                    HBox hh = new HBox(yes,no);
                    hh.setSpacing(8);
                    hh.setAlignment(Pos.CENTER);

                    VBox vBox = new VBox(label,hh);
                    vBox.setSpacing(8);
                    vBox.setAlignment(Pos.CENTER);

                    Scene secondScene = new Scene(vBox, 350, 150);

                    // New window (Stage)

                    newWindow.setTitle("Second Stage");
                    newWindow.setScene(secondScene);
                    if (tableView1.getSelectionModel().getSelectedItem() == null){

                    }else{
                        newWindow.show();
                    }

                });

            Button add = new Button();
            add.getStyleClass().remove("button");
            add.setGraphic(new ImageView("icon/positive.png"));
            add.setOnAction(e->{
                    hBox2.getChildren().remove(addSection);
                    hBox2.getChildren().add(addSection);
                    hBox2.setAlignment(Pos.BASELINE_LEFT);
                    this.setCenter(hBox2);
            });

            Button more = new Button();
            more.getStyleClass().remove("button");
            more.setGraphic(new ImageView("icon/more.png"));
            more.setOnAction(e->{

            });


            VBox vvv = new VBox(add,delete,more);
            vvv.setSpacing(7);

            HBox hh = new HBox(vvv,tableView1);
            hh.setSpacing(7);


//        ListView<Employ1ee> list = new ListView<>();
//        ArrayList<Employee> employees = table.getAllEmployees();
//        list.setItems(FXCollections.observableArrayList(employees));
//
//        VBox vBox = new VBox(list);

//        FlowPane flow = new FlowPane();
//        flow.setHgap(10);
//        flow.setVgap(20);
//        flow.getChildren().addAll(tableView1);
//        flow.setOrientation(Orientation.VERTICAL);
//        flow.setPadding(new Insets(10,0,20,10));


        this.setPadding(new Insets(0,0,0,15));
        this.setLeft(hh);
        this.setCenter(vv);


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