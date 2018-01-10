package splash;

import java.net.URL;
import java.util.ResourceBundle;

import org.controlsfx.control.GridCell;

import com.jfoenix.controls.JFXButton;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import de.jensd.fx.glyphs.materialdesignicons.MaterialDesignIconView;
import javafx.animation.Interpolator;
import javafx.animation.StrokeTransition;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.util.Duration;

public class Splash implements Initializable {
	@FXML
    private Line line1;
    @FXML
    private Line line2;
    @FXML
    private Line line3;
    @FXML
    private Line line4;
    @FXML
    private Line line5;
    @FXML
    private Line line6;
    @FXML
    private Line line7;
    @FXML
    private Line line8;
    @FXML
    private Circle circle1;
    @FXML
    private Circle circle2;
    @FXML
    private Line line9;
    
    @FXML
    private GridPane gridPane;
    @FXML
    private HBox gridBox;
    @FXML
    private GridCell<String> grid1;
    @FXML
    private GridCell<String> grid2;
    @FXML
    private GridCell<String> grid3;
    @FXML
    private GridCell<String> grid4;
    @FXML
    private JFXButton enterButton;
    @FXML
    private FontAwesomeIconView close;
    @FXML
    private Label time;

    @FXML
    private JFXButton button1;
    @FXML
    private JFXButton button2;
    @FXML
    private JFXButton button3;
    @FXML
    private JFXButton button4;
    @FXML
    private JFXButton button5;
    @FXML
    private JFXButton button6;
    @FXML
    private JFXButton button7;
    @FXML
    private JFXButton button8;
    @FXML
    private JFXButton button9;    
    @FXML
    private MaterialDesignIconView andriod;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    	  enterButton.setGraphic(andriod);
    	  
    		password();
    valid();	
    	
    }
    
    
  // bot animation    
    public void animation(Line line) {
    	StrokeTransition stroke = new StrokeTransition(Duration.seconds(5), line,Color.GREEN,Color.CHARTREUSE); 	
    	stroke.setCycleCount(Timeline.INDEFINITE);
    	stroke.setInterpolator(Interpolator.EASE_OUT);
    	stroke.setAutoReverse(true); 	  	
    	stroke.play();
    }
    public void animation2(Line line) {
    	StrokeTransition stroke = new StrokeTransition(Duration.seconds(5), line,Color.ORANGE,Color.YELLOW); 	
       	stroke.setCycleCount(Timeline.INDEFINITE);
       	stroke.setInterpolator(Interpolator.EASE_OUT);
       	stroke.setAutoReverse(true); 	  	
       	stroke.play();   
       }
    public void animation3(Line line) {
    	StrokeTransition stroke = new StrokeTransition(Duration.seconds(5), line,Color.RED,Color.DARKRED); 	
       	stroke.setCycleCount(Timeline.INDEFINITE);
       	stroke.setInterpolator(Interpolator.EASE_OUT);
       	stroke.setAutoReverse(true); 	  	
       	stroke.play();   
       }
    
  public void valid() {
  animation(line1);  	
  animation(line2);  	
  animation(line3);  	
  animation(line4);  	
  animation(line5);  	
  animation(line6);  	
  animation(line7);  	
  animation(line8);  	
  animation(line9);  	 	 	
   
  
  }
    
  public void warning() {
	  animation2(line1);  	
	  animation2(line2);  	
	  animation2(line3);  	
	  animation2(line4);  	
	  animation2(line5);  	
	  animation2(line6);  	
	  animation2(line7);  	
	  animation2(line8);  	
	  animation2(line9);  	 	 	
	    }
  public void fail() {
	  animation3(line1);  	
	  animation3(line2);  	
	  animation3(line3);  	
	  animation3(line4);  	
	  animation3(line5);  	
	  animation3(line6);  	
	  animation3(line7);  	
	  animation3(line8);  	
	  animation3(line9);  	 	 	
	    }
  	  	    
 public void getText1(JFXButton button) 
 {
 button.setOnMouseClicked((e)->{grid1.setText(button.getText());} );
 } 

 public void getText2(JFXButton button) 
 {
 button.setOnMouseClicked((e)->{grid2.setText(button.getText());} );
 } 
 
 public void getText3(JFXButton button) 
 {
 button.setOnMouseClicked((e)->{grid3.setText(button.getText());} );
 } 
 public void getText4(JFXButton button) 
 {
 button.setOnMouseClicked((e)->{grid4.setText(button.getText());} );
 } 

  @FXML
  void EndApplication(MouseEvent event) {System.exit(0); }

  @FXML
  void EnterApplication(ActionEvent event) {
for(int i = 5; 1<i; i-- ) {
	
	if(grid1.getText().equalsIgnoreCase("A") && grid2.getText().equalsIgnoreCase("E")) {System.out.println("done");
	
	}else {time.setText(String.valueOf(i));}
	}	  

}
	  
 public void setClick1() {
	 getText1(button1);getText1(button2);getText1(button5);
	 
	 }
 public void setClick2() {
	 
	 getText2(button6);getText2(button7);
 }
 public void setClick3() {
	 getText3(button8);getText3(button9);	
	 
 }
 public void setClick4() {
	 getText4(button3);getText4(button4);
	 
 }
public void password() {
	for(int i = 1; i<3;i++) {setClick2();}
	for(int i = 1; i<3; i++) {setClick1();}
	for(int i = 1; i<3;i++) {setClick4();}
	for(int i = 1; i<3; i++) {setClick3();}
}
		
		
	
	  
	  
	  
	  
	  
      
    
    
    
    public static void main(String[] args) {		}

}
