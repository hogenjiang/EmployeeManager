package Hogen;


import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;

import Enums.gender;
import Models.Account;
import Models.Employee;
import Tables.AccountTable;
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
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Side;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.*;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.util.Duration;
public class login extends Application{
	

	private ImageView imageview = new ImageView();
	private ImageView background4K = new ImageView();
	private ImageView icon = new ImageView();
	private ImageView profile = new ImageView();
	private Scene scene1, scene2;
	
	//Main entrance
	ListView<String> list = new ListView<String>(); 
	FileChooser filechooser = new FileChooser();
	Desktop desktop = Desktop.getDesktop();

	//BorderPane
			BorderPane border = new BorderPane();
			Account account = new Account();
			AccountTable atable = new AccountTable();
			
	//password message
	final Label message = new Label("");
	

	public static void main(String[] args) {
		Application.launch(args);

	}

	@SuppressWarnings("unchecked")
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
		Image image2 = new Image("background4K.png");
		background4K.setImage(image2);
		Image icon1 = new Image("iconpng.png");
		icon.setImage(icon1);
		
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


        
		
		
		
		
    	
		
		//Pane
		HBox hbox = new HBox(imageview);
		hbox.setPadding(new Insets(60, 0, 0, 0));
		hbox.setAlignment(Pos.CENTER);
		
		

		VBox vbox = new VBox(username, password, message, login); 
		vbox.setAlignment(Pos.CENTER);
		vbox.setPadding(new Insets(0, 300, 60, 300));
		vbox.setSpacing(20);

		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setPadding(new Insets(0, 0, 60, 0));
		grid.add(tip, 2, 2); //horizontal, vertical
		grid.add(signup, 3, 2);





		//function

				login.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent e) {

						//atable
						AccountTable at = new AccountTable();
						Account user = at.getLogin(username.getText(), password.getText());

						if(user == null) {
							message.setText("The username or password is incorrect!");
							username.clear();
							password.clear();
						}else {
							password.clear();
							message.setText("");
							primaryStage.setScene(scene2);
							primaryStage.setResizable(true);
							primaryStage.show();
						}


					}

				});

					password.setOnKeyPressed(new EventHandler<KeyEvent>() {
												 @Override
												 public void handle(KeyEvent event) {
													 if(event.getCode().equals(KeyCode.ENTER)) {
														 AccountTable at = new AccountTable();
														 Account user = at.getLogin(username.getText(), password.getText());

														 if(user == null) {
															 message.setText("The username or password is incorrect!");
															 username.clear();
															 password.clear();
														 }else {
															 password.clear();
															 message.setText("");
															 primaryStage.setScene(scene2);
															 primaryStage.setResizable(true);
															 primaryStage.show();
														 }
													 }
												 }
											 });

							signup.setOnAction(new EventHandler<ActionEvent>() {
								@Override
								public void handle(ActionEvent e) {
									hbox.getChildren().remove(imageview);


									vbox.getChildren().removeAll(login, message);
									vbox.getChildren().addAll(email, gender);


									grid.getChildren().removeAll(tip, signup);
									grid.setHgap(7);
									grid.add(back, 2, 2);
									grid.add(signUp, 3, 2);

									TranslateTransition t1 = new TranslateTransition(Duration.millis(200), username);
									t1.setByY(-30);

									TranslateTransition t2 = new TranslateTransition(Duration.millis(200), password);
									t2.setByY(-30);

									TranslateTransition t3 = new TranslateTransition(Duration.millis(200), email);
									t3.setByY(-30);

									TranslateTransition t4 = new TranslateTransition(Duration.millis(200), gender);
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
		            	
		            	vbox.getChildren().removeAll(email,gender);
		            	grid.getChildren().removeAll(signUp, back);
		            	
		            	grid.setHgap(0);
		            	grid.add(tip, 2, 2); 
		        		grid.add(signup, 3, 2);
		        		
		        		
		        		vbox.getChildren().addAll(message,login);
		        		
		        		
		        		signuproot.getChildren().add(background4K);
		        		signuproot.setTop(hbox);
		        		signuproot.setCenter(vbox);
		        		signuproot.setBottom(grid);
		        		
		        		
		        		
		   
		            	 TranslateTransition tb1 = new TranslateTransition(Duration.millis(200), username); 		     
					     tb1.setByY(30);
					     
					     TranslateTransition tb2 = new TranslateTransition(Duration.millis(200), password); 		     
					     tb2.setByY(30);
					     
					     TranslateTransition tb3 = new TranslateTransition(Duration.millis(200), email); 		     
					     tb3.setByY(30);
					     
					     
					     TranslateTransition tb4 = new TranslateTransition(Duration.millis(200), gender); 		     
					     tb4.setByY(30);
					     

					     FadeTransition sb1 = new FadeTransition(Duration.millis(200), imageview);
					     sb1.setFromValue(.6);
					     sb1.setToValue(1);
					
					     //Order - SequentialTransition, same time - ParallelTransition
					     ParallelTransition ptb = new ParallelTransition(tb1, tb2, tb3, tb4, sb1);
					        ptb.play();   
					        
					        scene1 = new Scene(signuproot, 1024, 768);
							scene1.getStylesheets().add("CSS/combo.css");
					        primaryStage.setScene(scene1);
					        primaryStage.setResizable(true);
		            	
		            }
		        });
				
				
				
				signUp.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent event) {
						Account account = new Account(username.getText(), password.getText(),
								email.getText(),gender.getSelectionModel().getSelectedItem().name());
						
						
						atable.createAccount(account);
					}
					
				});
				
				
				//SCENE 2

				//build menu bar, item, create tabPane, tab, borderPane, top, center
				MenuBar menu = new MenuBar();
				Menu fileMenu = new Menu("File");
				Menu viewMenu = new Menu("View");
				Menu helpMenu = new Menu("Help");
				Menu newItem = new Menu("New");


				fileMenu.setGraphic(new ImageView("icon/file.png"));
				viewMenu.setGraphic(new ImageView("icon/view.png"));
				helpMenu.setGraphic(new ImageView("icon/help.png"));

				MenuItem employeeItem = new MenuItem("Employee");
				MenuItem exportItem = new MenuItem("Export");
				MenuItem exitItem = new MenuItem("Exit");
				MenuItem tableItem = new MenuItem("Table");
				MenuItem graphItem = new MenuItem("Graph");
				MenuItem webItem = new MenuItem("Website");

				
				exitItem.addEventHandler(ActionEvent.ACTION, (e) -> {
					primaryStage.setScene(scene1);
					primaryStage.setResizable(false);
					primaryStage.show();
			    });

		employeeItem.addEventHandler(ActionEvent.ACTION, (e) -> {
					
			    });
				
				fileMenu.getItems().addAll(newItem, exportItem, exitItem);
				newItem.getItems().addAll(employeeItem);
				viewMenu.getItems().addAll(tableItem,graphItem);
				menu.getMenus().addAll(fileMenu,viewMenu,helpMenu);
				helpMenu.getItems().add(webItem);

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
//				tabPane.getTabs().addAll(addItemTab, removeItemTab);
				
				
			
				
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
									profile.setFitHeight(180);
									profile.setFitWidth(180);
				    				
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
						
						
					//Pie chart
						ObservableList<PieChart.Data> pieChartData =
				                FXCollections.observableArrayList(
				                new PieChart.Data("Salary Test.Employee", 70),
				                new PieChart.Data("Hourly Test.Employee", 30));
				        final PieChart chart = new PieChart(pieChartData);
						
				        chart.setLabelLineLength(10);
				        applyCustomColorSequence(
				        	      pieChartData, 
				        	      "rgb(128,128,128)", 
				        	      "rgb(192,192,192)"
				        	     
				        	    );
				        
				        
				        
				        
				//TableView
				        TableView<Employee> table = new TableView<Employee>();
				        table.getStyleClass().add("Table");
				    	ObservableList<Employee> data = FXCollections.observableArrayList(
				    		    new Employee("02313","Hogen", "Jiang", "00", "13", "13", "Dsa","dsa,","ds",
										"dd","fsdf","fd","fd","fsd","fd")
				    		);

				        final Label label = new Label("Worker");
				        label.setFont(new Font("Arial", 20));
				        table.setEditable(true);
				        TableColumn<Employee, String> ID = new TableColumn<Employee, String>("ID");
		ID.setCellValueFactory(
				new PropertyValueFactory<Employee,String>("EmployeeId")
		);
				        TableColumn<Employee, String> FIRSTNAME = new TableColumn<Employee, String>("Firstname");
		FIRSTNAME.setCellValueFactory(
				new PropertyValueFactory<Employee,String>("Firstname")
		);
				        TableColumn<Employee, String> LASTNAME = new TableColumn<Employee, String>("Lastname");

						TableColumn<Employee, String> SIN = new TableColumn<Employee, String>("SIN");

						TableColumn<Employee, String> EMAIL = new TableColumn<Employee, String>("Email");

						TableColumn<Employee, String> SALARY = new TableColumn<Employee, String>("Salary");

						TableColumn<Employee, String> TITLE = new TableColumn<Employee, String>("Title");

						TableColumn<Employee, String> DEPARTMENT = new TableColumn<Employee, String>("Department");

						TableColumn<Employee, String> ADDRESS = new TableColumn<Employee, String>("Address");

						TableColumn<Employee, String> PHONE = new TableColumn<Employee, String>("Phone");

						TableColumn<Employee, String> GENDER = new TableColumn<Employee, String>("Gender");

						TableColumn<Employee, String> BIRTHDATE = new TableColumn<Employee, String>("Birth date");

						TableColumn<Employee, String> STARTDATE = new TableColumn<Employee, String>("Start date");

						TableColumn<Employee, String> STATUS = new TableColumn<Employee, String>("Status");

						TableColumn<Employee, String> ENDDATE = new TableColumn<Employee, String>("End date");


		table.getColumns().addAll(ID);
						table.setItems(data);


				
				        WebView browser = new WebView();
				        WebEngine webEngine = browser.getEngine();
				        webEngine.load("http://www.google.ca");



				//Add item
//		TextField EId = new TextField();
//		TextField EfirstName = new TextField();
//		TextField ElastName = new TextField();
//		TextField ESIN = new TextField();
//		TextField Esalary = new TextField();
//		TextField Etitle = new TextField();
//		TextField Edepartment = new TextField();
//		TextField Eaddress = new TextField();
//		TextField Ephone = new TextField();
//		TextField Eemail = new TextField();
//		TextField Egender = new TextField();
//		TextField Estatus = new TextField();
//		TextField EbirthDate = new TextField();
//		TextField EstartDate = new TextField();
//		TextField EendDate = new TextField();




//				        ComboBox<Enums.Situation> ESituation = new ComboBox<>();
//				        ESituation.setItems(FXCollections.observableArrayList(Enums.Situation.values()));
//				        ESituation.setMinWidth(100);
//				        ESituation.getStyleClass().add("TextField");
//				        EName.setPromptText("Name");
//				        EName.setMaxWidth(Name.getPrefWidth());
//				        EAge.setMaxWidth(Age.getPrefWidth());
//				        EAge.setPromptText("Age");
//				        ESituation.setPromptText("Situation");
//				        Button add = new Button("Add");
//				        add.setOnAction((ActionEvent e) ->{
//				        	data.add(new Employee(
//									EId.getText(),EfirstName.getText(), ElastName.getText(),ESIN.getText(),Esalary.getText(),Etitle.getText(),Edepartment.getText(),
//									Eaddress.getText(),Ephone.getText(),Eemail.getText(),Egender.getText(),Estatus.getText(),
//									EbirthDate.getText(),EstartDate.getText(),EendDate.getText()
//				        			));
//
//				        });



				        VBox item_vbox = new VBox(chart);
				        item_vbox.setAlignment(Pos.TOP_CENTER);

//				        HBox addEmployee = new HBox();
//				        addEmployee.getChildren().addAll(EId, EfirstName, ElastName, ESIN, Esalary, Etitle, Edepartment, Eaddress, Ephone, Eemail, Egender, Estatus, EbirthDate, EstartDate, EendDate, add);
//				        addEmployee.setPadding(new Insets(10, 0, 0, 10));
//				        addEmployee.setSpacing(3);


				        VBox hold = new VBox();
				        hold.setSpacing(5);
				        hold.setPadding(new Insets(10, 0, 0, 10));
				        hold.getChildren().addAll(label, table);

				GridPane pane = new GridPane();

				pane.setPadding(new Insets(20, 0, 20, 20));
				pane.add(hold, 0, 0);
				pane.add(item_vbox, 1, 0);
				border.getChildren().addAll(background4K);
				border.setTop(menu);
				border.setLeft(pane);
				
				//define Menu option 
				webItem.addEventHandler(ActionEvent.ACTION, (e) -> {
//					border.getChildren().removeAll(pane);
					border.setCenter(browser);
			    });

		root.getChildren().add(background4K);
		root.setTop(hbox);
		root.setCenter(vbox);
		root.setBottom(grid);
		scene1 = new Scene(root, 1024, 768);
		scene2 = new Scene(border,1024,768);
		scene1.getStylesheets().add("CSS/combo.css");
		scene2.getStylesheets().add("CSS/combo.css");
		primaryStage.setScene(scene1);
		primaryStage.setResizable(true);
		primaryStage.setTitle("Employee System");
		primaryStage.getIcons().add(icon1);
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
	
	private void applyCustomColorSequence(ObservableList<PieChart.Data> pieChartData, String... pieColors) {
        int i = 0;
        for (PieChart.Data data : pieChartData) {
          data.getNode().setStyle("-fx-pie-color: " + pieColors[i % pieColors.length] + ";");
          i++;
        }
      }
	
	private String Text(ComboBox com) {
		
		
		return com.toString();
	}
	

}
