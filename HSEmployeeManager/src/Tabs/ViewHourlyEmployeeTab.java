package Tabs;


import javafx.scene.control.Tab;

public class ViewHourlyEmployeeTab extends Tab {

	private static ViewHourlyEmployeeTab tab;
	
	private ViewHourlyEmployeeTab() {
		this.setText("View Hourly Employye");
	}
	
	public static ViewHourlyEmployeeTab getInstance() {
		if(tab == null) {
			tab = new ViewHourlyEmployeeTab();
		}
		return tab;
	}
	
}
