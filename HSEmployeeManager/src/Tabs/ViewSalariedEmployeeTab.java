package Tabs;


import javafx.scene.control.Tab;

public class ViewSalariedEmployeeTab extends Tab {

	private static ViewSalariedEmployeeTab tab;
	
	private ViewSalariedEmployeeTab() {
		this.setText("View Salary Employye");
	}
	
	public static ViewSalariedEmployeeTab getInstance() {
		if(tab == null) {
			tab = new ViewSalariedEmployeeTab();
		}
		return tab;
	}
	
}
