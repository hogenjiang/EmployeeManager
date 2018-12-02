package Hogen.test;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;

import Sections.Add;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class table extends Application{

	public static void main(String[] args) {
		Application.launch(args);

	}
	private ImageView background4K = new ImageView();



	@Override
	public void start(Stage Stage) throws Exception {
		BorderPane root = new BorderPane();
		Image image2 = new Image("icon/background4K.png");
		background4K.setImage(image2);





		root.getChildren().add(background4K);


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
