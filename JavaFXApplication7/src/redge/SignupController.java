/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redge;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.controlsfx.control.textfield.CustomPasswordField;
import org.controlsfx.control.textfield.CustomTextField;

/**
 * FXML Controller class
 *
 * @author pecwill-tech
 */
public class SignupController implements Initializable {

    @FXML
    private Button but_signup;
    @FXML
    private CustomTextField txt_fname;
    @FXML
    private CustomTextField txt_lname;
    @FXML
    private CustomTextField txt_tname;
    @FXML
    private CustomTextField student_id;
    @FXML
    private ToggleGroup tog_Radio;
    @FXML
    private CustomTextField txt_add;
    @FXML
    private CustomPasswordField txt_password;
    @FXML
    private DatePicker dob;
    @FXML
    private CheckBox check;
    @FXML
    private CustomPasswordField admin_key;
    @FXML
    private Button but_login;
    @FXML
    private Label exit;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void exitAction(MouseEvent event) {
        System.exit(0);
    }

    @FXML
    private void signupHandler(ActionEvent event)  {
    }

    @FXML
    private void loginHandler(ActionEvent event) throws IOException {
         ((Node) event.getSource()).getScene().getWindow().hide();
        Stage signup = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/gui/LOGIN.fxml"));
        Scene scene = new Scene(root,386,451);
        signup.initStyle(StageStyle.TRANSPARENT);
        signup.setScene(scene);
        signup.show();
        }
        
    }
    

