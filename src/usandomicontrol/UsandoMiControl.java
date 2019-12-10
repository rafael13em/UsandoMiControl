/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usandomicontrol;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import micontrol.MiControl;

/**
 *
 * @author rafae
 */
public class UsandoMiControl extends Application {
    
    private Integer cont = 0;
    
    @Override
    public void start(Stage primaryStage) {
        MiControl mcontrol = new MiControl();
        mcontrol.setMaxHeight(100);
        mcontrol.setMaxWidth(100);
        Label lb = new Label();
        mcontrol.setOnAction(event ->{
            cont++;
            lb.setText("MiControl pulsado "+cont+" veces");
        });
        
        BorderPane root = new BorderPane();
        root.setBottom(lb);
        root.setCenter(mcontrol);
        Scene scene = new Scene(root, 400, 400);
        primaryStage.setTitle("Usando Mi Control");
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
