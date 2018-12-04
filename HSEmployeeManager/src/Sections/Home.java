package Sections;


import Models.Employee;
import Tables.EmployeeTable;
import Tables.ProvinceTable;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.*;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;


import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static Sections.ViewAll.tableView2;
import static com.sun.org.apache.xalan.internal.utils.SecuritySupport.getResourceAsStream;


public class Home extends BorderPane {
    private static Home home;
    EmployeeTable table = new EmployeeTable();
    public static TableView tableView1 = new TableView();
    public static Add addSection = Add.getInstance();
    public static HBox hBox2 =new HBox();
    public static VBox[] linkvb = new VBox[5];
    public static HBox gg = new HBox();
    public static FlowPane ff = new FlowPane();
    public static VBox vv = new VBox();
    public static VBox empl = new VBox();
    public static VBox[] bh = new VBox[4];
    public static VBox bhh = new VBox();
    public static ScrollPane scrollPane = new ScrollPane();
    public static Text out = new Text("Outstanding Employee");
    Separator separator = new Separator();
    String[] imName = new String[]{"icon/3.png", "icon/6.png", "icon/9.png", "icon/12.png", "icon/15.png", "icon/17.png", "icon/22.png",
            "icon/24.png", "icon/26.png", "icon/28.png","icon/3.png", "icon/6.png", "icon/9.png", "icon/12.png", "icon/15.png", "icon/17.png", "icon/22.png",
            "icon/24.png", "icon/26.png", "icon/28.png"};
    Image[] images = new Image[20];
    ImageView[] pics = new ImageView[20];

    Text[] tt = new Text[20];
    String[] ttName = new String[]{"Hogen Jiang","Nadeem Akram","Steve Roger","Tom Cruise","Hello Kitty","Han Johnson","Peter Piggy","Gr. Shine","22","12","323","22","12","323","22","12","323","22","12","323"};
    Text[] tt1 = new Text[20];
    String[] ttPosition = new String[]{"CEO","CFO","HR Manager","Accountant","Auditor","Content Writer","HR Officer","Software Analyst","22","12","323","22","12","323","22","12","323","22","12","323"};
    Text[] ttA = new Text[4];
    String[] ttAn = new String[]{"These links download the official GIMP installer for Windows (~140-150 MB).\n The installer contains both 32-bit and 64-bit versions of GIMP,\n and will automatically use the appropriate one. BitTorrent is a peer-to-peer\n file sharing system. It works by downloading GIMP from\n a distributed network of BitTorrent users, and may improve\n download speed dramatically. Choosing this option will download the torrent file for\n the GIMP installer. You may need to install a torrent client to make use\n of this file. "
            ,"These links download language-specific Windows installers for GIMP's local help.\n By default, they will place the help files with your GIMP installation.\nNote: GIMP uses online help by default.\n If you want to use this local help offline, you will need to change GIMP's help settings."
            ,"We had a server move a while back that caused us to lose our existing mirrors \n(moved from physical to virtual server and to an environment that doesn't allow FTP access). \nOn the plus side, we are now able to offer rsync access to download.gimp.org.\nIf you are running one of the existing GIMP mirrors, or want to create a new one, \nplease contact us to get your rsync credentials."
            ,"Remember to stay signed in with your Microsoft account, and you’re golden.\n Your Rewards points will show up next to your account name wherever you go, \nso you can track your progress. If you have a Windows 10 device (and you’re signed in\n to your device with your Microsoft account), you can even earn points by searching for stuff\n on the web through the Search box there on the taskbar. And if you’re signed in with Cortana,\n earn points when Cortana searches Bing."};
    String[] ttLink = new String[]{"https://www.gimp.org/","https://account.microsoft.com/rewards/?lang=en-GB","https://docs.oracle.com/javafx/2/ui_controls/separator.htm","https://docs.oracle.com/javase/8/javafx/user-interface-tutorial/separator.htm#BGBCFDFI"};

    private Home(){

        ImageView imageView = new ImageView("icon/i1.png");
        imageView.setFitWidth(100);
        imageView.setFitHeight(100);

        ImageView imageView2 = new ImageView("icon/i2.png");
        imageView2.setFitWidth(100);
        imageView2.setFitHeight(100);

        ImageView imageView3 = new ImageView("icon/i3.png");
        imageView3.setFitWidth(100);
        imageView3.setFitHeight(100);

        ImageView imageView4 = new ImageView("icon/i4.png");
        imageView4.setFitWidth(100);
        imageView4.setFitHeight(100);

        ImageView imageView5 = new ImageView("icon/i5.png");
        imageView5.setFitWidth(100);
        imageView5.setFitHeight(100);

        ImageView imageView6 = new ImageView("icon/i6.png");
        imageView6.setFitWidth(100);
        imageView6.setFitHeight(100);

        separator.setOrientation(Orientation.VERTICAL);
        separator.setMaxWidth(40);
        separator.setHalignment(HPos.CENTER);
        separator.setStyle("-fx-background-color: grey ;-fx-background-radius: .2");


        ff.setOrientation(Orientation.HORIZONTAL);
        ff.getChildren().addAll(imageView,imageView2,imageView3,separator,imageView4,imageView5,imageView6);
        ff.setHgap(50);



        
        TableColumn idCol = new TableColumn("ID");
        TableColumn firstNameCol = new TableColumn("First Name");
        TableColumn lastNameCol = new TableColumn("Last Name");

        tableView1.getColumns().addAll(idCol,firstNameCol,lastNameCol);

        idCol.setCellValueFactory(
                new PropertyValueFactory<Employee,String>("EmployeeId")
        );

        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<Employee,String>("FirstName")
        );

        lastNameCol.setCellValueFactory(
                new PropertyValueFactory<Employee,String>("LastName")
        );


        tableView1.setItems(FXCollections.observableArrayList(table.getAllEmployees()));
        tableView1.setMaxWidth(218);






            tableView1.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);


        Text text = new Text("Announcement");
        text.setStyle("-fx-font-size: 20px");

        Hyperlink[] link = new Hyperlink[4];


        bhh.getChildren().addAll(text);
        bhh.setSpacing(6);
        for(int i = 0;i<4;i++){
            ttA[i] = new Text(ttAn[i]);
            linkvb[i] = new VBox(ttA[i]);
            link[i] = new Hyperlink(ttLink[i]);
            bh[i] = new VBox(linkvb[i],link[i]);
            bhh.getChildren().add(bh[i]);

        }





        out.setStyle("-fx-font-size: 20px");

        VBox emp = new VBox();
        emp.setSpacing(5);
        HBox[] bb = new HBox[20];
        VBox[] vv1 = new VBox[20];


        for(int i = 0;i<20;i++){
            images[i] = new Image(getResourceAsStream(imName[i]));
            pics[i] = new ImageView(images[i]);
            pics[i].setFitWidth(100);
            pics[i].setPreserveRatio(true);
            tt[i] = new Text(ttName[i]);
            tt1[i] = new Text(ttPosition[i]);
            vv1[i] = new VBox(tt[i],tt1[i]);
            bb[i] = new HBox(pics[i],vv1[i]);
            emp.getChildren().addAll(bb[i]);
        }

        VBox empl = new VBox(out,scrollPane);
        empl.setSpacing(5);



        scrollPane.setMinWidth(230);
        scrollPane.setContent(emp);
        scrollPane.setStyle("-fx-background-color: transparent");


        HBox gg = new HBox(empl,bhh);
        gg.setSpacing(20);


        VBox vv = new VBox(ff,gg);
        vv.setAlignment(Pos.TOP_LEFT);
        vv.setSpacing(6);
        vv.setPadding(new Insets(0,0,0,13));


            Button delete = new Button();
            delete.getStyleClass().remove("button");
            delete.setGraphic(new ImageView("icon/minus.png"));
            delete.setOnAction(e-> {
                Stage newWindow = new Stage();
                    Label label = new Label("Are you sure delete the employees you selected?");

                    Button yes = new Button("Yes");
                    yes.setOnAction(e1->{
                        Employee employee = (Employee) tableView1.getSelectionModel().getSelectedItem();
                        table.deleteEmployee(employee);
                        tableView1.setItems(FXCollections.observableArrayList(table.getAllEmployees()));
                        newWindow.close();
                    });
                    Button no = new Button("No");
                    no.setOnAction(e2->{
                        newWindow.close();
                    });


                    HBox hh = new HBox(yes,no);
                    hh.setSpacing(8);
                    hh.setAlignment(Pos.CENTER);

                    VBox vBox = new VBox(label,hh);
                    vBox.setSpacing(8);
                    vBox.setAlignment(Pos.CENTER);

                    Scene secondScene = new Scene(vBox, 350, 150);

                    // New window (Stage)

                    newWindow.setTitle("Second Stage");
                    newWindow.setScene(secondScene);
                    if (tableView1.getSelectionModel().getSelectedItem() == null){

                    }else{
                        newWindow.show();
                    }

                });

            Button add = new Button();
            add.getStyleClass().remove("button");
            add.setGraphic(new ImageView("icon/positive.png"));
            add.setOnAction(e->{
                    hBox2.getChildren().removeAll(addSection);
                    hBox2.getChildren().add(addSection);
                    hBox2.setAlignment(Pos.BASELINE_LEFT);
                    this.setCenter(hBox2);
            });

            Button more = new Button();
            more.getStyleClass().remove("button");
            more.setGraphic(new ImageView("icon/more.png"));
            more.setOnAction(e->{

            });


            VBox vvv = new VBox(add,delete,more);
            vvv.setSpacing(7);

            HBox hh = new HBox(vvv,tableView1);
            hh.setSpacing(7);





        this.setPadding(new Insets(0,0,0,15));
        this.setLeft(hh);
        this.setCenter(vv);


    }

    public static Home getInstance() {
        home = new Home();
        return home;
    }

    private void applyCustomColorSequence(ObservableList<PieChart.Data> pieChartData, String... pieColors) {
        int i = 0;
        for (PieChart.Data data : pieChartData) {
            data.getNode().setStyle("-fx-pie-color: " + pieColors[i % pieColors.length] + ";");
            i++;
        }
    }


    }