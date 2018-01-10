/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redge;


/**
 *
 * @author pecwill-tech
 */
 import java.util.Timer;
import java.util.TimerTask;
import javafx.application.Platform;
import javafx.scene.control.Label;

/**
 * Created by fatminmin on 2015/12/7.
 */
public class CountDownTimer {

    static private CountDownTimer mCountDownTimer;

    private Timer mTimer;
    private Label mLabel;
    private int timeLeft;

    public void start() {
        if (mTimer == null) {
            mTimer = new Timer();
            mTimer.schedule(new TimerTask() {
                @Override
                public void run() {
                    timeLeft--;
                    end();
                    Platform.runLater(() -> {
                        mLabel.setText(formatTime());
                    });
                }
            }, 1000, 1000);
        }
    }
    public void pause() {
        if (mTimer != null) {
            mTimer.cancel();
            mTimer = null;
        }
    }
    public void reset() {
        timeLeft = 6;
    }
    public void stop() {
        pause();
    }
    public void setLabel(Label label) {
        mLabel = label;
    }
    public CountDownTimer() {
        timeLeft = 30;
    }
    public void end(){
        if (timeLeft == 0){
            stop();
            
    }
    }
    private String formatTime() {
        int minutes = timeLeft / 60;
        int seconds = timeLeft % 60;
        return String.format("%02d:%02d", minutes, seconds);
    }
    static public CountDownTimer getTimer() {
        if(mCountDownTimer == null) {
            mCountDownTimer = new CountDownTimer();
        }
        return mCountDownTimer;
    }
}


