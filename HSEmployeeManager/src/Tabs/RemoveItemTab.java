package Tabs;

import javafx.geometry.Insets;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class RemoveItemTab extends Tab{
	private static RemoveItemTab tab;
	
	private RemoveItemTab() {
		this.setText("Remove");

		//Build GridPane
		GridPane pane = new GridPane();
		pane.setPadding(new Insets(20, 0, 0, 20));
		pane.setVgap(10);
		pane.setHgap(10);
		Text name = new Text("Name");
		pane.add(name, 0, 0);
		TextField employeeName = new TextField();
		pane.add(employeeName, 1, 0);


		Text year = new Text("Year");
		pane.add(year, 0, 1);
		DatePicker date = new DatePicker();
		pane.add(date, 1, 1);


		this.setContent(pane);
	}
	
	public static RemoveItemTab getInstance() {
		if(tab == null) {
			tab = new RemoveItemTab();
		}
		return tab;
	}
}
