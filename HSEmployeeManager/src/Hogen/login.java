package Hogen;

import Tabs.AddItemTab;
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
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class login extends Application{
	

	private ImageView imageview = new ImageView();
	private ImageView background = new ImageView();
	private ImageView background1 = new ImageView();
	private Scene scene1, scene2;

	public static void main(String[] args) {
		Application.launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
//SCENE 1
		BorderPane root = new BorderPane();
		Font font = Font.font ("Arial", FontWeight.BOLD, 11);
		Font signFont = Font.font ("Arial", FontWeight.BOLD, 10);
		DropShadow shadow = new DropShadow();
		
		//Top - logo
		Image image = new Image("title.png");
		imageview.setImage(image);
		Image image1 = new Image("background.png");
		background.setImage(image1);
		Image image2 = new Image("background.png");
		background1.setImage(image2);
		
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
		
		root.getChildren().add(background1);
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



//SCENE 2

		//build menu bar, item, create tabPane, tab, borderPane, top, center
		MenuBar menu = new MenuBar();
		Menu fileMenu = new Menu("File");
		Menu viewMenu = new Menu("View");
		Menu helpMenu = new Menu("Help");
		Menu newItem = new Menu("New");

		MenuItem salaryItem = new MenuItem("Salary Employee");
		MenuItem hourlyItem = new MenuItem("Hourly Employee");
		MenuItem saveItem = new MenuItem("Save");
		MenuItem saveAsItem = new MenuItem("Save As");
		MenuItem tableItem = new MenuItem("Table");
		MenuItem graphItem = new MenuItem("Graph");

		fileMenu.getItems().addAll(newItem, saveItem, saveAsItem);
		newItem.getItems().addAll(salaryItem, hourlyItem);
		viewMenu.getItems().addAll(tableItem,graphItem);
		menu.getMenus().addAll(fileMenu,viewMenu,helpMenu);

		//TabPane
		TabPane tabPane = new TabPane();
		tabPane.setTabClosingPolicy(TabPane.TabClosingPolicy.UNAVAILABLE);
		//Three tabs
		AddItemTab addItemTab = AddItemTab.getInstance();
		addItemTab.setClosable(false);
		//RemoveItemTab removeItemTab = RemoveItemTab.getInstance();
		//removeItemTab.setClosable(false);
		//StatisticsTab statisticsTab = StatisticsTab.getInstance();
		//statisticsTab.setClosable(false);
		tabPane.getTabs().addAll(addItemTab);


		BorderPane pane = new BorderPane();
		pane.getChildren().add(background);
		pane.setTop(menu);
		pane.setCenter(tabPane);


		scene2 = new Scene(pane,630,470);
		scene1 = new Scene(root, 630, 470);
		primaryStage.setScene(scene1);
		primaryStage.setResizable(false);
		primaryStage.show();

        
		
		
	}

}
