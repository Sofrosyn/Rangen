/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redge;
import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.animation.SequentialTransition;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author pecwill-tech
 */
public class BetController implements Initializable {   
    @FXML
    private StackPane stack1;
    @FXML
    private Text text1;
    @FXML
    private ToggleGroup tog;
    @FXML
    private ToggleButton red;
    @FXML
    private ToggleButton blue;
    @FXML
    private ToggleButton yellow;
    @FXML
    private ToggleButton green;
   
    @FXML
    private JFXButton play;
   //pick a color label
    
    @FXML
    private Label pick;
    //show color choice
    
    @FXML
    private Label colour;
    @FXML
    private Circle circle1;
     @FXML
    private StackPane stack2;
    @FXML
    private Circle circle2;
    @FXML
    private Text text2;  
    @FXML
    private Label regen;
    @FXML
    private StackPane stack4;
    @FXML
    private Circle circle4;
    @FXML
    private Text text4;
    @FXML
    private StackPane stack3;
    @FXML
    private Circle circle3;
    @FXML
    private Text text3;
    @FXML
    private StackPane stack5;
    @FXML
    private Circle circle5;
    @FXML
    private Text text5;   
    @FXML
    private HBox hbox;
    @FXML
    private Label show;
    @FXML
    private ChoiceBox oddChoice;
    @FXML
    private Label lblTimer;
    
        // no 1-49 that will be parse on to the Text node 
        Random rand = new Random();
   
        // generate 3 random no for color
        Random col = new Random();
        // fade animation for the stackpane(contains circle and text nodes) 
        FadeTransition fade1, fade2,fade3,fade4,fade5;
            
        // animation to house fade animation so as to play serially
        SequentialTransition order;
        
    /**
     * Initializes the controller class.
     */
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       // hide all the stackpane at initilization
        hideStack();
    // initilize values for choice box
        ObservableList<String> options =
         FXCollections.observableArrayList("1","2","3","4","5");
            oddChoice.setValue("1");
               oddChoice.setItems(options);    
    }   
   
    //random numbers from rand
    int rom1,rom2,rom3,rom4,rom5;
      // hold string value of int rand  
    String con1,con2,con3,con4,con5;
        
        // generate color
        int  col1,col2,col3,col4,col5;
        
    @FXML
    private void redAction(ActionEvent event) {
        if (red.isSelected()){
            pick.setVisible(false);
            colour.setText("RED");
            colour.setStyle("-fx-text-fill:  #e40f0f;");
        }else {
            pick.setVisible(true);
           colour.setText("Colour"); 
           colour.setStyle("-fx-text-fill: #100101;"); }                   
    }

    @FXML
    private void blueAction(ActionEvent event) {
        if (blue.isSelected()){
            pick.setVisible(false);
            colour.setText("BLUE");
            colour.setStyle("-fx-text-fill:  #1d0fb8;");
        }else {
            pick.setVisible(true);
           colour.setText("Colour"); 
           colour.setStyle("-fx-text-fill: #100101;");   }                     
    }

    @FXML
    private void yellowAction(ActionEvent event) {
        if (yellow.isSelected()){
            pick.setVisible(false);
            colour.setText("YELLOW");
            colour.setStyle("-fx-text-fill: #e7c208;");
        }else {
            pick.setVisible(true);
           colour.setText("Colour"); 
           colour.setStyle("-fx-text-fill: #100101;");  }                     
    }

    @FXML
    private void greenAction(ActionEvent event) {
        if (green.isSelected()){
            pick.setVisible(false);
            colour.setText("GREEN");
            colour.setStyle("-fx-text-fill:  #1eb818;");
        }else {
            pick.setVisible(true);
           colour.setText("Colour"); 
           colour.setStyle("-fx-text-fill: #100101;");  }                     
    }

    @FXML
    private void playAction(ActionEvent event) throws InterruptedException {
        genColour();
        hideStack();
        
        play.setDisable(true);
        hbox.setDisable(true);
        oddChoice.setDisable(true);
              //set transitions
            keyChain();
  // enable play button, choice box , toggle group
       
        // generate random number 1-49 then place in equivalent text node
        rom1 = rand.nextInt(49)+1;
        rom2 = rand.nextInt(49)+1;
        rom3 = rand.nextInt(49)+1;
        rom4 = rand.nextInt(49)+1;
        rom5 = rand.nextInt(49)+1;
        
        // convert the integer value of random numbers to string
       con1 = String.valueOf(rom1);
       con2 = String.valueOf(rom2);
       con3 = String.valueOf(rom3);
       con4 = String.valueOf(rom4);
       con5 = String.valueOf(rom5);
 
       // set random number to text
        text1.setText(con1);
        text2.setText(con1);
        text2.setText(con2);
        text3.setText(con3);
        text4.setText(con4);
        text5.setText(con5);  
    }
        //algorithm for color generation
    public void genColour(){
        
        col1 = col.nextInt(4)+1;
        col2 = col.nextInt(4)+1;
        col3 = col.nextInt(4)+1;
        col4 = col.nextInt(4)+1;
        col5 = col.nextInt(4)+1;        
         
       switch (col1){
           case 1: circle1.setFill(Color.DARKGREEN); break;
           case 2: circle1.setFill(Color.DARKBLUE); break;
           case 3: circle1.setFill(Color.DARKORANGE); break;
           case 4: circle1.setFill(Color.MAROON); break;
       }
       switch (col2){
           case 1: circle2.setFill(Color.MAROON); break;
           case 2: circle2.setFill(Color.DARKORANGE); break;
           case 3: circle2.setFill(Color.DARKGREEN); break;
           case 4: circle2.setFill(Color.DARKBLUE); break;
       } 
      
       switch (col3){
           case 1: circle3.setFill(Color.DARKORANGE); break;
           case 2: circle3.setFill(Color.DARKBLUE); break;
           case 3: circle3.setFill(Color.MAROON); break;
           case 4: circle3.setFill(Color.DARKGREEN); break;
       }  
       
      switch (col4){
           case 1: circle4.setFill(Color.DARKBLUE); break;
           case 2: circle4.setFill(Color.DARKGREEN); break;
           case 3: circle4.setFill(Color.DARKORANGE); break;
           case 4: circle4.setFill(Color.MAROON); break;
       }  
      
      switch (col5){
           case 1: circle5.setFill(Color.DARKGREEN); break;
           case 2: circle5.setFill(Color.MAROON); break;
           case 3: circle5.setFill(Color.DARKBLUE); break;
           case 4: circle5.setFill(Color.DARKORANGE); break;
       }
              
    }
        public void setLabel(Label label) {
        lblTimer = label;
            }       

        // enble controls
        public void resume(){
        play.setDisable(false);
        hbox.setDisable(false);
        oddChoice.setDisable(false);
        }
        
        public void hideStack(){
        stack1.setVisible(false);
        stack2.setVisible(false);
        stack3.setVisible(false);
        stack4.setVisible(false);
        stack5.setVisible(false);    
        }
        
        //animation
        public void keyChain() throws InterruptedException{
         fade1 = new FadeTransition(Duration.seconds(12), stack1);
        stack1.setVisible(true);
        fade1.setFromValue(0);
        fade1.setToValue(0.9);
        fade1.setAutoReverse(false);
        
        fade2 = new FadeTransition(Duration.seconds(12), stack2);
        stack2.setVisible(true);
        fade2.setFromValue(0);
        fade2.setToValue(0.9);
        fade2.setAutoReverse(false);
        
        fade3 = new FadeTransition(Duration.seconds(12), stack3);
        stack3.setVisible(true);
        fade3.setFromValue(0);
        fade3.setToValue(0.9);
        fade3.setAutoReverse(false);
        
        fade4 = new FadeTransition(Duration.seconds(12), stack4);
        stack4.setVisible(true);
        fade4.setFromValue(0);
        fade4.setToValue(0.9);
        fade4.setAutoReverse(false);
        
        fade5 = new FadeTransition(Duration.seconds(12), stack5);
        stack5.setVisible(true);
        fade5.setFromValue(0);
        fade5.setToValue(0.9);
        fade5.setAutoReverse(false);
        
        order = new SequentialTransition(fade1,fade2,fade3,fade4,fade5);
        order.setAutoReverse(false);
        order.setInterpolator(Interpolator.EASE_IN);
        order.setOnFinished((ActionEvent e)->{resume();});
        order.play();
      
        
       
        }
        
        public void setPlayer(String player){
        lblTimer.setText(player);
        }
}
    

