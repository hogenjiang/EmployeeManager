package Tabs;
//comments
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class AddItemTab extends Tab{
	private static AddItemTab tab;
	
	private AddItemTab() {
		this.setText("Add");
		
		
		GridPane pane = new GridPane();
		pane.setPadding(new Insets(20, 0, 0, 20));
		pane.setVgap(10);
		pane.setHgap(10);
		Text name = new Text("Name");
		pane.add(name, 0, 0);
		
		TextField employeeName = new TextField();
		employeeName.getStyleClass().add("TextField");
		pane.add(employeeName, 1, 0);
		
		
		Text year = new Text("Year");
		pane.add(year, 0, 1);
		DatePicker date = new DatePicker();
		date.getStyleClass().add("TextField");
		pane.add(date, 1, 1);

		this.setContent(pane);
		
	}
	
	public static AddItemTab getInstance() {
		if(tab == null) {
			tab = new AddItemTab();
		}
		return tab;
	}
	
}
