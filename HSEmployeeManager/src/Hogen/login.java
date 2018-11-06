package Hogen;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class login extends Application{
	

	private ImageView imageview = new ImageView();
	private ImageView background = new ImageView();
	private Scene scene1, scene2;

	public static void main(String[] args) {
		Application.launch(args);

	}
	
	public login() {
		super();
	}
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		BorderPane root = new BorderPane();
		Font font = Font.font ("Arial", FontWeight.BOLD, 11);
		Font signFont = Font.font ("Arial", FontWeight.BOLD, 10);
		DropShadow shadow = new DropShadow();
		
		//Top - logo
		Image image = new Image("title.png");
		imageview.setImage(image);
		Image image1 = new Image("background.png");
		background.setImage(image1);
		
		//Center - userName, password, login
		TextField username = new TextField();
		username.setPromptText("Username");
		username.setStyle("-fx-background-color: #ffffff;");
		PasswordField password = new PasswordField();
		password.setPromptText("Password");
		password.setStyle("-fx-background-color: #ffffff;");
		Button login = new Button("Login");
		login.setStyle("-fx-font-size: 16; -fx-base: #2c5185; -fx-background-color: #2c5185; -fx-border-radius: 5;");
		login.addEventHandler(MouseEvent.MOUSE_ENTERED, 
			    new EventHandler<MouseEvent>() {
	        @Override public void handle(MouseEvent e) {
	        	login.setEffect(shadow);
	        }
	});
		login.addEventHandler(MouseEvent.MOUSE_EXITED, 
			    new EventHandler<MouseEvent>() {

	        @Override public void handle(MouseEvent e) {
	        	login.setEffect(null);
	        }
	});

		//Bottom - Sign up
		Text tip = new Text("Don't have an account?");
		tip.setFont(font);
		Button signup = new Button("Sign Up");
		signup.setBackground(Background.EMPTY);
		signup.setFont(signFont);
		signup.setAlignment(Pos.TOP_CENTER);
		signup.setTextFill(Color.rgb(44, 81, 133));
		signup.addEventHandler(MouseEvent.MOUSE_ENTERED, 
			    new EventHandler<MouseEvent>() {
	        @Override public void handle(MouseEvent e) {
	        	signup.setEffect(shadow);
	        }
	});
		signup.addEventHandler(MouseEvent.MOUSE_EXITED, 
			    new EventHandler<MouseEvent>() {
			@Override public void handle(MouseEvent e) {
				signup.setEffect(null);
		        }
		});
		
			//Animation
	//		ScaleTransition Transition = new ScaleTransition(Duration.millis(500), signup); 
	//		Transition.setByX(.8);
	//		Transition.setByY(.8);
	//		Transition.setAutoReverse(true); 
	//		Transition.play(); 
		
		//Pane
		HBox hbox = new HBox(imageview);
		hbox.setPadding(new Insets(60, 0, 0, 100));
		
		VBox vbox = new VBox(username, password,login); 
		vbox.setAlignment(Pos.CENTER);
		vbox.setPadding(new Insets(0, 200, 100, 200));
		vbox.setSpacing(15);

		GridPane grid = new GridPane();
		grid.setPadding(new Insets(0, 0, 40, 230));
		grid.add(tip, 2, 2); //horizontal, vertical
		grid.add(signup, 3, 2);
		
		root.getChildren().add(background);
		root.setTop(hbox);
		root.setCenter(vbox);
		root.setBottom(grid);
		
		
		
		//function
				login.setOnAction(new EventHandler<ActionEvent>() {
		            @Override public void handle(ActionEvent e) {
		            	
		            	primaryStage.setScene(scene2);
		                primaryStage.setResizable(false);
		                primaryStage.show();
		                
		            }
		        });
				
				signup.setOnAction(new EventHandler<ActionEvent>() {
		            @Override public void handle(ActionEvent e) {
		  

		            	   
		            	
		            }
		        });
		//Scene 2
		StackPane test = new StackPane();
		test.getChildren().add(grid);
		scene2 = new Scene(test, 1280, 720);
		//Scene 1
		scene1 = new Scene(root, 640, 480);
		primaryStage.setScene(scene1);
		primaryStage.setResizable(false);
        primaryStage.show();
        
        
        
		
		
	}

}
