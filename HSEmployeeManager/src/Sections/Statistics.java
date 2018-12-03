package Sections;

import Tables.EmployeeTable;
import javafx.event.ActionEvent;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import txt.companyInformation;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.chart.*;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import static Hogen.login.browser;
import static javafx.geometry.Insets.EMPTY;


public class Statistics extends BorderPane {
    private static Statistics tab;
    public static VBox vBox = new VBox();
    public static VBox vBox1 = new VBox();



    DropShadow shadow = new DropShadow();
    Button pieButton = new Button();
    Button barButton = new Button();

    final static String Accounting = "Accounting";
    final static String Marketing = "Marketing";
    final static String Management = "Management";
    final static String HumanResource = "Human Resource";
    final static String Development = "Development";




    private Statistics(){
        Pane nn = new Pane();

        ImageView imageView = new ImageView("icon/iconpng.png");
        imageView.setFitWidth(100);
        imageView.setFitHeight(100);

        ImageView imageView2 = new ImageView("icon/people.png");
        imageView2.setFitWidth(100);
        imageView2.setFitHeight(100);

        FlowPane stackPane = new FlowPane();
        Text information = new Text();
        information.relocate(30,10);
        information.setText(" People connect better with stories than they" +
                "\n" +" do with a list of facts. " +
                "\n" +" If you want people to actually remember the " +
                "\n" +" information from your company profile, " +
                "\n" +" take the Zappos approach and tell a story about your brand. " +
                "\n" + " Quite frankly, not all brands have " +
                "\n" + " the most amazing story to tell -- and " +
                "\n" + " that's okay. The content of the story is less " +
                "\n" + " important than the fact that you are presenting " +
                "\n" + " information in the form of a story to begin with.");

        stackPane.setStyle("-fx-background-color: Grey;-fx-border-radius: 10 10 10 10;" +
                "-fx-background-radius: 10 10 10 10;");
        stackPane.getChildren().addAll(imageView,information);





        FlowPane stackPane3 = new FlowPane();
        Text information3 = new Text();
        information3.relocate(30,10);
        information3.setText("ALL department: " +"\n" +  "1. Accounting"+"\n" +
                "2. Marketing" +"\n" + "3. Management" +"\n" + "4. Human Resource"
                +"\n" + "5. Development");

        stackPane3.setStyle("-fx-background-color: White;-fx-border-radius: 10 10 10 10;" +
                "-fx-background-radius: 10 10 10 10;");
        stackPane3.getChildren().addAll(imageView2,information3);

        FlowPane flowPane = new FlowPane();
        flowPane.setVgap(7);
        flowPane.getChildren().addAll(stackPane, stackPane3);






        nn.getChildren().addAll(flowPane);
        VBox panebox = new VBox(nn);
        panebox.setPadding(new Insets(10,0,0,10));

        //Bar Chart
        CategoryAxis categoryAxis = new CategoryAxis();
        NumberAxis numberAxis = new NumberAxis();
        BarChart<String, Number> barChart = new BarChart<>(categoryAxis, numberAxis);
        categoryAxis.setLabel("Department");
        numberAxis.setLabel("Number");

        XYChart.Series series1 = new XYChart.Series();
        series1.setName("2016");
        series1.getData().add(new XYChart.Data<>("Accounting",30));
        series1.getData().add(new XYChart.Data<>("Marketing",50));
        series1.getData().add(new XYChart.Data<>("Management",20));
        series1.getData().add(new XYChart.Data<>("Human Resource",60));
        series1.getData().add(new XYChart.Data<>("Development",55));


        XYChart.Series series2 = new XYChart.Series();
        series2.setName("2017");
        series2.getData().add(new XYChart.Data<>("Accounting",24));
        series2.getData().add(new XYChart.Data<>("Marketing",61));
        series2.getData().add(new XYChart.Data<>("Management",34));
        series2.getData().add(new XYChart.Data<>("Human Resource",58));
        series2.getData().add(new XYChart.Data<>("Development",80));

        XYChart.Series series3 = new XYChart.Series();
        series3.setName("2018");
        series3.getData().add(new XYChart.Data<>("Accounting",25));
        series3.getData().add(new XYChart.Data<>("Marketing",55));
        series3.getData().add(new XYChart.Data<>("Management",25));
        series3.getData().add(new XYChart.Data<>("Human Resource",62));
        series3.getData().add(new XYChart.Data<>("Development",82));

        barChart.setTitle("Employee distribution");
        barChart.getData().addAll(series1,series2,series3);



        HBox buttonhbox = new HBox();
        buttonhbox.getChildren().addAll(pieButton,barButton);
        buttonhbox.setAlignment(Pos.CENTER);
        buttonhbox.setSpacing(5);



        vBox.getChildren().addAll(newPieChart(),buttonhbox);
        vBox.setSpacing(30);

        vBox1.getChildren().addAll(barChart);
        vBox1.setSpacing(30);

        //Switch
        pieButton.setBackground(Background.EMPTY);
        pieButton.setGraphic(new ImageView("icon/pie.png"));
        pieButton.addEventHandler(MouseEvent.MOUSE_ENTERED,
                new EventHandler<MouseEvent>() {
                    @Override public void handle(MouseEvent e) {
                        pieButton.setEffect(shadow);
                    }
                });
        pieButton.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override public void handle(MouseEvent e) {
                        pieButton.setEffect(null);
                    }
                });
        pieButton.setOnAction(e->{
                this.getChildren().removeAll(vBox1);
                vBox1.getChildren().removeAll(buttonhbox);
                vBox.getChildren().removeAll(buttonhbox,newPieChart());
                vBox.getChildren().addAll(buttonhbox);
                this.setCenter(vBox);
        });

        barButton.setBackground(Background.EMPTY);
        barButton.setGraphic(new ImageView("icon/bar.png"));
        barButton.addEventHandler(MouseEvent.MOUSE_ENTERED,
                new EventHandler<MouseEvent>() {
                    @Override public void handle(MouseEvent e) {
                        barButton.setEffect(shadow);
                    }
                });
        barButton.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override public void handle(MouseEvent e) {
                        barButton.setEffect(null);
                    }
                });
        barButton.setOnAction(e->{
            this.getChildren().removeAll(vBox);
            vBox.getChildren().removeAll(buttonhbox);
            vBox.getChildren().removeAll(buttonhbox);
            vBox1.getChildren().removeAll(buttonhbox,barChart);
            vBox1.getChildren().addAll(barChart,buttonhbox);
            this.setCenter(vBox1);
        });



        this.setCenter(vBox);
        this.setLeft(panebox);
    }

    public static Statistics getInstance(){
        tab = new Statistics();
        return tab;
    }

    public static PieChart newPieChart(){
        EmployeeTable table = new EmployeeTable();

        PieChart PieChart = new PieChart();
        PieChart.setTitle("Department distribution(2018)");

                ObservableList<PieChart.Data> PieData =
                FXCollections.observableArrayList(
                        new PieChart.Data("Accounting", 34),
                        new PieChart.Data("Marketing", 40),
                        new PieChart.Data("Management", 7),
                        new PieChart.Data("Human Resource", 42),
                        new PieChart.Data("Development", 60)
                        );

                PieChart.setData(PieData);

                return PieChart;


    }

}
