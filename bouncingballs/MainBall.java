/*
    Max Perrigo
    James chen 1410
    version 1.0
    Bouncing Balls HW3
*/
package bouncingballs;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MainBall extends Application  {
    public static BallPane root = new BallPane();
    
    @Override
    public void start(Stage primaryStage) {
       
        root.setStyle("-fx-border-color: black");
        root.setStyle("-fx-background-color: white");

        BorderPane bp = new BorderPane();
        HBox btnbox = new HBox(10);
        StackPane sp = new StackPane();
        Scene scene = new Scene( bp, 300, 250);
        
        Button btn = new Button("Remove");
        btn.setOnMousePressed(e -> root.subtract());  // sets what the remove button does      
        
        Button btnClose = new Button("Close");
        btnClose.setOnMouseClicked(e -> primaryStage.close());// sets what the close button does
        
        Slider sb = new Slider();
        sb.setMax(20);
        sb.setMin(5);
        sp.getChildren().add(sb);
        root.rateProperty().bind(sb.valueProperty());
        btnbox.getChildren().addAll( btn, btnClose, sp);// adds buttons and stackpane to the pane
        btnbox.setAlignment(Pos.CENTER);        
        
        bp.setCenter(root);
        bp.setBottom(btnbox);// sets position of the panes in the frame
        
        root.setOnMouseClicked(e -> root.add());
        btn.setOnMousePressed(e -> root.subtract());// user events to add and remove the balls
        
        primaryStage.setTitle("Coolest Bouncing Balls Ever");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }




    
}
