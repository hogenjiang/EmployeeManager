package Hogen;

import Models.Employee;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class table extends Application{

	public static void main(String[] args) {
		Application.launch(args);

	}


	
	@Override
	public void start(Stage Stage) throws Exception {

		
		GridPane grid = new GridPane();
		
		
		
		Group group = new Group();
		group.setLayoutY(12);
		group.setTranslateX(13);
		group.getStyleClass().add("Button");
		
		
		Scene scene = new Scene(group,640,480);
		scene.getStylesheets().add("CSS/combo.css");
		
		final Label label = new Label("Address Book");
        label.setFont(new Font("Arial", 20));
 
//        table.setEditable(true);
 
        
        //Main
        TableColumn firstNameCol = new TableColumn("First Name");
        firstNameCol.setCellValueFactory(
        	    new PropertyValueFactory<Employee,String>("firstName")
        	);
        TableColumn lastNameCol = new TableColumn("Last Name");
        
        //Sub
//        TableColumn firstEmailCol = new TableColumn("Primary");
//        TableColumn secondEmailCol = new TableColumn("Secondary");
        
        TableColumn emailCol = new TableColumn("Email");
//        emailCol.getColumns().addAll(firstEmailCol, secondEmailCol);
        
//         Insets(10, 0, 0, 10));
//        vbox.getChildren().addAll(label, table);
// 
//        group.getChildren().addAll(vbox);
// 
//		
		
		
		
		
		Stage.setScene(scene);
		Stage.setResizable(false);
		Stage.show();
		
	}

}
