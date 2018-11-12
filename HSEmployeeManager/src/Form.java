import Tabs.AddEmployeeTab;
import Tabs.RemoveEmployeeTab;
import Tabs.ViewAllEmployeeTab;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Form extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		//Build a MenuBar
		MenuBar menu = new MenuBar();
		Menu fileMenu = new Menu("File");
		Menu creditsMenu = new Menu("Credits");
		//Build Menu Items
		MenuItem exit = new MenuItem("Exit");
		//Add menu items to the Menu
		fileMenu.getItems().add(exit);
		//Add the menu to the MenuBar
		menu.getMenus().addAll(fileMenu, creditsMenu);
		//Create a TabPane 	
		TabPane tabPane = new TabPane();
		tabPane.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);
		//Create the tabs
		AddEmployeeTab addItemTab = AddEmployeeTab.getInstance();
		RemoveEmployeeTab removeItemTab = RemoveEmployeeTab.getInstance();
		ViewAllEmployeeTab statisticsTab = ViewAllEmployeeTab.getInstance();
		//Add the tabs to the TabPane
		tabPane.getTabs().addAll(addItemTab, removeItemTab,
				statisticsTab);
		//Create a BorderPane
		BorderPane pane = new BorderPane();
		//Set the top of the BorderPane to the MenuBar
		pane.setTop(menu);
		//Set the center of the BorderPane to the TabPane
		pane.setCenter(tabPane);
		//Create the scene
		Scene scene = new Scene(pane, 1024, 768);
		//add the scene to the stage
		primaryStage.setScene(scene);
		//show the stage
		primaryStage.show();
	}

}
