package Tabs;


import javafx.scene.control.Tab;

public class RemoveEmployeeTab extends Tab{
	
	private static RemoveEmployeeTab tab;
	
	private RemoveEmployeeTab() {
		this.setText("Remove Empoyee");
	}
	
	public static RemoveEmployeeTab getInstance() {
		if(tab == null) {
			tab = new RemoveEmployeeTab();
		}
		return tab;
	}
	
}
