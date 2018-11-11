package Hogen;


import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;

import Enums.gender;
import Tabs.AddItemTab;
import Tabs.RemoveItemTab;
import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.ParallelTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.MouseButton;
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
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.util.Duration;
public class login extends Application{
	

	private ImageView imageview = new ImageView();
	private ImageView background = new ImageView();
	private ImageView background1024 = new ImageView();
	private Scene scene1, scene2;
	//Main entrance
	ListView<String> list = new ListView<String>(); 
	FileChooser filechooser = new FileChooser();
	Desktop desktop = Desktop.getDesktop();
	private ImageView profile = new ImageView();
	
	//password message
	final Label message = new Label("");
	

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
        gender.getStyleClass().add("TextField");


        //5
		DatePicker date = new DatePicker();
		date.setPromptText("Birth date");
		date.getStyleClass().add("TextField");
		
		
		
		//7
		HBox hh = new HBox();
    	hh.getChildren().addAll(gender,date);
    	hh.setSpacing(15);
		
		//Pane
		HBox hbox = new HBox(imageview);
		hbox.setPadding(new Insets(60, 0, 0, 100));
		
		

		VBox vbox = new VBox(username, password, message, login); 
		vbox.setAlignment(Pos.CENTER);
		vbox.setPadding(new Insets(0, 188, 100, 188));
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

					@Override 
					public void handle(ActionEvent e) {
						
						if(!username.getText().equals("test") || !password.getText().equals("test")) {
							message.setText("The username or password is incorrect!");
							username.clear();
							password.clear();
						}else {
							password.clear();
							message.setText("");
							primaryStage.setScene(scene2);
							primaryStage.setResizable(false);
							primaryStage.show();
						}
						
	
					}
				
				});
				
				signup.setOnAction(new EventHandler<ActionEvent>() {
		            @Override 
		            public void handle(ActionEvent e) {
		            	hbox.getChildren().remove(imageview);	
		            	
		            	
		            	
		             vbox.getChildren().removeAll(login,message);
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
		        		
		        		
		        		vbox.getChildren().addAll(message,login);
		        		
		        		
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
				
				signUp.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent event) {
						
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
				MenuItem exitItem = new MenuItem("Exit");
				MenuItem tableItem = new MenuItem("Table");
				MenuItem graphItem = new MenuItem("Graph");

				
				exitItem.addEventHandler(ActionEvent.ACTION, (e) -> {
					primaryStage.setScene(scene1);
					primaryStage.setResizable(false);
					primaryStage.show();
			    });
				
				fileMenu.getItems().addAll(newItem, saveItem, exitItem);
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
				
				
			
				
				//ListView
				ObservableList<String> items = FXCollections.observableArrayList("fds");
				list.setItems(items);
				list.setPrefSize(0, 90);
				
				//profile
						Button choose = new Button("Open a picture");
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
								File file = filechooser.showOpenDialog(primaryStage);
								if (file != null) {
									//profile
									Image profileImage = new Image(file.toURI().toString());
									profile.setImage(profileImage);
									profile.setFitHeight(64);
									profile.setFitWidth(64);
				    				
				                }
							}
							
						});
						
						
				//contextMenu
						final ContextMenu cm = new ContextMenu();
						MenuItem cmItem1 = new MenuItem("Copy Image");
						cmItem1.setOnAction(new EventHandler<ActionEvent>() {
						    public void handle(ActionEvent e) {
						        Clipboard clipboard = Clipboard.getSystemClipboard();
						        ClipboardContent content = new ClipboardContent();
						        content.putImage(profile.getImage());
						        clipboard.setContent(content);
						    }
						});

						cm.getItems().add(cmItem1);
						profile.addEventHandler(MouseEvent.MOUSE_CLICKED,
						    new EventHandler<MouseEvent>() {
						        @Override public void handle(MouseEvent e) {
						            if (e.getButton() == MouseButton.SECONDARY)  
						                cm.show(profile, e.getScreenX(), e.getScreenY());
						        }
						});
						
						
					
						
				
				
				
				

				//VBox(list, choose)
				VBox item_vbox = new VBox(list,choose,profile);
				item_vbox.setAlignment(Pos.CENTER);
				item_vbox.setPadding(new Insets(0, 400, 200, 400));
				item_vbox.setSpacing(15);

				BorderPane pane = new BorderPane();
				pane.getChildren().add(background1024);
				pane.setTop(menu);
				pane.setCenter(tabPane);
				pane.setBottom(item_vbox);
		
	

				
				

		

		scene1 = new Scene(root, 620, 460);
		scene2 = new Scene(pane,1024,768);
		scene1.getStylesheets().add("CSS/combo.css");
		scene2.getStylesheets().add("CSS/combo.css");
		primaryStage.setScene(scene1);
		primaryStage.setResizable(false);
		primaryStage.show();

		
		
		
	}
	
	
	//Define method for file extension
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
	
	private void openFile(File file) {
        try {
            desktop.open(file);
        } catch (IOException ex) {
            Logger.getLogger(FileChooser.class.getName()).log(
                Level.SEVERE, null, ex
            );
        }
    }
	
	
	

}
