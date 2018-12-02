package Sections;

import Models.Employee;
import Tables.EmployeeTable;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
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

//            ListView<Employee> list = new ListView<>();
//            ArrayList<Employee> employees = table.getAllEmployees();
//            list.setItems(FXCollections.observableArrayList(employees));
//
//        VBox vBox = new VBox(list);
//        vBox.setPadding(new Insets(10,0,0,10));

        TableView tableView = new TableView();
        TableColumn idCol = new TableColumn("ID");
        TableColumn firstNameCol = new TableColumn("First Name");
        TableColumn lastNameCol = new TableColumn("Last Name");
        TableColumn emailCol = new TableColumn("Email");

        TableColumn salaryCol = new TableColumn("Salary");
        TableColumn titleCol = new TableColumn("Title");
        TableColumn departmentCol = new TableColumn("Department");
        TableColumn addressCol = new TableColumn("Address");
        addressCol.setMaxWidth(250);
        TableColumn phoneCol = new TableColumn("Phone");
        TableColumn genderCol = new TableColumn("Gender");
        TableColumn birthDateCol = new TableColumn("BirthDate");
        TableColumn startCol = new TableColumn("StartDate");
        TableColumn endCol = new TableColumn("EndDate");
        TableColumn statusCol = new TableColumn("Status");
        TableColumn cityCol = new TableColumn("City");
        TableColumn proCol = new TableColumn("Province");

        tableView.getColumns().addAll(idCol,firstNameCol,lastNameCol,emailCol,
                salaryCol,titleCol,departmentCol,addressCol,phoneCol,genderCol,
                birthDateCol,startCol,endCol,statusCol,cityCol,proCol);

        idCol.setCellValueFactory(
                new PropertyValueFactory<Employee,String>("EmployeeId")
        );

        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<Employee,String>("FirstName")
        );

        lastNameCol.setCellValueFactory(
                new PropertyValueFactory<Employee,String>("LastName")
        );

        emailCol.setCellValueFactory(
                new PropertyValueFactory<Employee,String>("Email")
        );

        salaryCol.setCellValueFactory(
                new PropertyValueFactory<Employee,String>("Salary")
        );

        titleCol.setCellValueFactory(
                new PropertyValueFactory<Employee,String>("Title")
        );

        departmentCol.setCellValueFactory(
                new PropertyValueFactory<Employee,String>("Department")
        );

        addressCol.setCellValueFactory(
                new PropertyValueFactory<Employee,String>("Address")
        );

        phoneCol.setCellValueFactory(
                new PropertyValueFactory<Employee,String>("Phone")
        );

        genderCol.setCellValueFactory(
                new PropertyValueFactory<Employee,String>("Gender")
        );

        birthDateCol.setCellValueFactory(
                new PropertyValueFactory<Employee,String>("BirthDate")
        );

        startCol.setCellValueFactory(
                new PropertyValueFactory<Employee,String>("StartDate")
        );

        endCol.setCellValueFactory(
                new PropertyValueFactory<Employee,String>("EndDate")
        );

        statusCol.setCellValueFactory(
                new PropertyValueFactory<Employee,String>("Status")
        );

        cityCol.setCellValueFactory(
                new PropertyValueFactory<Employee,String>("City")
        );

        proCol.setCellValueFactory(
                new PropertyValueFactory<Employee,String>("Province")
        );



        tableView.setItems(FXCollections.observableArrayList(table.getAllEmployees()));
        tableView.setMinWidth(1171);
        tableView.setMaxWidth(1505);


        HBox tablebox = new HBox(tableView);
        tablebox.setAlignment(Pos.CENTER);

        this.setCenter(tableView);

    }

    public static ViewAll getInstance() {
        tab = new ViewAll();
        return tab;
    }


}
