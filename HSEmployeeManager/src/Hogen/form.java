package Hogen;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TabPane;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class form extends Application{

	public static void main(String[] args) {
	Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		//build menu bar, item, create tabPane, tab, borderPane, top, center
		MenuBar menu = new MenuBar();
		Menu fileMenu = new Menu("File");
		Menu creditMenu = new Menu("Credits");
		MenuItem exit = new MenuItem("Exit");	
		fileMenu.getItems().add(exit);
		menu.getMenus().addAll(fileMenu,creditMenu);
		//TabPane
		TabPane tabPane = new TabPane();
		tabPane.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);
		//Three tabs
//		AddItemTab addItemTab = AddItemTab.getInstance();
//		addItemTab.setClosable(false);
//		RemoveItemTab removeItemTab = RemoveItemTab.getInstance();
//		removeItemTab.setClosable(false);
//		StatisticsTab statisticsTab = StatisticsTab.getInstance();
//		statisticsTab.setClosable(false);
//		tabPane.getTabs().addAll(addItemTab,removeItemTab,statisticsTab);
		
		BorderPane pane = new BorderPane();
		pane.setTop(menu);
		pane.setCenter(tabPane);
		
		Scene scene = new Scene(pane,1024,768);
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setResizable(false);
	}

}
