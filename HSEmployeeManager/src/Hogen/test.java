package Hogen;

import javafx.application.Application;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.*;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

import javax.imageio.ImageIO;
import javafx.scene.control.Button;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;


public class test extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    private ImageView profile = new ImageView();

//    @Override
//    public void start(Stage primaryStage) {
//        BorderPane root = new BorderPane();
//
//        Image image2 = new Image("icon/profile.jpg");
//
//        profile.setImage(image2);
//        profile.setFitHeight(213);
//        profile.setFitWidth(160);
//
//        Scene scenea = new Scene(root,1024,768);
//        scenea.getStylesheets().add("CSS/combo.css");
//        primaryStage.setScene(scenea);
//        primaryStage.setResizable(true);
//        primaryStage.show();
//    }


    private static final int IMAGE_WIDTH = 10;
    private static final int IMAGE_HEIGHT = 10;
    private byte imageData[] = new byte[IMAGE_WIDTH * IMAGE_HEIGHT * 3];
    // Drawing Surface (Canvas)
    private GraphicsContext gc;
    private Canvas canvas;
    private Group root;

    @Override
    public void start(Stage primaryStage) {
//        primaryStage.setTitle("PixelWriter Test");
//        root = new Group();
//        canvas = new Canvas(200, 200);
//        canvas.setTranslateX(100);
//        canvas.setTranslateY(100);
//        gc = canvas.getGraphicsContext2D();
        createImageData();
//        drawImageData();


                BorderPane root1 = new BorderPane();
                Image image2 = new Image("icon/profile.jpg");

        profile.setImage(image2);
        profile.setFitHeight(213);
        profile.setFitWidth(160);

        Button button = new Button("Capture");


        VBox vv = new VBox(button);
        vv.setAlignment(Pos.CENTER);

        root1.setCenter(profile);
        root1.setBottom(vv);


        Scene scene = new Scene(root1, 1024, 768);
        primaryStage.setScene(scene);
        primaryStage.show();


        button.setOnAction(e->{
            WritableImage writableImage = scene.snapshot(null);

            // Write snapshot to file system as a .png image
            File outFile = new File("imageops-snapshot.png");
            try {
                ImageIO.write(SwingFXUtils.fromFXImage(writableImage, null),
                        "png", outFile);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        });
        //Take snapshot of the scene

    }

    private void createImageData() {
        int i = 0;
        for (int y = 0; y < IMAGE_HEIGHT; y++) {
            System.out.println("y: " + y);
            int r = y * 255 / IMAGE_HEIGHT;
            for (int x = 0; x < IMAGE_WIDTH; x++) {
                System.out.println("\tx: " + x);
                int g = x * 255 / IMAGE_WIDTH;
                imageData[i] = (byte) r;
                imageData[i + 1] = (byte) g;
                System.out.println("\t\tR: " + (byte) r);
                System.out.println("\t\tG: " + (byte) g);
                i += 3;
            }
        }
        System.out.println("imageData.lengthdrawImageData: " + imageData.length);
    }

//    private void drawImageData() {
//        boolean on = true;
//        PixelWriter pixelWriter = gc.getPixelWriter();
//        PixelFormat<ByteBuffer> pixelFormat = PixelFormat.getByteRgbInstance();
//        for (int y = 50; y < 150; y += IMAGE_HEIGHT) {
//            for (int x = 50; x < 150; x += IMAGE_WIDTH) {
//                if (on) {
//                    pixelWriter.setPixels(x, y, IMAGE_WIDTH,
//                            IMAGE_HEIGHT, pixelFormat,
//                            imageData, 0, IMAGE_WIDTH * 3);
//                }
//                on = !on;
//            }
//            on = !on;
//        }
//
//        // Add drop shadow effect
//        gc.applyEffect(new DropShadow(20, 20, 20, Color.GRAY));
//        root.getChildren().add(canvas);
//    }





    }




