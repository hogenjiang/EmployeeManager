package Tabs;

import Hogen.table;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.awt.*;
import java.io.File;

public class AddItemTab extends Tab{
	private static AddItemTab tab;
	private ImageView profile = new ImageView();
//	private ImageView background4K = new ImageView();
	FileChooser filechooser = new FileChooser();
	Desktop desktop = Desktop.getDesktop();
	DropShadow shadow = new DropShadow();
	Image profileImage = new Image("icon/profile.jpg");
	
	private AddItemTab() {
		this.setText("Add");
		Pane canvas = new Pane();
		//profile
		profile.setImage(profileImage);
		profile.setFitHeight(213);
		profile.setFitWidth(160);
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
				File file = filechooser.showOpenDialog(new Stage());
				if (file != null) {
					profileImage = new Image(file.toURI().toString());
					profile.setImage(profileImage);
					profile.setFitHeight(213);
					profile.setFitWidth(160);

				}
			}

		});
		VBox v = new VBox(profile,choose);
		v.setSpacing(30);
		v.setAlignment(Pos.BOTTOM_CENTER);
		v.relocate(80,40);
		//Text
		Text firstname = new Text("First Name ");
		firstname.relocate(300, 45);
		Text lastname = new Text("Last Name ");
		lastname.relocate(600,45);
		Text gender = new Text("Gender ");
		gender.relocate(300,95);
		Text birthdate = new Text("Birth Date ");
		birthdate.relocate(600,95);
		Text phone = new Text("Phone ");
		phone.relocate(300,145);
		Text email = new Text("Email ");
		email.relocate(600,145);
		Text address = new Text("Address ");
		address.relocate(300,195);
		Text ID = new Text("ID ");
		ID.relocate(300,245);
		Text sin = new Text("SIN ");
		sin.relocate(600,245);
		Text salary = new Text("Salary ");
		salary.relocate(300,295);
		Text title = new Text("Title ");
		title.relocate(600,295);
		Text department = new Text("Department ");
		department.relocate(300,345);
		Text status = new Text("Status ");
		status.relocate(600,345);
		Text startdate = new Text("Start Date ");
		startdate.relocate(300,395);
		Text enddate = new Text("End Date ");
		enddate.relocate(600,395);
		//TextField
		TextField EfirstName = new TextField();
		EfirstName.relocate(390,40);
		TextField ElastName = new TextField();
		ElastName.relocate(690,40);
		TextField Egender = new TextField();
		Egender.relocate(390,90);
		TextField EbirthDate = new TextField();
		EbirthDate.relocate(690,90);
		TextField Ephone = new TextField();
		Ephone.relocate(390,140);
		TextField Eemail = new TextField();
		Eemail.relocate(690,140);
		TextField Eaddress = new TextField();
		Eaddress.setPrefWidth(485);
		Eaddress.relocate(390,190);
		TextField EID = new TextField();
		EID.relocate(390,240);
		TextField ESIN = new TextField();
		ESIN.relocate(690,240);
		TextField Esalary = new TextField();
		Esalary.relocate(390,290);
		TextField Etitle = new TextField();
		Etitle.relocate(690,290);
		TextField Edepartment = new TextField();
		Edepartment.relocate(390,340);
		TextField Estatus = new TextField();
		Estatus.relocate(690,340);
		TextField EstartDate = new TextField();
		EstartDate.relocate(390,390);
		TextField EendDate = new TextField();
		EendDate.relocate(690,390);
		//Button save
		Button save = new Button("Save");
		save.relocate(520,600);
		save.addEventHandler(MouseEvent.MOUSE_ENTERED,
				new EventHandler<MouseEvent>() {
					@Override public void handle(MouseEvent e) {
						save.setEffect(shadow);
					}
				});
		save.addEventHandler(MouseEvent.MOUSE_EXITED,
				new EventHandler<MouseEvent>() {

					@Override public void handle(MouseEvent e) {
						save.setEffect(null);
					}
				});
		save.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {

			}

		});

		//pane
		AnchorPane anchorPane = new AnchorPane();
		AnchorPane.setBottomAnchor(save,-480.0);
		anchorPane.getChildren().add(save);

//		Image image = new Image("icon/background4K.png");
//		background4K.setImage(image);
//		canvas.getChildren().addAll(background4K);
		canvas.getChildren().addAll(v, firstname, EfirstName,lastname, ElastName,sin, ESIN,salary, Esalary,title, Etitle,department, Edepartment,
				address, Eaddress,phone, Ephone,email, Eemail,gender, Egender, ID, EID, status, Estatus,
				birthdate, EbirthDate,startdate, EstartDate,enddate, EendDate, anchorPane);
		canvas.getStylesheets().add("CSS/combo.css");

		this.setContent(canvas);
		
	}
	
	public static AddItemTab getInstance() {
		if(tab == null) {
			tab = new AddItemTab();
		}

		return tab;
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
