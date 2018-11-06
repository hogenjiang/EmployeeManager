package Hogen;
import Tabs.AddItemTab;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TabPane;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class form extends Application{

	public static void main(String[] args) {
	Application.launch(args);
	}

	private ImageView background = new ImageView();

	@Override
	public void start(Stage primaryStage) throws Exception {
		//build menu bar, item, create tabPane, tab, borderPane, top, center
		MenuBar menu = new MenuBar();
		Menu fileMenu = new Menu("File");
		Menu viewMenu = new Menu("View");
		Menu helpMenu = new Menu("Help");
		Menu newItem = new Menu("New");

		MenuItem salaryItem = new MenuItem("Salary Employee");
		MenuItem hourlyItem = new MenuItem("Hourly Employee");
		MenuItem saveItem = new MenuItem("Save");
		MenuItem saveAsItem = new MenuItem("Save As");
		MenuItem tableItem = new MenuItem("Table");
		MenuItem graphItem = new MenuItem("Graph");

		fileMenu.getItems().addAll(newItem, saveItem, saveAsItem);
		newItem.getItems().addAll(salaryItem, hourlyItem);
		viewMenu.getItems().addAll(tableItem,graphItem);
		menu.getMenus().addAll(fileMenu,viewMenu,helpMenu);

		//TabPane
		TabPane tabPane = new TabPane();
		tabPane.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);
		//Three tabs
		AddItemTab addItemTab = AddItemTab.getInstance();
		addItemTab.setClosable(false);
//		RemoveItemTab removeItemTab = RemoveItemTab.getInstance();
//		removeItemTab.setClosable(false);
//		StatisticsTab statisticsTab = StatisticsTab.getInstance();
//		statisticsTab.setClosable(false);
		tabPane.getTabs().addAll(addItemTab);
		
		BorderPane pane = new BorderPane();
		pane.setTop(menu);
		pane.setCenter(tabPane);


		
		Scene scene = new Scene(pane,640,480);
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setResizable(false);
	}

}
