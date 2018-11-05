import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class RemoveEmployee extends Application {
  private double paneWidth = 480;
  private double paneHeight = 250;
  
  
  
  private Label label = new Label("Are you sure you want to remove this employee");
  private ComboBox<String> cboSelectionMode = new ComboBox<>();
  
  
  /**   The main method   */
  
  public static void main(String[] args) {
    launch(args);
  }
  
  
  
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    BorderPane pane = new BorderPane();
    Button btn = new Button("Remove This Employee");
    btn.setPadding(new Insets(20, 20, 10, 20)); 
    label.setFont(Font.font("Times New Roman", 
    	      FontWeight.BOLD, FontPosture.ITALIC, 20));
   Label label2 = new Label("Select The Name of Employye You want to delete:");
   label2.setFont(Font.font("Times New Roman", 
 	      FontWeight.BOLD, FontPosture.ITALIC, 16));
   label.setTextFill(Color.web("#0076a3"));
   label2.setTextFill(Color.web("#0076a3"));
  
  
            
    cboSelectionMode.getItems().addAll("Nadeem", "Akram");
    cboSelectionMode.setValue("Nadeem");
    
    HBox hBox = new HBox(30);
    hBox.getChildren().addAll(label2, cboSelectionMode);
    hBox.setAlignment(Pos.CENTER);
    pane.setTop(hBox);
    pane.setCenter(label);
    pane.setBottom(btn);
    
 // Create a scene and place it in the stage
    Scene scene = new Scene(pane, paneWidth, paneHeight);
    primaryStage.setTitle("Remove Employee"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage

    cboSelectionMode.setOnAction(e -> {
      if (cboSelectionMode.getValue().equals("Nadeem")) {
    	  label.setText("You want to remove Nadeem " );
      } else {
    	  label.setText("You didn't Select  any name  " );
      }
    });
  }
    

  
}
