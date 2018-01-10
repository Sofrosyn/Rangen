/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redge;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import dbconnect.DBHandler;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author pecwill-tech
 */
public class LOGINController implements Initializable {

    @FXML
    private JFXButton login;
    @FXML
    private JFXCheckBox check;
    @FXML
    private JFXButton signUp;
    @FXML
    private JFXPasswordField password;
    @FXML
    private JFXTextField username;
    @FXML
    private Label text;

    DBHandler handle = new DBHandler();
    @FXML
    private FontAwesomeIconView exit;
    /**
     * Initializes the controller class.
     */
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       text.setVisible(false);
        if (handle.isDatabaseConnected()){
            System.out.println("is databe connected");
            
            
        } else {
           System.out.println("not databe connected");
           text.setText("invalid username/password");
           text.setTextFill(Color.MAROON);
        }
       
    }    

    @FXML
    private void loginAction(ActionEvent event) throws SQLException, ClassNotFoundException, Exception {
       ((Node) event.getSource()).getScene().getWindow().hide();
        Login();
    }

   private void getUser(String text){
   text = username.getText();
   } 
           
    @FXML
    private void signUp(ActionEvent event) throws IOException {
        ((Node) event.getSource()).getScene().getWindow().hide();
        Stage signup = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/gui/signup_page.fxml"));
        Scene scene = new Scene(root,484,453);
        signup.initStyle(StageStyle.TRANSPARENT);
        signup.setScene(scene);
        signup.show();
        
        
        
    }
    
    @FXML
    private void remCheck(ActionEvent event) {
        String user,pass;
        user = username.getText();
        pass = password.getText();
        if(check.isSelected()){
           username.setText(user);
           password.setText(pass);
        }else{
           username.setText(null);
           password.setText(null);  
            
        }
    }
    
    public void Login() throws Exception{
   try{
        if (handle.checkLoginData(username.getText(), password.getText()) ){
                try{
            
                    Stage userStage = new Stage();
            FXMLLoader loader = new FXMLLoader();
            Pane root = (Pane)loader.load(getClass().getResource("/gui/Bet.fxml").openStream());
            BetController betController = (BetController)loader.getController();
            betController.setPlayer(username.getText());
            Scene scene = new Scene(root);
            userStage.setScene(scene);
            userStage.setTitle("ADMINISRATION");
            userStage.setResizable(false);
            userStage.show();
        } catch (IOException e){
            e.printStackTrace();
        }
                
       }else {
     JOptionPane.showMessageDialog(null, "Invalid username / password", "ATTENTION", JOptionPane.ERROR_MESSAGE); 
              }
    }catch (Exception e){ e.printStackTrace();}
    }  

    @FXML
    private void exitHandler(MouseEvent event) {
    System.exit(2);
    }
    
    
    
    }

