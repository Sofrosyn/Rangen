
package secret;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import secret.LockController;
/**
 *
 * @author Sofrosyn
 */
public class Secret extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
       
        Parent root = FXMLLoader.load(getClass().getResource("save.fxml"));
        
        Scene scene = new Scene(root, 500, 500);	
      // Scene scene = new Scene(root, 900, 900,Color.TRANSPARENT);	
     
        scene.getStylesheets().add("/secret/styles.css");
        primaryStage.setTitle("Hello World!");
        //primaryStage.initStyle(StageStyle.TRANSPARENT);
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
