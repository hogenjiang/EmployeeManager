package Tabs;

import javafx.scene.control.Tab;

public class AddEmployeeTab extends Tab{
	
	private static AddEmployeeTab tab;
	
	private AddEmployeeTab() {
		this.setText("Add Employee");
	}
	
	public static AddEmployeeTab getInstance() {
		if(tab == null) {
			tab = new AddEmployeeTab();
		}
		return tab;
	}
	
}
