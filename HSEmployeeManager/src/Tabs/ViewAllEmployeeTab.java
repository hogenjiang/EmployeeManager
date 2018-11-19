package Tabs;

import javafx.scene.control.Tab;

public class ViewAllEmployeeTab extends Tab{

	private static ViewAllEmployeeTab tab;
	
	private ViewAllEmployeeTab() {
		this.setText("View All Employye");
	}
	
	public static ViewAllEmployeeTab getInstance() {
		if(tab == null) {
			tab = new ViewAllEmployeeTab();
		}
		return tab;
	}
	
}
