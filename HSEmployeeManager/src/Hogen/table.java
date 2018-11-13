package Hogen;

import java.awt.Desktop;
import java.io.File;

import Models.Employee;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
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
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class table extends Application{

	public static void main(String[] args) {
		Application.launch(args);

	}
	private ImageView background4K = new ImageView();
	FileChooser filechooser = new FileChooser();
	Desktop desktop = Desktop.getDesktop();
	private ImageView profile = new ImageView();
	
	
	Image profileImage = new Image("profile.jpg");
	
	
	DropShadow shadow = new DropShadow();
	
	@Override
	public void start(Stage Stage) throws Exception {
		BorderPane root = new BorderPane();
		Image image2 = new Image("background4K.png");
		background4K.setImage(image2);
		
		profile.setImage(profileImage);
		profile.setFitHeight(213);
		profile.setFitWidth(160);
		
		//Information
		
		
		
		
		Button choose = new Button("Open");
		choose.getStyleClass().add("Button");
		choose.addEventHandler(MouseEvent.MOUSE_ENTERED, 
			    new EventHandler<MouseEvent>() {
	        @Override public void handle(MouseEvent e) {
	        	choose.setEffect(shadow);
	        }
	});
		choose.addEventHandler(MouseEvent.MOUSE_EXITED, 
			    new EventHandler<MouseEvent>() {

	        @Override public void handle(MouseEvent e) {
	        	choose.setEffect(null);
	        }
	});
		choose.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				configureFileChooser(filechooser);	
				File file = filechooser.showOpenDialog(Stage);
				if (file != null) {
					//profile
					
					profileImage = new Image(file.toURI().toString());
					profile.setImage(profileImage);
					profile.setFitHeight(213);
					profile.setFitWidth(160);
    				
                }
			}
			
		});
		
		
		
		VBox v = new VBox(profile,choose);
		v.setSpacing(30);
	    v.setAlignment(Pos.TOP_CENTER);
	    
	    
	    TextField name1 = new TextField() ;
	    TextField age1 = new TextField("") ;
	    TextField address1 = new TextField("") ;
	    TextField postion1 = new TextField("") ;
	    TextField phone1 = new TextField("") ;
	    TextField email1 = new TextField("") ;
	    
	    Button save = new Button("Save");
		
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10,0,0,80));
		grid.setHgap(20);
		grid.setVgap(20);
		grid.add(name1, 0, 0);
		name1.setPromptText("Name");
		grid.add(age1, 1, 0);
		age1.setPromptText("Age");
		grid.add(address1, 0, 1);
		address1.setPromptText("Address");
		grid.add(postion1, 1, 1);
		postion1.setPromptText("Postion");
		grid.add(phone1, 0, 2);
		phone1.setPromptText("Phone");
		grid.add(email1, 1, 2);
		email1.setPromptText("Email");
		
	
	    
	    HBox h = new HBox();
	    h.setPadding(new Insets(80,80,80,80));
	    h.getChildren().addAll(v,grid);
		
		root.getChildren().add(background4K);
		root.setCenter(h);
		
		
		Scene scene = new Scene(root,1024,768);
		scene.getStylesheets().add("CSS/combo.css");
		Stage.setScene(scene);
		Stage.setResizable(true);
		Stage.show();
		
	}

	
	private static void configureFileChooser(
	        final FileChooser fileChooser) {      
	            fileChooser.setTitle("View Pictures");
	            fileChooser.setInitialDirectory(
	                new File(System.getProperty("user.home"))
	            );                 
	            fileChooser.getExtensionFilters().addAll(
	                new FileChooser.ExtensionFilter("All Images", "*.*"),
	                new FileChooser.ExtensionFilter("JPG", "*.jpg"),
	                new FileChooser.ExtensionFilter("PNG", "*.png")
	            );
	    }
	
}
