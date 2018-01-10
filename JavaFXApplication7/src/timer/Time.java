/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timer;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.util.Duration;

/**
 *
 * @author pecwill-tech
 */
public class Time implements Runnable{

    private static final Integer STARTTIME = 15;
    private Timeline timeline;
    private IntegerProperty timeSeconds = new SimpleIntegerProperty(STARTTIME);

    public static void main(String[] args) {
       (new Thread(new Time())).start();
    }
    public void getTimer (Label timerLabel){
       // Bind the timerLabel text property to the timeSeconds property
        timerLabel.textProperty().bind(timeSeconds.asString());
        timerLabel.setTextFill(Color.RED);
        timerLabel.setStyle("-fx-text-fill:  #1eb818;");       
        
    
                if (timeline != null) {
                    timeline.stop();
                }else{
                timeSeconds.set(STARTTIME);
                timeline = new Timeline();
                timeline.getKeyFrames().add(
                        new KeyFrame(Duration.seconds(STARTTIME+1),
                        new KeyValue(timeSeconds, 0)));
                timeline.playFromStart();   }
            }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        

  
    
}
