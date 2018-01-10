/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redge;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author pecwill-tech
 */
public class REDGE extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
       Parent root = FXMLLoader.load(getClass().getResource("/gui/LOGIN.fxml"));
        
        Scene scene = new Scene(root, 346, 451);
        
        primaryStage.setTitle(" REGEN ");
        primaryStage.setScene(scene);
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
