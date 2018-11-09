package Hogen;

import Tabs.AddItemTab;
import Tabs.RemoveItemTab;
import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.ParallelTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.Event;
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
import javafx.util.Duration;
public class login extends Application{
	

	private ImageView imageview = new ImageView();
	private ImageView background = new ImageView();
	private ImageView background1024 = new ImageView();
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
		Image image2 = new Image("background1024.png");
		background1024.setImage(image2);
		
		//Center - userName, password, login
		TextField username = new TextField();
		username.setPromptText("Username");
		username.getStyleClass().add("TextField");
		PasswordField password = new PasswordField();
		password.setPromptText("Password");
		password.getStyleClass().add("TextField");
		Button login = new Button("Login");
		login.getStyleClass().add("Button");
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
		
		
		//Sign up
		//1
		Button back = new Button("Back");
		back.getStyleClass().add("Button");
		back.addEventHandler(MouseEvent.MOUSE_ENTERED, 
			    new EventHandler<MouseEvent>() {
	        @Override public void handle(MouseEvent e) {
	        	back.setEffect(shadow);
	        }
	});
		back.addEventHandler(MouseEvent.MOUSE_EXITED, 
			    new EventHandler<MouseEvent>() {

	        @Override public void handle(MouseEvent e) {
	        	back.setEffect(null);
	        }
	});
		
		//2
		Button signUp = new Button("Sign Up");
		signUp.getStyleClass().add("Button");
		signUp.addEventHandler(MouseEvent.MOUSE_ENTERED, 
			    new EventHandler<MouseEvent>() {
	        @Override public void handle(MouseEvent e) {
	        	signUp.setEffect(shadow);
	        }
	});
		signUp.addEventHandler(MouseEvent.MOUSE_EXITED, 
			    new EventHandler<MouseEvent>() {

	        @Override public void handle(MouseEvent e) {
	        	signUp.setEffect(null);
	        }
	});
		//3
		TextField email = new TextField();
        email.setPromptText("Email");
        email.getStyleClass().add("TextField");
        
        //4
        ComboBox<Enums.gender> gender = new ComboBox<>();
        gender.setItems(FXCollections.observableArrayList(Enums.gender.values()));
        gender.setMinWidth(100);
        gender.setPromptText("Gender");
        gender.getStyleClass().add("TextField");


        //5
		DatePicker date = new DatePicker();
		date.setPromptText("Birth date");
		date.getStyleClass().add("TextField");
		
		//6
		HBox hh = new HBox();
    	hh.getChildren().addAll(gender,date);
    	hh.setSpacing(15);
		
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
		

				login.setOnMousePressed(new EventHandler<Event>() {

					@Override
					public void handle(Event event) {
					
						primaryStage.setScene(scene2);
						primaryStage.setResizable(false);
						primaryStage.show();
						
					}
					
				});
				
				signup.setOnAction(new EventHandler<ActionEvent>() {
		            @Override public void handle(ActionEvent e) {
		            	hbox.getChildren().remove(imageview);	
		            	
		            	
		            	
		             vbox.getChildren().removeAll(login);
		             vbox.getChildren().addAll(email,hh);
		             
		             
		             grid.getChildren().removeAll(tip,signup);
		             grid.setHgap(7);
		             grid.add(back, 2, 2);
		             grid.add(signUp, 3, 2);
		             
				     TranslateTransition t1 = new TranslateTransition(Duration.millis(200), username); 		     
				     t1.setByY(-30);
				     
				     TranslateTransition t2 = new TranslateTransition(Duration.millis(200), password); 		     
				     t2.setByY(-30);
				     
				     TranslateTransition t3 = new TranslateTransition(Duration.millis(200), email); 		     
				     t3.setByY(-30);
				     
				     TranslateTransition t4 = new TranslateTransition(Duration.millis(200), hh); 		     
				     t4.setByY(-30);

				     
				     //Order - SequentialTransition, same time - ParallelTransition
				     ParallelTransition pt = new ParallelTransition(t1, t2, t3, t4);
				        pt.play();   
				        
				        
		            	
		            }
		        });
				
				
				back.setOnAction(new EventHandler<ActionEvent>() {
		            @Override public void handle(ActionEvent e) {
		            	BorderPane signuproot = new BorderPane();
		            	hbox.getChildren().add(imageview);
		            	
		            	vbox.getChildren().removeAll(email,hh);
		            	grid.getChildren().removeAll(signUp, back);
		            	
		            	grid.setHgap(0);
		            	grid.add(tip, 2, 2); 
		        		grid.add(signup, 3, 2);
		        		
		        		
		        		vbox.getChildren().addAll(login);
		        		
		        		
		        		signuproot.getChildren().add(background);
		        		signuproot.setTop(hbox);
		        		signuproot.setCenter(vbox);
		        		signuproot.setBottom(grid);
		        		
		        		
		        		
		   
		            	 TranslateTransition tb1 = new TranslateTransition(Duration.millis(200), username); 		     
					     tb1.setByY(30);
					     
					     TranslateTransition tb2 = new TranslateTransition(Duration.millis(200), password); 		     
					     tb2.setByY(30);
					     
					     TranslateTransition tb3 = new TranslateTransition(Duration.millis(200), email); 		     
					     tb3.setByY(30);
					     
					     
					     TranslateTransition tb4 = new TranslateTransition(Duration.millis(200), hh); 		     
					     tb4.setByY(30);
					     

					     FadeTransition sb1 = new FadeTransition(Duration.millis(200), imageview);
					     sb1.setFromValue(.6);
					     sb1.setToValue(1);
					
					     //Order - SequentialTransition, same time - ParallelTransition
					     ParallelTransition ptb = new ParallelTransition(tb1, tb2, tb3, tb4, sb1);
					        ptb.play();   
					        
					        scene1 = new Scene(signuproot, 630, 470);
							scene1.getStylesheets().add("CSS/combo.css");
					        primaryStage.setScene(scene1);
		            	
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
		MenuItem exitItem = new MenuItem("Exit");
		MenuItem tableItem = new MenuItem("Table");
		MenuItem graphItem = new MenuItem("Graph");
		
		exitItem.addEventHandler(ActionEvent.ACTION, (e) -> {
			primaryStage.setScene(scene1);
			scene1.getStylesheets().add("CSS/combo.css");
			primaryStage.setResizable(false);
			primaryStage.show();
	    });
		
		
		fileMenu.getItems().addAll(newItem, saveItem, saveAsItem, exitItem);
		newItem.getItems().addAll(salaryItem, hourlyItem);
		viewMenu.getItems().addAll(tableItem,graphItem);
		menu.getMenus().addAll(fileMenu,viewMenu,helpMenu);

		//TabPane
		TabPane tabPane = new TabPane();
		tabPane.setTabClosingPolicy(TabPane.TabClosingPolicy.UNAVAILABLE);
		//Three tabs
		AddItemTab addItemTab = AddItemTab.getInstance();
		addItemTab.setClosable(false);
		RemoveItemTab removeItemTab = RemoveItemTab.getInstance();
		removeItemTab.setClosable(false);
		//StatisticsTab statisticsTab = StatisticsTab.getInstance();
		//statisticsTab.setClosable(false);
		tabPane.getTabs().addAll(addItemTab, removeItemTab);


		BorderPane pane = new BorderPane();
		pane.getChildren().add(background1024);
		pane.setTop(menu);
		pane.setCenter(tabPane);

		scene1 = new Scene(root, 620, 460);
		scene2 = new Scene(pane,1024,768);
		scene1.getStylesheets().add("CSS/combo.css");
		scene2.getStylesheets().add("CSS/combo.css");
		primaryStage.setScene(scene1);
		primaryStage.setResizable(false);
		primaryStage.show();

		
		
		
	}

}
