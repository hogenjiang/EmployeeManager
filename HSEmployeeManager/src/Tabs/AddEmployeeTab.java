package Tabs;

import java.util.EnumSet;

import JavaBean.Employee;

import Tables.EmployeeTable;


import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class AddEmployeeTab extends Tab{
	
	private static AddEmployeeTab tab;
	
	private AddEmployeeTab() {
		this.setText("Add Item");
		//Start by getting access to the items and locations table
		EmployeeTable table = new EmployeeTable();
		
		
		//Build a GridPane to represent the layout for our screen
		GridPane pane = new GridPane();
		
		Text firstName = new Text(" First Name");
		pane.add(firstName, 0,0);
		 TextField textFirstName = new TextField();
		 pane.add(textFirstName, 1, 0);
		 
		 
		 Text lastName = new Text(" Last Name");
			pane.add(lastName, 0,1);
			 TextField textLasttName = new TextField();
			 pane.add(textLasttName, 1, 1);
		 
		 
			 Text address = new Text(" Address");
				pane.add(address, 0,2);
				 TextField textAddress = new TextField();
				 pane.add(textAddress, 1, 2);
				 
				 Text location = new Text("City:");
					pane.add(location, 0, 3);
				 
		  ComboBox<ENUMS.City> comboCity = new ComboBox<>();
		  comboCity.setItems(
				FXCollections.observableArrayList(ENUMS.City.values()));
		pane.add(comboCity,1, 3);
		
		
		 Text province = new Text("Province:");
			pane.add(province, 0, 4);
		 
			ComboBox<ENUMS.Province> comboCondition = new ComboBox<>();
			comboCondition.setItems(
					FXCollections.observableArrayList(ENUMS.Province.values()));
			pane.add(comboCondition,1,4);
			
			
			Text postalCode = new Text("Postal Code");
			pane.add(postalCode, 0,5);
			 TextField textPostalCode = new TextField();
			 pane.add(textPostalCode, 1, 5);
			 
			 
			 Text phone = new Text("Phone Number");
				pane.add(phone, 0,6);
				 TextField textPhone = new TextField();
				 pane.add(textPhone, 1, 6);
				 
				 
				 Text email = new Text("Email");
					pane.add(email, 0,7);
					 TextField textEmail = new TextField();
					 pane.add(textEmail, 1, 7);
			 
			 
					 Text hireDate = new Text("Hire Date");
						pane.add(hireDate, 0,8);
						DatePicker date = new DatePicker();
						pane.add(date, 1, 8);
			 
						Text salary = new Text("Salary");
						pane.add(salary, 0,9);
						TextField textSalary = new TextField();
						 pane.add(textSalary, 1, 9);
			 
						 Text department = new Text("Department");
							pane.add(department, 0,10);
							TextField textDepartment = new TextField();
							 pane.add(textDepartment, 1, 10);
			 
//							 Image picture = new Image("pic.jfif");
//							 
//							 ImageView image = new ImageView();
//							 image.setImage(picture);
//		
//		                    pane.add(image, 0, 0);
		
		
		
		
		

		
		
		
		//comboLocation
//		Text location = new Text("Coin Location:");
//		pane.add(location, 0, 3);
		ComboBox<Employee> comboLocation = new ComboBox<>();
		comboLocation.setItems(
				FXCollections.observableArrayList(
						table.getAllEmplees()));
		
		
		
		 TextField addFirstName = new TextField();
        addFirstName.setPromptText("First Name");
        
        
//        pane.add(addFirstName, 1, 3);
//        
//        pane.add(comboLocation, 1, 3);
		
		


		
		
		
		
		
		
		
		
		
		
		
		
		
		Button submit = new Button("Submit");
		submit.setOnAction(e->{
			//Build an item to put in the ItemTable
			 Employee employee = new Employee(
				 comboCity.getSelectionModel().getSelectedItem().name());
				// comboLocation.getSelectionModel().getSelectedItem().name()
				
			 //Insert the record into the ItemTable
			 table.createEmployee(employee);
			//StatisticsTab.pane.setCenter(StatisticsTab.generateChart());
		});
		pane.add(submit, 1, 12);
		pane.setPadding(new Insets(10,10,10,10));
		pane.setVgap(10);
		pane.setHgap(10);
		
		this.setContent(pane);
	}
	
	public static AddEmployeeTab getInstance() {
		if(tab == null) {
			tab = new AddEmployeeTab();
		}
		return tab;
	}
	
}	