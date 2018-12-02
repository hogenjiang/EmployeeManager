package Sections;


import DAO.DepartmentDAO;
import Models.*;
import Tables.*;
import com.sun.webkit.dom.ElementImpl;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.awt.Desktop;
import java.io.File;

public class Add extends BorderPane{
	private static Add tab;
	private ImageView profile = new ImageView();
//	private ImageView background4K = new ImageView();
	FileChooser filechooser = new FileChooser();
	Desktop desktop = Desktop.getDesktop();
	DropShadow shadow = new DropShadow();
	Image profileImage = new Image("icon/profile.jpg");
	DepartmentTable departmentTable = new DepartmentTable();
    ProvinceTable provinceTable = new ProvinceTable();
    TitleTable titleTable = new TitleTable();
    SituationTable situationTable = new SituationTable();

	
	private Add() {
		Pane canvas = new Pane();
		EmployeeTable table = new EmployeeTable();
		//profile
		profile.setImage(profileImage);
		profile.setFitHeight(213);
		profile.setFitWidth(160);
		Button choose = new Button("Add picture");

		choose.getStyleClass().add("Button");
		choose.getStyleClass().add("bb");
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
					choose.setText("Change picture");
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
		Text city = new Text("City ");
		city.relocate(300,245);
		Text province = new Text("Province ");
		province.relocate(600,245);
		Text department = new Text("Department ");
		department.relocate(300,295);
		Text title = new Text("Title ");
		title.relocate(600,295);
		Text status = new Text("Status ");
		status.relocate(300,345);
		Text salary = new Text("Salary ");
		salary.relocate(600,345);
		Text startdate = new Text("Start Date ");
		startdate.relocate(300,395);
		Text enddate = new Text("End Date ");
		enddate.relocate(600,395);
		//TextField
		int id = 1;
		ImageView im = new ImageView("icon/plus.png");
		TextField EemployeeId = new TextField();
		TextField EfirstName = new TextField();
		EfirstName.relocate(390,40);
		TextField ElastName = new TextField();
		ElastName.relocate(690,40);
		ComboBox<Enums.gender> Egender = new ComboBox<>();
		Egender.setItems(FXCollections.observableArrayList(Enums.gender.values()));
		Egender.setPrefWidth(167);
		Egender.relocate(390,90);
		DatePicker EbirthDate = new DatePicker();
		EbirthDate.setPrefWidth(167);
		EbirthDate.relocate(690,90);
		TextField Ephone = new TextField();
		Ephone.relocate(390,140);

		TextField Eemail = new TextField();
		Eemail.relocate(690,140);
		TextField Eaddress = new TextField();
		Eaddress.setPrefWidth(500);
		Eaddress.relocate(390,190);

		TextField Ecity = new TextField();
		Ecity.relocate(390,240);
		ComboBox<Province> Eprovince = new ComboBox<>();
		Eprovince.setItems(FXCollections.observableArrayList(provinceTable.getAllProvince()));
		Eprovince.relocate(690,240);




        ComboBox<Department> Edepartment = new ComboBox<>();
        Edepartment.setPrefWidth(167);
        Edepartment.setItems(FXCollections.observableArrayList(departmentTable.getAllDepartment()));
        Edepartment.relocate(390,290);
		ComboBox<Title> Etitle = new ComboBox<>();
		Etitle.setItems(FXCollections.observableArrayList(titleTable.getAllTitle()));
		Etitle.setPrefWidth(167);
		Etitle.relocate(690,290);
        ComboBox<Situation> Estatus = new ComboBox<>();
        Estatus.setPrefWidth(167);
        Estatus.setItems(FXCollections.observableArrayList(situationTable.getAllSituation()));
        Estatus.relocate(390,340);
		TextField Esalary = new TextField();
        Esalary.relocate(690,340);
		DatePicker EstartDate = new DatePicker();
		EstartDate.setPrefWidth(167);
		EstartDate.relocate(390,390);
		DatePicker EendDate = new DatePicker();
		EendDate.setPrefWidth(167);
		EendDate.relocate(690,390);


		Text employid = new Text("ID ");
		employid.relocate(120,350);
		TextField ess = new TextField();
		ess.relocate(140,350);
		ess.setPrefWidth(60);






		//Button save
		Button save = new Button("Create employee");
		save.getStyleClass().add("bb");
		save.relocate(400,500);
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
				Employee employee = new Employee(
						ess.getText(),
						EfirstName.getText(),
						ElastName.getText(),
						Eemail.getText(),
						Esalary.getText(),
						Etitle.getSelectionModel().getSelectedItem().getId(),
						Edepartment.getSelectionModel().getSelectedItem().getId(),
						Eaddress.getText(),
						Ephone.getText(),
						Egender.getSelectionModel().getSelectedItem().toString(),
						EbirthDate.getValue().toString(),
						EstartDate.getValue().toString(),
						EendDate.getValue().toString(),
						Estatus.getSelectionModel().getSelectedItem().getId(),
						Ecity.getText(),
						Eprovince.getSelectionModel().getSelectedItem().getId()
//						profile.getImage()

						);
				table.createEmployee(employee);
			}
		});




		canvas.getChildren().addAll(employid, ess,v, firstname, EfirstName,lastname, ElastName,city, Ecity,province, Eprovince,salary, Esalary,title, Etitle,department, Edepartment,
				address, Eaddress,phone, Ephone,email, Eemail,gender, Egender, status, Estatus,
				birthdate, EbirthDate,startdate, EstartDate,enddate, EendDate, save);




		VBox vBox = new VBox(canvas);
		vBox.setAlignment(Pos.TOP_CENTER);
		vBox.setPadding(new Insets(0,20,0,0));

		HBox hh = new HBox(vBox);
		hh.setAlignment(Pos.BOTTOM_CENTER);
		hh.setPadding(new Insets(0,20,0,0));

		this.setCenter(hh);
		
	}
	
	public static Add getInstance() {
			tab = new Add();

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




