/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secret;

import com.jfoenix.controls.JFXButton;
import com.sun.glass.ui.Cursor;
import secret.DiaryController;		
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import de.jensd.fx.glyphs.materialdesignicons.MaterialDesignIconView;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.StrokeTransition;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.effect.InnerShadow;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;
import jfxtras.labs.scene.control.grid.GridCell;


/**
 * FXML Controller class
 *
 * @author Sofrosyn
 */
public class LockController implements Initializable {

    @FXML
    private AnchorPane anchor;
    @FXML
    private JFXButton clearBut;
    Delta dragDelta = new Delta();
    @FXML
    private JFXButton but1;
    @FXML
    private JFXButton but2;
    @FXML
    private JFXButton but3;
    @FXML
    private JFXButton but4;
    @FXML
    private JFXButton but5;
    @FXML
    private JFXButton but6;
    @FXML
    private JFXButton but7;
    @FXML
    private JFXButton but8;
    @FXML
    private JFXButton but9;
    @FXML
    private JFXButton but10;
    @FXML
    private JFXButton but11;
    @FXML
    private JFXButton but12;
    @FXML
    private JFXButton but13;
    @FXML
    private JFXButton but14;
    @FXML
    private JFXButton but15;
    @FXML
    private JFXButton but16;
    @FXML
    private JFXButton but17;
    @FXML
    private JFXButton but18;
    @FXML
    private JFXButton but19;
    @FXML
    private JFXButton but20;
    @FXML
    private JFXButton but21;
    @FXML
    private JFXButton but22;
    @FXML
    private JFXButton but23;
    @FXML
    private JFXButton but24;
    @FXML
    private JFXButton but25;
    @FXML
    private JFXButton but26;
    @FXML
    private JFXButton but27;
    @FXML
    private JFXButton but28;
    @FXML
    private JFXButton but29;
    @FXML
    private JFXButton but30;
    @FXML
    private JFXButton but31;
    @FXML
    private JFXButton but32;
    @FXML
    private JFXButton but33;
    @FXML
    private JFXButton but34;
    @FXML
    private JFXButton but35;
    @FXML
    private JFXButton but36;
    @FXML
    private JFXButton but37;
    @FXML
    private JFXButton but38;
    @FXML
    private JFXButton but39;
    @FXML
    private JFXButton but40;
    @FXML
    private JFXButton but41;
    @FXML
    private JFXButton but42;
    @FXML
    private JFXButton but43;
    @FXML
    private JFXButton but44;
    @FXML
    private JFXButton but45;
    @FXML
    private JFXButton but46;
    @FXML
    private JFXButton but47;
    @FXML
    private JFXButton but48;
    @FXML
    private JFXButton but49;
    @FXML
    private JFXButton but50;
    @FXML
    private JFXButton enterBut;
    @FXML
    private FontAwesomeIconView close;
    @FXML
    private HBox gridBox;
    @FXML
    private GridCell<String> grid1;
    @FXML
    private Rectangle rec1;
    @FXML
    private Rectangle rec2;
    @FXML
    private GridCell<String> grid2;
    @FXML
    private Rectangle rec3;
    @FXML
    private GridCell<String> grid3;
    @FXML
    private Rectangle rec4;
    @FXML
    private GridCell<String> grid4;
    @FXML
    private Rectangle rec5;
    @FXML
    private GridCell<String> grid5;    
    @FXML
    private MaterialDesignIconView andriod;
    @FXML
    private FontAwesomeIconView link;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {  	
    	
    	initiate();	getDrag();	     input();        	
    }  	
      	
      	  
    
    
        
 
public void addDrag(JFXButton button){    
/*button.setOnMousePressed((e)->{
dragDelta.x = button.getLayoutX()- e.getSceneX();
dragDelta.y = button.getLayoutY() - e.getSceneY();
button.setCursor(javafx.scene.Cursor.CLOSED_HAND);
});
button.setOnMouseDragged((e)->{
button.setLayoutX(e.getSceneX() + dragDelta.x);
button.setLayoutY(e.getSceneY() + dragDelta.y);
});
button.setOnMouseEntered((e)->{
button.setCursor(javafx.scene.Cursor.OPEN_HAND);
});    
button.setOnMouseExited((e)->{
button.setCursor(javafx.scene.Cursor.DISAPPEAR);
}); 
*/

    }
    
    public void getDrag() {
    	  	anchor.setTranslateX(200);
          	anchor.setTranslateY(200);
      	  	anchor.setStyle("-fx-background-color : #00000000 ;");     
      	  	anchor.setOnMousePressed((e)->{
          	dragDelta.x = anchor.getLayoutX()- e.getSceneX();
          	dragDelta.y = anchor.getLayoutY() - e.getSceneY();
          	anchor.setCursor(javafx.scene.Cursor.CLOSED_HAND);
          	});
          	anchor.setOnMouseDragged((e)->{
          	anchor.setLayoutX(e.getSceneX() + dragDelta.x);
          	anchor.setLayoutY(e.getSceneY() + dragDelta.y);
          	});
           	
    /*       addDrag(but1); 				addDrag(but2); 				addDrag(but3); 
    	   addDrag(but4); 				addDrag(but5); 				addDrag(but6); 	
    	   addDrag(but7); 				addDrag(but8); 				addDrag(but9); 	
    	   addDrag(but10); 				addDrag(but11); 			addDrag(but12);
    	   addDrag(but13); 				addDrag(but14); 			addDrag(but15);
    	   addDrag(but16); 				addDrag(but17); 			addDrag(but18);
    	   addDrag(but19); 				addDrag(but20); 			addDrag(but22);
    	   addDrag(but23); 				addDrag(but24);				addDrag(but25);    	    	 	
    	   addDrag(but26); 				addDrag(but27); 			addDrag(but28); 	
    	   addDrag(but29); 				addDrag(but30);				addDrag(but31);
    	   addDrag(but32); 				addDrag(but33);				addDrag(but34);
    	   addDrag(but35); 				addDrag(but36);				addDrag(but37); 
    	   addDrag(but38);				addDrag(but39);				addDrag(but40);
    	   addDrag(but41);				addDrag(but42);				addDrag(but43);
    	   addDrag(but44); 				addDrag(but45);				addDrag(but46); 
    	   addDrag(but47); 	 			addDrag(but48);				addDrag(but49); 	
    	   addDrag(but50);				addDrag(playBut);			addDrag(clearBut); 		
 */   	   	

    	    	
    	   setClick1(but1);		setClick1(but2);	setClick1(but3);	setClick1(but4);	setClick1(but5);
    	   setClick1(but6);		setClick1(but7);	setClick1(but8);	setClick1(but9);	setClick1(but10);
    	    	
    	   setClick2(but11);	setClick2(but12);	setClick2(but13);	setClick2(but14);	setClick2(but15);
    	   setClick2(but16);	setClick2(but17);	setClick2(but18);	setClick2(but19);	setClick2(but20); 	
    	    	
    	   setClick3(but21);	setClick3(but22);	setClick3(but23);	setClick3(but24);	setClick3(but25);
    	   setClick3(but26);	setClick3(but27);	setClick3(but28);	setClick3(but29);	setClick3(but30); 	
    	   
    	   setClick4(but31);	setClick4(but32);	setClick4(but33);	setClick4(but34);	setClick4(but35);
    	   setClick4(but36);	setClick4(but37);	setClick4(but38);	setClick4(but39);	setClick4(but40); 	
    	   	
    	   setClick5(but41);	setClick5(but42);	setClick5(but43);	setClick5(but44);	setClick5(but45);
    	   setClick5(but46);	setClick5(but47);	setClick5(but48);	setClick5(but49);	setClick5(but50); 	
    	    	  
 
    	  clearBut.setOnMousePressed((e)->{grid1.setText("A"); grid2.setText("A");
    	  grid2.setText("A");	grid3.setText("A");	grid5.setText("A");
    	  });
    	   close.setOnMousePressed((e)->{System.exit(0);});
}	
    
    @FXML
    private void enterSecrets(ActionEvent event) throws SQLException, ClassNotFoundException {      	    	    	    
if(grid1.getText().equalsIgnoreCase("R") && grid2.getText().equalsIgnoreCase("E") && grid3.getText().equalsIgnoreCase("G")
		&& grid4.getText().equalsIgnoreCase("I")&& grid5.getText().equalsIgnoreCase("N") ) 

{  ((Node) event.getSource()).getScene().getWindow().hide();
	try{
    Stage userStage = new Stage();
    FXMLLoader loader = new FXMLLoader();
    Pane root = (Pane)loader.load(getClass().getResource("/secret/Diary.fxml").openStream());
    DiaryController diaryController = (DiaryController)loader.getController();
    Scene scene = new Scene(root,505,470);            
    userStage.setScene(scene);
    userStage.setTitle("ADMINISRATION");
    userStage.setResizable(false);
    userStage.show();
} catch (IOException e){
    e.printStackTrace();
}

	
	
}else {System.out.println("not done");}
    
    
    }

    	public void input() {  
   
	    grid1.textProperty().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
	    	RotateTransition rotateTransition = new RotateTransition();
	    	StrokeTransition stroke = new StrokeTransition();
	    	
	    	if (newValue.equalsIgnoreCase("R")) {
            	rotateTransition = new RotateTransition(Duration.seconds(15), grid1);
            	rotateTransition.setFromAngle(0);
                rotateTransition.setToAngle(720);
                rotateTransition.setCycleCount(Timeline.INDEFINITE);
                rotateTransition.setAutoReverse(false);

               stroke = new StrokeTransition(Duration.seconds(5), rec1, Color.AQUAMARINE,Color.CORAL);
               stroke.setFromValue(Color.CHARTREUSE); 
               stroke.setToValue(Color.ANTIQUEWHITE);
               stroke.setCycleCount(Timeline.INDEFINITE);
               stroke.setInterpolator(Interpolator.EASE_OUT);
               stroke.setAutoReverse(true);
                
                rotateTransition.play();
                stroke.play();               
           }if(!(newValue.equalsIgnoreCase("R"))) {rotateTransition.stop(); stroke.stop();               }
        });
	    grid2.textProperty().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
	    	RotateTransition rotateTransition = new RotateTransition();
	    	StrokeTransition stroke = new StrokeTransition();
	   
	    	if (newValue.equalsIgnoreCase("E")) {
	    		rotateTransition = new RotateTransition(Duration.seconds(15), grid2);
	    		rotateTransition.setFromAngle(0);
	    		rotateTransition.setToAngle(720);
	    		rotateTransition.setCycleCount(Timeline.INDEFINITE);
	    		rotateTransition.setAutoReverse(false);
	    		
	    		stroke = new StrokeTransition(Duration.seconds(5), rec2, Color.DARKBLUE,Color.CRIMSON);
	    		stroke.setFromValue(Color.CHARTREUSE); 
	    		stroke.setToValue(Color.ANTIQUEWHITE);
	    		stroke.setCycleCount(Timeline.INDEFINITE);
	    		stroke.setInterpolator(Interpolator.EASE_OUT);
	    		stroke.setAutoReverse(true);
	    		
	    		rotateTransition.play();
	    		stroke.play();               
	    	}if(!(newValue.equalsIgnoreCase("E"))) {rotateTransition.stop(); stroke.stop();               }
	    });
	    grid3.textProperty().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
	    	RotateTransition rotateTransition = new RotateTransition();
	    	StrokeTransition stroke = new StrokeTransition();
	    	
	    	if (newValue.equalsIgnoreCase("G")) {
	    		rotateTransition = new RotateTransition(Duration.seconds(15), grid3);
	    		rotateTransition.setFromAngle(0);
	    		rotateTransition.setToAngle(720);
	    		rotateTransition.setCycleCount(Timeline.INDEFINITE);
	    		rotateTransition.setAutoReverse(false);
	    		
	    		stroke = new StrokeTransition(Duration.seconds(5), rec3, Color.DARKKHAKI,Color.DARKGREEN);
	    		stroke.setFromValue(Color.CHARTREUSE); 
	            stroke.setToValue(Color.ANTIQUEWHITE);
	    		stroke.setCycleCount(Timeline.INDEFINITE);
	    		stroke.setInterpolator(Interpolator.EASE_OUT);
	    		stroke.setAutoReverse(true);
	    		
	    		rotateTransition.play();
	    		stroke.play();               
	    	}if(!(newValue.equalsIgnoreCase("G"))) {rotateTransition.stop(); stroke.stop();               }
	    });
	    grid4.textProperty().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
	    	RotateTransition rotateTransition = new RotateTransition();
	    	StrokeTransition stroke = new StrokeTransition();
	    	if (newValue.equalsIgnoreCase("I")) {
	    		rotateTransition = new RotateTransition(Duration.seconds(15), grid4);
	    		rotateTransition.setFromAngle(0);
	    		rotateTransition.setToAngle(720);
	    		rotateTransition.setCycleCount(Timeline.INDEFINITE);
	    		rotateTransition.setAutoReverse(false);
	    		
	    		stroke = new StrokeTransition(Duration.seconds(5), rec4, Color.DARKGREY,Color.BLANCHEDALMOND);
	    		stroke.setFromValue(Color.CHARTREUSE); 
	            stroke.setToValue(Color.ANTIQUEWHITE);    
	    		stroke.setCycleCount(Timeline.INDEFINITE);
	    		stroke.setInterpolator(Interpolator.EASE_OUT);
	    		stroke.setAutoReverse(true);
	    		
	    		rotateTransition.play();
	    		stroke.play();               
	    	}if(!(newValue.equalsIgnoreCase("I"))) {rotateTransition.stop(); stroke.stop();               }
	    });
	    grid5.textProperty().addListener((ObservableValue<? extends String> observable, String oldValue, String newValue) -> {
	    	RotateTransition rotateTransition = new RotateTransition();
	    	StrokeTransition stroke = new StrokeTransition();
	    	if (newValue.equalsIgnoreCase("N")) {
	    		rotateTransition = new RotateTransition(Duration.seconds(15), grid5);
	    		rotateTransition.setFromAngle(0);
	    		rotateTransition.setToAngle(720);
	    		rotateTransition.setCycleCount(Timeline.INDEFINITE);
	    		rotateTransition.setAutoReverse(false);
	    		
	    		stroke = new StrokeTransition(Duration.seconds(5), rec5, Color.DARKRED,Color.DARKORANGE);
	    		stroke.setFromValue(Color.CHARTREUSE); 
	            stroke.setToValue(Color.ANTIQUEWHITE);    
	    		stroke.setCycleCount(Timeline.INDEFINITE);
	    		stroke.setInterpolator(Interpolator.EASE_OUT);
	    		stroke.setAutoReverse(true);
	    		
	    		rotateTransition.play();
	    		stroke.play();               
	    	}if(!(newValue.equalsIgnoreCase("N"))) {rotateTransition.stop(); stroke.stop();               }
	    
	    });
	         		
}
    
    	
public void setClick1(JFXButton button) {
 button.setOnMouseClicked((e)->{grid1.setText(button.getText());});	
 
 button.setOnMousePressed((e)->{
	 dragDelta.x = button.getLayoutX()- e.getSceneX();
	 dragDelta.y = button.getLayoutY() - e.getSceneY();
	 button.setCursor(javafx.scene.Cursor.CLOSED_HAND);
	 });
 button.setOnMouseDragged((e)->{
	 button.setLayoutX(e.getSceneX() + dragDelta.x);
	 button.setLayoutY(e.getSceneY() + dragDelta.y);
	 });
	 
 button.setOnMouseEntered((e)->{
	 button.setCursor(javafx.scene.Cursor.OPEN_HAND);
	 });    

 	button.setOnMouseExited((e)->{
	 button.setCursor(javafx.scene.Cursor.DISAPPEAR);
	 }); 

}     	

public void setClick2(JFXButton button) {
	button.setOnMouseClicked((e)->{grid2.setText(button.getText());});	
	 button.setOnMousePressed((e)->{
		 dragDelta.x = button.getLayoutX()- e.getSceneX();
		 dragDelta.y = button.getLayoutY() - e.getSceneY();
		 button.setCursor(javafx.scene.Cursor.CLOSED_HAND);
		 });
	 button.setOnMouseDragged((e)->{
		 button.setLayoutX(e.getSceneX() + dragDelta.x);
		 button.setLayoutY(e.getSceneY() + dragDelta.y);
		 });
		 
	 button.setOnMouseEntered((e)->{
		 button.setCursor(javafx.scene.Cursor.OPEN_HAND);
		 });    

	 	button.setOnMouseExited((e)->{
		 button.setCursor(javafx.scene.Cursor.DISAPPEAR);
		 }); 
}     	

public void setClick3(JFXButton button) {
	button.setOnMouseClicked((e)->{grid3.setText(button.getText());});	

	 button.setOnMousePressed((e)->{
		 dragDelta.x = button.getLayoutX()- e.getSceneX();
		 dragDelta.y = button.getLayoutY() - e.getSceneY();
		 button.setCursor(javafx.scene.Cursor.CLOSED_HAND);
		 });
	 button.setOnMouseDragged((e)->{
		 button.setLayoutX(e.getSceneX() + dragDelta.x);
		 button.setLayoutY(e.getSceneY() + dragDelta.y);
		 });
		 
	 button.setOnMouseEntered((e)->{
		 button.setCursor(javafx.scene.Cursor.OPEN_HAND);
		 });    

	 	button.setOnMouseExited((e)->{
		 button.setCursor(javafx.scene.Cursor.DISAPPEAR);
		 }); 
	 	
}     	
public void setClick4(JFXButton button) {
	button.setOnMouseClicked((e)->{grid4.setText(button.getText());});	
	 button.setOnMousePressed((e)->{
		 dragDelta.x = button.getLayoutX()- e.getSceneX();
		 dragDelta.y = button.getLayoutY() - e.getSceneY();
		 button.setCursor(javafx.scene.Cursor.CLOSED_HAND);
		 });
	 button.setOnMouseDragged((e)->{
		 button.setLayoutX(e.getSceneX() + dragDelta.x);
		 button.setLayoutY(e.getSceneY() + dragDelta.y);
		 });
		 
	 button.setOnMouseEntered((e)->{
		 button.setCursor(javafx.scene.Cursor.OPEN_HAND);
		 });    

	 	button.setOnMouseExited((e)->{
		 button.setCursor(javafx.scene.Cursor.DISAPPEAR);
		 }); 
}     	
public void setClick5(JFXButton button) {
	button.setOnMouseClicked((e)->{grid5.setText(button.getText());});	
	
	button.setOnMousePressed((e)->{
		 dragDelta.x = button.getLayoutX()- e.getSceneX();
		 dragDelta.y = button.getLayoutY() - e.getSceneY();
		 button.setCursor(javafx.scene.Cursor.CLOSED_HAND);
		 });
	 button.setOnMouseDragged((e)->{
		 button.setLayoutX(e.getSceneX() + dragDelta.x);
		 button.setLayoutY(e.getSceneY() + dragDelta.y);
		 });
		 
	 button.setOnMouseEntered((e)->{
		 button.setCursor(javafx.scene.Cursor.OPEN_HAND);
		 });    

	 	button.setOnMouseExited((e)->{
		 button.setCursor(javafx.scene.Cursor.DISAPPEAR);
		 }); 
}     	
    
public void initiate() {
	Thread anime = new Thread(() -> {
	enterBut.setGraphic(andriod);
	clearBut.setGraphic(link);	
		Platform.runLater(() -> {
        
	});
	
	});
	anime.start();
}    
    
    
    
    
    
    
       	
    
    
    
    
    
    
class Delta{
double x,y;
}
    

    
    
}
