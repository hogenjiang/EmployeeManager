package Hogen;

import java.awt.Desktop;
import java.io.File;
import Hogen.table;

import Models.Employee;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;



public class card extends Application{

	public static void main(String[] args) {
		Application.launch(args);

	}
	private ImageView background4K = new ImageView();
	private ImageView profile = new ImageView();
	
	
	Image profileImage = new Image("profile.jpg");
	

    public Scene scene1;


	
	@Override
	public void start(Stage Stage) throws Exception {
		BorderPane root = new BorderPane();
		StackPane pane = new StackPane();
		Image image2 = new Image("background4K.png");
		background4K.setImage(image2);
		
		profile.setImage(profileImage);
		profile.setFitHeight(213);
		profile.setFitWidth(160);
		
		Label name = new Label("Dsad");
		Button sd = new Button();

        sd.setOnAction(e -> {


            Stage.setScene(scene1);
            Stage.show();
        });



		
		
		pane.setPadding(new Insets(5,5,5,5));
		pane.getChildren().addAll(profile,sd);
		pane.getChildren().add(name);
		
		
		
		root.getChildren().add(background4K);
		root.setCenter(pane);
		root.setBottom(sd);
		

		
		scene1 = new Scene(root,1024,768);
		scene1.getStylesheets().add("CSS/combo.css");
		Stage.setResizable(true);
		Stage.setScene(scene1);
		Stage.show();
		
	}

	
	
	
}
